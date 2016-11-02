
package br.com.correios.webservice.rastro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ListaEntregaExterna complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ListaEntregaExterna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaEntregaExterna", propOrder = {
    "loec"
})
public class ListaEntregaExterna {

    protected String loec;

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

}
