
package br.com.correios.webservice.rastro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de objetoPostal complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="objetoPostal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agrupamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avisoRecebimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devolucaoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devolucaoObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maoPropria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoPostal", propOrder = {
    "agrupamento",
    "avisoRecebimento",
    "devolucaoDocumento",
    "devolucaoObjeto",
    "maoPropria",
    "numeroObjeto"
})
public class ObjetoPostal {

    protected String agrupamento;
    protected String avisoRecebimento;
    protected String devolucaoDocumento;
    protected String devolucaoObjeto;
    protected String maoPropria;
    protected String numeroObjeto;

    /**
     * Obtém o valor da propriedade agrupamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrupamento() {
        return agrupamento;
    }

    /**
     * Define o valor da propriedade agrupamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrupamento(String value) {
        this.agrupamento = value;
    }

    /**
     * Obtém o valor da propriedade avisoRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvisoRecebimento() {
        return avisoRecebimento;
    }

    /**
     * Define o valor da propriedade avisoRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvisoRecebimento(String value) {
        this.avisoRecebimento = value;
    }

    /**
     * Obtém o valor da propriedade devolucaoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevolucaoDocumento() {
        return devolucaoDocumento;
    }

    /**
     * Define o valor da propriedade devolucaoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevolucaoDocumento(String value) {
        this.devolucaoDocumento = value;
    }

    /**
     * Obtém o valor da propriedade devolucaoObjeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevolucaoObjeto() {
        return devolucaoObjeto;
    }

    /**
     * Define o valor da propriedade devolucaoObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevolucaoObjeto(String value) {
        this.devolucaoObjeto = value;
    }

    /**
     * Obtém o valor da propriedade maoPropria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaoPropria() {
        return maoPropria;
    }

    /**
     * Define o valor da propriedade maoPropria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaoPropria(String value) {
        this.maoPropria = value;
    }

    /**
     * Obtém o valor da propriedade numeroObjeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroObjeto() {
        return numeroObjeto;
    }

    /**
     * Define o valor da propriedade numeroObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroObjeto(String value) {
        this.numeroObjeto = value;
    }

}
