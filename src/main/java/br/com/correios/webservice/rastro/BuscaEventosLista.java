
package br.com.correios.webservice.rastro;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de buscaEventosLista complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="buscaEventosLista">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaEventosLista", propOrder = {
    "usuario",
    "senha",
    "tipo",
    "resultado",
    "lingua",
    "objetos"
})
public class BuscaEventosLista {

    protected String usuario;
    protected String senha;
    protected String tipo;
    protected String resultado;
    protected String lingua;
    protected List<String> objetos;

    /**
     * Obtém o valor da propriedade usuario.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade resultado.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtém o valor da propriedade lingua.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLingua() {
        return lingua;
    }

    /**
     * Define o valor da propriedade lingua.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLingua(String value) {
        this.lingua = value;
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
     * {@link String }
     *
     *
     */
    public List<String> getObjetos() {
        if (objetos == null) {
            objetos = new ArrayList<String>();
        }
        return this.objetos;
    }

}
