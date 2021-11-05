
package br.com.correios.webservice.rastro;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ListaEntregaExternaResponse complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ListaEntregaExternaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://resource.webservice.correios.com.br/}listaEntregaExterna" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaEntregaExternaResponse", propOrder = {
    "_return"
})
public class ListaEntregaExternaResponse {

    @XmlElement(name = "return")
    protected ListaEntregaExterna2 _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link ListaEntregaExterna2 }
     *     
     */
    public ListaEntregaExterna2 getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaEntregaExterna2 }
     *     
     */
    public void setReturn(ListaEntregaExterna2 value) {
        this._return = value;
    }

}
