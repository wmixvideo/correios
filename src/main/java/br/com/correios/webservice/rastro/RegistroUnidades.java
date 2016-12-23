
package br.com.correios.webservice.rastro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de registroUnidades complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="registroUnidades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMCU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoSRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siglaTipoUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registroUnidades", propOrder = {
    "codigoDR",
    "codigoMCU",
    "codigoSRO",
    "nomeUnidade",
    "siglaDR",
    "siglaTipoUnidade",
    "tipoUnidade"
})
public class RegistroUnidades {

    protected String codigoDR;
    protected String codigoMCU;
    protected String codigoSRO;
    protected String nomeUnidade;
    protected String siglaDR;
    protected String siglaTipoUnidade;
    protected String tipoUnidade;

    /**
     * Obtém o valor da propriedade codigoDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDR() {
        return codigoDR;
    }

    /**
     * Define o valor da propriedade codigoDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDR(String value) {
        this.codigoDR = value;
    }

    /**
     * Obtém o valor da propriedade codigoMCU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMCU() {
        return codigoMCU;
    }

    /**
     * Define o valor da propriedade codigoMCU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMCU(String value) {
        this.codigoMCU = value;
    }

    /**
     * Obtém o valor da propriedade codigoSRO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSRO() {
        return codigoSRO;
    }

    /**
     * Define o valor da propriedade codigoSRO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSRO(String value) {
        this.codigoSRO = value;
    }

    /**
     * Obtém o valor da propriedade nomeUnidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUnidade() {
        return nomeUnidade;
    }

    /**
     * Define o valor da propriedade nomeUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUnidade(String value) {
        this.nomeUnidade = value;
    }

    /**
     * Obtém o valor da propriedade siglaDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaDR() {
        return siglaDR;
    }

    /**
     * Define o valor da propriedade siglaDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaDR(String value) {
        this.siglaDR = value;
    }

    /**
     * Obtém o valor da propriedade siglaTipoUnidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaTipoUnidade() {
        return siglaTipoUnidade;
    }

    /**
     * Define o valor da propriedade siglaTipoUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaTipoUnidade(String value) {
        this.siglaTipoUnidade = value;
    }

    /**
     * Obtém o valor da propriedade tipoUnidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUnidade() {
        return tipoUnidade;
    }

    /**
     * Define o valor da propriedade tipoUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUnidade(String value) {
        this.tipoUnidade = value;
    }

}
