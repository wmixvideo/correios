
package br.com.correios.webservice.rastro;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de listaEntregaExterna complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listaEntregaExterna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carteiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCarteiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUnidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetos" type="{http://resource.webservice.correios.com.br/}objetoPostal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaEntregaExterna", propOrder = {
    "carteiro",
    "data",
    "distrito",
    "estacao",
    "id",
    "loec",
    "nomeCarteiro",
    "nomeUnidade",
    "objetos",
    "unidade"
})
public class ListaEntregaExterna2 {

    protected String carteiro;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected String distrito;
    protected String estacao;
    protected String id;
    protected String loec;
    protected String nomeCarteiro;
    protected String nomeUnidade;
    @XmlElement(nillable = true)
    protected List<ObjetoPostal> objetos;
    protected String unidade;

    /**
     * Obtém o valor da propriedade carteiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarteiro() {
        return carteiro;
    }

    /**
     * Define o valor da propriedade carteiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarteiro(String value) {
        this.carteiro = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade distrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Define o valor da propriedade distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrito(String value) {
        this.distrito = value;
    }

    /**
     * Obtém o valor da propriedade estacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacao() {
        return estacao;
    }

    /**
     * Define o valor da propriedade estacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacao(String value) {
        this.estacao = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade loec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoec() {
        return loec;
    }

    /**
     * Define o valor da propriedade loec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoec(String value) {
        this.loec = value;
    }

    /**
     * Obtém o valor da propriedade nomeCarteiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCarteiro() {
        return nomeCarteiro;
    }

    /**
     * Define o valor da propriedade nomeCarteiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCarteiro(String value) {
        this.nomeCarteiro = value;
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
     * Gets the value of the objetos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objetos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjetos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjetoPostal }
     * 
     * 
     */
    public List<ObjetoPostal> getObjetos() {
        if (objetos == null) {
            objetos = new ArrayList<ObjetoPostal>();
        }
        return this.objetos;
    }

    /**
     * Obtém o valor da propriedade unidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidade(String value) {
        this.unidade = value;
    }

}
