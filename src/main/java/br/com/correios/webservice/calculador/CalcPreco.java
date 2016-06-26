package br.com.correios.webservice.calculador;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Classe Java de anonymous complex type.
 * <p>
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nCdEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDsSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nCdServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nVlPeso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nCdFormato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nVlComprimento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nVlAltura" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nVlLargura" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nVlDiametro" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdMaoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nVlValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sCdAvisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "nCdEmpresa",
        "sDsSenha",
        "nCdServico",
        "sCepOrigem",
        "sCepDestino",
        "nVlPeso",
        "nCdFormato",
        "nVlComprimento",
        "nVlAltura",
        "nVlLargura",
        "nVlDiametro",
        "sCdMaoPropria",
        "nVlValorDeclarado",
        "sCdAvisoRecebimento"
})
@XmlRootElement(name = "CalcPreco")
public class CalcPreco {

    protected String nCdEmpresa;
    protected String sDsSenha;
    protected String nCdServico;
    protected String sCepOrigem;
    protected String sCepDestino;
    protected String nVlPeso;
    protected int nCdFormato;
    @XmlElement(required = true)
    protected BigDecimal nVlComprimento;
    @XmlElement(required = true)
    protected BigDecimal nVlAltura;
    @XmlElement(required = true)
    protected BigDecimal nVlLargura;
    @XmlElement(required = true)
    protected BigDecimal nVlDiametro;
    protected String sCdMaoPropria;
    @XmlElement(required = true)
    protected BigDecimal nVlValorDeclarado;
    protected String sCdAvisoRecebimento;

    /**
     * Obtém o valor da propriedade nCdEmpresa.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNCdEmpresa() {
        return nCdEmpresa;
    }

    /**
     * Define o valor da propriedade nCdEmpresa.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNCdEmpresa(String value) {
        this.nCdEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade sDsSenha.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSDsSenha() {
        return sDsSenha;
    }

    /**
     * Define o valor da propriedade sDsSenha.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSDsSenha(String value) {
        this.sDsSenha = value;
    }

    /**
     * Obtém o valor da propriedade nCdServico.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNCdServico() {
        return nCdServico;
    }

    /**
     * Define o valor da propriedade nCdServico.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNCdServico(String value) {
        this.nCdServico = value;
    }

    /**
     * Obtém o valor da propriedade sCepOrigem.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSCepOrigem() {
        return sCepOrigem;
    }

    /**
     * Define o valor da propriedade sCepOrigem.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSCepOrigem(String value) {
        this.sCepOrigem = value;
    }

    /**
     * Obtém o valor da propriedade sCepDestino.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSCepDestino() {
        return sCepDestino;
    }

    /**
     * Define o valor da propriedade sCepDestino.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSCepDestino(String value) {
        this.sCepDestino = value;
    }

    /**
     * Obtém o valor da propriedade nVlPeso.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNVlPeso() {
        return nVlPeso;
    }

    /**
     * Define o valor da propriedade nVlPeso.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNVlPeso(String value) {
        this.nVlPeso = value;
    }

    /**
     * Obtém o valor da propriedade nCdFormato.
     */
    public int getNCdFormato() {
        return nCdFormato;
    }

    /**
     * Define o valor da propriedade nCdFormato.
     */
    public void setNCdFormato(int value) {
        this.nCdFormato = value;
    }

    /**
     * Obtém o valor da propriedade nVlComprimento.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getNVlComprimento() {
        return nVlComprimento;
    }

    /**
     * Define o valor da propriedade nVlComprimento.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setNVlComprimento(BigDecimal value) {
        this.nVlComprimento = value;
    }

    /**
     * Obtém o valor da propriedade nVlAltura.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getNVlAltura() {
        return nVlAltura;
    }

    /**
     * Define o valor da propriedade nVlAltura.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setNVlAltura(BigDecimal value) {
        this.nVlAltura = value;
    }

    /**
     * Obtém o valor da propriedade nVlLargura.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getNVlLargura() {
        return nVlLargura;
    }

    /**
     * Define o valor da propriedade nVlLargura.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setNVlLargura(BigDecimal value) {
        this.nVlLargura = value;
    }

    /**
     * Obtém o valor da propriedade nVlDiametro.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getNVlDiametro() {
        return nVlDiametro;
    }

    /**
     * Define o valor da propriedade nVlDiametro.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setNVlDiametro(BigDecimal value) {
        this.nVlDiametro = value;
    }

    /**
     * Obtém o valor da propriedade sCdMaoPropria.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSCdMaoPropria() {
        return sCdMaoPropria;
    }

    /**
     * Define o valor da propriedade sCdMaoPropria.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSCdMaoPropria(String value) {
        this.sCdMaoPropria = value;
    }

    /**
     * Obtém o valor da propriedade nVlValorDeclarado.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getNVlValorDeclarado() {
        return nVlValorDeclarado;
    }

    /**
     * Define o valor da propriedade nVlValorDeclarado.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setNVlValorDeclarado(BigDecimal value) {
        this.nVlValorDeclarado = value;
    }

    /**
     * Obtém o valor da propriedade sCdAvisoRecebimento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSCdAvisoRecebimento() {
        return sCdAvisoRecebimento;
    }

    /**
     * Define o valor da propriedade sCdAvisoRecebimento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSCdAvisoRecebimento(String value) {
        this.sCdAvisoRecebimento = value;
    }

}
