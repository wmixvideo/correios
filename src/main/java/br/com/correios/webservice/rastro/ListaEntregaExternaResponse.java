
package br.com.correios.webservice.rastro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ListaEntregaExternaResponse complex type.
 * <p>
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
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
     * @return possible object is
     * {@link ListaEntregaExterna2 }
     */
    public ListaEntregaExterna2 getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     *
     * @param value allowed object is
     *              {@link ListaEntregaExterna2 }
     */
    public void setReturn(ListaEntregaExterna2 value) {
        this._return = value;
    }

}
