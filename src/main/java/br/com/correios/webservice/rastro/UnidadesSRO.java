
package br.com.correios.webservice.rastro;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UnidadesSRO complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UnidadesSRO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoSRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadesSRO", propOrder = {
    "codigoSRO"
})
public class UnidadesSRO {

    protected String codigoSRO;

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

}
