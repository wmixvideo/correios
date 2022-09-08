package com.github.wmixvideo.correios;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel pelas chamadas aos webservices dos Correios.
 */
public class WMXCorreios {

    private final HttpClient client;
    private int timeout = 15;

    public WMXCorreios() {
        this.client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).followRedirects(HttpClient.Redirect.NORMAL).build();
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
     * Retorna a lista de servicos que os Correios prestam.
     *
     * @throws WMXCorreiosException Caso erro.
     */
    public List<WMXCorreiosServicoCalculo> listaServicos() throws WMXCorreiosException {
        final String body = """
                <?xml version= "1.0" encoding= "utf-8"?>
                <soap12:Envelope xmlns:soap12= "http://www.w3.org/2003/05/soap-envelope">
                    <soap12:Body>
                        <ListaServicos xmlns= "http://tempuri.org/" />
                    </soap12:Body>
                </soap12:Envelope>
                """;
        try {
            final HttpRequest request = HttpRequest.newBuilder().uri(new URI("http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx")).POST(HttpRequest.BodyPublishers.ofString(body)).header("Content-Type", "text/xml; charset=utf-8").header("SOAPAction", "http://tempuri.org/ListaServicos").timeout(Duration.ofSeconds(timeout)).build();
            final HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());

            // instancia o factory
            final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);// optional, but recommended, process XML securely, avoid attacks like XML External Entities (XXE)

            // parseia arquivo
            final Document document = dbf.newDocumentBuilder().parse(response.body());
            document.getDocumentElement().normalize();// optional, but recommended: http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work

            // percore os nodos transformando-os em uma classe
            final NodeList list = document.getElementsByTagName("cServicosCalculo");
            final List<WMXCorreiosServicoCalculo> servicos = new ArrayList<>();
            for (int i = 0; i < list.getLength(); i++) {
                final Node node = list.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    final Element element = (Element) node;

                    final String codigo = element.getElementsByTagName("codigo").item(0).getTextContent().trim();
                    final String descricao = element.getElementsByTagName("descricao").item(0).getTextContent().trim();
                    final boolean calculaPreco = "S".equalsIgnoreCase(element.getElementsByTagName("calcula_preco").item(0).getTextContent().trim());
                    final boolean calculaPrazo = "S".equalsIgnoreCase(element.getElementsByTagName("calcula_prazo").item(0).getTextContent().trim());
                    servicos.add(new WMXCorreiosServicoCalculo(codigo, descricao, calculaPreco, calculaPrazo));
                }
            }
            return servicos;
        } catch (Throwable t) {
            throw new WMXCorreiosException(t);
        }
    }
}
