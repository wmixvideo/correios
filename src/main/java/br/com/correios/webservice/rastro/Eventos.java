
package br.com.correios.webservice.rastro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de eventos complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="eventos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalhe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recebedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amazoncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amazontimezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://resource.webservice.correios.com.br/}destino" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://resource.webservice.correios.com.br/}endereco" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventos", propOrder = {
    "tipo",
    "status",
    "data",
    "hora",
    "descricao",
    "detalhe",
    "recebedor",
    "documento",
    "comentario",
    "local",
    "codigo",
    "cidade",
    "uf",
    "sto",
    "amazoncode",
    "amazontimezone",
    "destino",
    "endereco"
})
public class Eventos {

    protected String tipo;
    protected String status;
    protected String data;
    protected String hora;
    protected String descricao;
    protected String detalhe;
    protected String recebedor;
    protected String documento;
    protected String comentario;
    protected String local;
    protected String codigo;
    protected String cidade;
    protected String uf;
    protected String sto;
    protected String amazoncode;
    protected String amazontimezone;
    @XmlElement(namespace = "http://resource.webservice.correios.com.br/")
    protected List<Destinos> destino;
    @XmlElement(namespace = "http://resource.webservice.correios.com.br/")
    protected EnderecoMobile endereco;

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
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade hora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Define o valor da propriedade hora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade detalhe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalhe() {
        return detalhe;
    }

    /**
     * Define o valor da propriedade detalhe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalhe(String value) {
        this.detalhe = value;
    }

    /**
     * Obtém o valor da propriedade recebedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecebedor() {
        return recebedor;
    }

    /**
     * Define o valor da propriedade recebedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecebedor(String value) {
        this.recebedor = value;
    }

    /**
     * Obtém o valor da propriedade documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define o valor da propriedade documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtém o valor da propriedade comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define o valor da propriedade comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade sto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSto() {
        return sto;
    }

    /**
     * Define o valor da propriedade sto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSto(String value) {
        this.sto = value;
    }

    /**
     * Obtém o valor da propriedade amazoncode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazoncode() {
        return amazoncode;
    }

    /**
     * Define o valor da propriedade amazoncode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazoncode(String value) {
        this.amazoncode = value;
    }

    /**
     * Obtém o valor da propriedade amazontimezone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazontimezone() {
        return amazontimezone;
    }

    /**
     * Define o valor da propriedade amazontimezone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazontimezone(String value) {
        this.amazontimezone = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destino property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestino().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destinos }
     * 
     * 
     */
    public List<Destinos> getDestino() {
        if (destino == null) {
            destino = new ArrayList<Destinos>();
        }
        return this.destino;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoMobile }
     *     
     */
    public EnderecoMobile getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoMobile }
     *     
     */
    public void setEndereco(EnderecoMobile value) {
        this.endereco = value;
    }

}
