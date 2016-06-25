
package br.com.correios.webservice.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de buscaEventos complex type.
 * <p>
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;complexType name="buscaEventos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaEventos", propOrder = {
        "usuario",
        "senha",
        "tipo",
        "resultado",
        "lingua",
        "objetos"
})
public class BuscaEventos {

    protected String usuario;
    protected String senha;
    protected String tipo;
    protected String resultado;
    protected String lingua;
    protected String objetos;

    /**
     * Obtém o valor da propriedade usuario.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade resultado.
     *
     * @return possible object is
     * {@link String }
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtém o valor da propriedade lingua.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLingua() {
        return lingua;
    }

    /**
     * Define o valor da propriedade lingua.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLingua(String value) {
        this.lingua = value;
    }

    /**
     * Obtém o valor da propriedade objetos.
     *
     * @return possible object is
     * {@link String }
     */
    public String getObjetos() {
        return objetos;
    }

    /**
     * Define o valor da propriedade objetos.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObjetos(String value) {
        this.objetos = value;
    }

}
