package br.com.correios.webservice.calculador;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cServico complex type.
 * <p>
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;complexType name="cServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrazoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntregaDomiciliar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntregaSabado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorSemAdicionais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obsFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cServico", propOrder = {
        "codigo",
        "valor",
        "prazoEntrega",
        "valorMaoPropria",
        "valorAvisoRecebimento",
        "valorValorDeclarado",
        "entregaDomiciliar",
        "entregaSabado",
        "erro",
        "msgErro",
        "valorSemAdicionais",
        "obsFim"
})
public class CServico {

    @XmlElement(name = "Codigo")
    protected int codigo;
    @XmlElement(name = "Valor")
    protected String valor;
    @XmlElement(name = "PrazoEntrega")
    protected String prazoEntrega;
    @XmlElement(name = "ValorMaoPropria")
    protected String valorMaoPropria;
    @XmlElement(name = "ValorAvisoRecebimento")
    protected String valorAvisoRecebimento;
    @XmlElement(name = "ValorValorDeclarado")
    protected String valorValorDeclarado;
    @XmlElement(name = "EntregaDomiciliar")
    protected String entregaDomiciliar;
    @XmlElement(name = "EntregaSabado")
    protected String entregaSabado;
    @XmlElement(name = "Erro")
    protected String erro;
    @XmlElement(name = "MsgErro")
    protected String msgErro;
    @XmlElement(name = "ValorSemAdicionais")
    protected String valorSemAdicionais;
    protected String obsFim;

    /**
     * Obtém o valor da propriedade codigo.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValor(String value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade prazoEntrega.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    /**
     * Define o valor da propriedade prazoEntrega.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrazoEntrega(String value) {
        this.prazoEntrega = value;
    }

    /**
     * Obtém o valor da propriedade valorMaoPropria.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValorMaoPropria() {
        return valorMaoPropria;
    }

    /**
     * Define o valor da propriedade valorMaoPropria.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValorMaoPropria(String value) {
        this.valorMaoPropria = value;
    }

    /**
     * Obtém o valor da propriedade valorAvisoRecebimento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValorAvisoRecebimento() {
        return valorAvisoRecebimento;
    }

    /**
     * Define o valor da propriedade valorAvisoRecebimento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValorAvisoRecebimento(String value) {
        this.valorAvisoRecebimento = value;
    }

    /**
     * Obtém o valor da propriedade valorValorDeclarado.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValorValorDeclarado() {
        return valorValorDeclarado;
    }

    /**
     * Define o valor da propriedade valorValorDeclarado.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValorValorDeclarado(String value) {
        this.valorValorDeclarado = value;
    }

    /**
     * Obtém o valor da propriedade entregaDomiciliar.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntregaDomiciliar() {
        return entregaDomiciliar;
    }

    /**
     * Define o valor da propriedade entregaDomiciliar.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntregaDomiciliar(String value) {
        this.entregaDomiciliar = value;
    }

    /**
     * Obtém o valor da propriedade entregaSabado.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntregaSabado() {
        return entregaSabado;
    }

    /**
     * Define o valor da propriedade entregaSabado.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntregaSabado(String value) {
        this.entregaSabado = value;
    }

    /**
     * Obtém o valor da propriedade erro.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErro() {
        return erro;
    }

    /**
     * Define o valor da propriedade erro.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErro(String value) {
        this.erro = value;
    }

    /**
     * Obtém o valor da propriedade msgErro.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMsgErro() {
        return msgErro;
    }

    /**
     * Define o valor da propriedade msgErro.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMsgErro(String value) {
        this.msgErro = value;
    }

    /**
     * Obtém o valor da propriedade valorSemAdicionais.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValorSemAdicionais() {
        return valorSemAdicionais;
    }

    /**
     * Define o valor da propriedade valorSemAdicionais.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValorSemAdicionais(String value) {
        this.valorSemAdicionais = value;
    }

    /**
     * Obtém o valor da propriedade obsFim.
     *
     * @return possible object is
     * {@link String }
     */
    public String getObsFim() {
        return obsFim;
    }

    /**
     * Define o valor da propriedade obsFim.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObsFim(String value) {
        this.obsFim = value;
    }

}
