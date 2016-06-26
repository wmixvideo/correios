package br.com.correios.webservice.calculador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * <p>
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nCdServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nVlPeso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDataCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "nCdServico",
        "nVlPeso",
        "strDataCalculo"
})
@XmlRootElement(name = "CalcPrecoFAC")
public class CalcPrecoFAC {

    protected String nCdServico;
    protected String nVlPeso;
    protected String strDataCalculo;

    /**
     * Obtém o valor da propriedade nCdServico.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNCdServico() {
        return nCdServico;
    }

    /**
     * Define o valor da propriedade nCdServico.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNCdServico(String value) {
        this.nCdServico = value;
    }

    /**
     * Obtém o valor da propriedade nVlPeso.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNVlPeso() {
        return nVlPeso;
    }

    /**
     * Define o valor da propriedade nVlPeso.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNVlPeso(String value) {
        this.nVlPeso = value;
    }

    /**
     * Obtém o valor da propriedade strDataCalculo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStrDataCalculo() {
        return strDataCalculo;
    }

    /**
     * Define o valor da propriedade strDataCalculo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStrDataCalculo(String value) {
        this.strDataCalculo = value;
    }

}
