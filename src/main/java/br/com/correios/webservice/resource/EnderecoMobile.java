
package br.com.correios.webservice.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enderecoMobile complex type.
 * <p>
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;complexType name="enderecoMobile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enderecoMobile", propOrder = {
        "codigo",
        "cep",
        "logradouro",
        "complemento",
        "numero",
        "localidade",
        "uf",
        "bairro",
        "latitude",
        "longitude",
        "celular"
})
public class EnderecoMobile {

    protected String codigo;
    protected String cep;
    protected String logradouro;
    protected String complemento;
    protected String numero;
    protected String localidade;
    protected String uf;
    protected String bairro;
    protected String latitude;
    protected String longitude;
    protected String celular;

    /**
     * Obtém o valor da propriedade codigo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade logradouro.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Define o valor da propriedade logradouro.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLogradouro(String value) {
        this.logradouro = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade localidade.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * Define o valor da propriedade localidade.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocalidade(String value) {
        this.localidade = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade celular.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define o valor da propriedade celular.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCelular(String value) {
        this.celular = value;
    }

}
