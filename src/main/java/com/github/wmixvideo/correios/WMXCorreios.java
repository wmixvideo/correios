package com.github.wmixvideo.correios;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel pelas chamadas aos webservices dos Correios.
 */
public class WMXCorreios {

    private static final String CORREIOS_URL_PRECOPRAZO = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx";
    private final HttpClient client;
    private int timeout;
    private String empresa, senha;

    public WMXCorreios() {
        this.client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).followRedirects(HttpClient.Redirect.NORMAL).build();
        this.timeout = 15;
        this.empresa = "";
        this.senha = "";
    }

    /**
     * Seta o timeout em segundos (padrao 15 segundos).
     *
     * @param timeout timeout em segundos.
     * @return Classe atual.
     */
    public WMXCorreios timeout(final int timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Define os dados da empresa para as consultas.
     *
     * @param empresa Codigo da empresa.
     * @param senha   Senha da empresa.
     * @return Classe atual;
     */
    public WMXCorreios empresa(final String empresa, final String senha) {
        this.empresa = empresa;
        this.senha = senha;
        return this;
    }

    private Document request(final String body) throws WMXCorreiosException {
        try {
            final HttpRequest request = HttpRequest.newBuilder().uri(new URI(CORREIOS_URL_PRECOPRAZO)).POST(HttpRequest.BodyPublishers.ofString(body)).header("Content-Type", "text/xml; charset=utf-8").timeout(Duration.ofSeconds(timeout)).build();
            final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());
            try (final InputStream stream = new ByteArrayInputStream(response.body().getBytes(StandardCharsets.UTF_8))) {
                final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);// optional, but recommended, process XML securely, avoid attacks like XML External Entities (XXE)
                final Document document = dbf.newDocumentBuilder().parse(stream);
                document.getDocumentElement().normalize();// optional, but recommended: http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
                return document;
            }
        } catch (Throwable t) {
            throw new WMXCorreiosException(t);
        }
    }

    /**
     * Retorna a lista de servicos que os Correios prestam.
     *
     * @throws WMXCorreiosException Caso erro.
     */
    public List<WMXCorreiosServicoItem> listaServicos() throws WMXCorreiosException {
        final String body = """
                <?xml version= "1.0" encoding= "utf-8"?>
                <soap12:Envelope xmlns:soap12= "http://www.w3.org/2003/05/soap-envelope">
                    <soap12:Body>
                        <ListaServicos xmlns= "http://tempuri.org/" />
                    </soap12:Body>
                </soap12:Envelope>
                """;
        final NodeList list = this.request(body).getElementsByTagName("cServicosCalculo");
        final List<WMXCorreiosServicoItem> servicos = new ArrayList<>();
        for (int i = 0; i < list.getLength(); i++) {
            final Node node = list.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                final Element element = (Element) node;
                final String codigo = element.getElementsByTagName("codigo").item(0).getTextContent().trim();
                final String descricao = element.getElementsByTagName("descricao").item(0).getTextContent().trim();
                final boolean calculaPreco = "S".equalsIgnoreCase(element.getElementsByTagName("calcula_preco").item(0).getTextContent().trim());
                final boolean calculaPrazo = "S".equalsIgnoreCase(element.getElementsByTagName("calcula_prazo").item(0).getTextContent().trim());
                servicos.add(new WMXCorreiosServicoItem(codigo, descricao, calculaPreco, calculaPrazo));
            }
        }
        return servicos;
    }


    public List<WMXCorreiosServicoPrecoPrazo> calculaPrecoPrazo(final String codigoServico, final String cepOrigem, final String cepDestino, final int peso, final WMXCorreiosFormato formato, final int comprimento, final int altura, final int largura, final int diametro, final boolean maoPropria, final BigDecimal valorDeclarado, final boolean avisoRecebimento, final LocalDate data) throws WMXCorreiosException {
        final String body = """
                <?xml version="1.0" encoding="utf-8"?>
                <soap12:Envelope xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
                  <soap12:Body>
                    <CalcPrecoPrazoData xmlns="http://tempuri.org/">
                      <nCdEmpresa>%s</nCdEmpresa>
                      <sDsSenha>%s</sDsSenha>
                      <nCdServico>%s</nCdServico>
                      <sCepOrigem>%s</sCepOrigem>
                      <sCepDestino>%s</sCepDestino>
                      <nVlPeso>%s</nVlPeso>
                      <nCdFormato>%s</nCdFormato>
                      <nVlComprimento>%s</nVlComprimento>
                      <nVlAltura>%s</nVlAltura>
                      <nVlLargura>%s</nVlLargura>
                      <nVlDiametro>%s</nVlDiametro>
                      <sCdMaoPropria>%s</sCdMaoPropria>
                      <nVlValorDeclarado>%s</nVlValorDeclarado>
                      <sCdAvisoRecebimento>%s</sCdAvisoRecebimento>
                      <sDtCalculo>%s</sDtCalculo>
                    </CalcPrecoPrazoData>
                  </soap12:Body>
                </soap12:Envelope>
                """.formatted(this.empresa, this.senha, codigoServico, cepOrigem, cepDestino, peso, formato.getCodigo(), comprimento, altura, largura, diametro, maoPropria, valorDeclarado, avisoRecebimento, data);

        final NodeList list = this.request(body).getElementsByTagName("cServico");
        final List<WMXCorreiosServicoPrecoPrazo> servicos = new ArrayList<>();
        for (int i = 0; i < list.getLength(); i++) {
            final Node node = list.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                final Element element = (Element) node;

                //FIXME: faltando terminar a implementacao
                final String codigo = element.getElementsByTagName("Codigo").item(0).getTextContent().trim();
                final int erroCodigo = Integer.parseInt(element.getElementsByTagName("Erro").item(0).getTextContent().trim());
                final String erroDescricao = element.getElementsByTagName("MsgErro").item(0).getTextContent().trim();
                //final boolean calculaPreco = "S".equalsIgnoreCase(element.getElementsByTagName("calcula_preco").item(0).getTextContent().trim());
                //final boolean calculaPrazo = "S".equalsIgnoreCase(element.getElementsByTagName("calcula_prazo").item(0).getTextContent().trim());
                servicos.add(new WMXCorreiosServicoPrecoPrazo(codigo, null, 0, null, null, null, null, false, false, null, erroCodigo, erroDescricao));
            }
        }
        return servicos;
    }
}
