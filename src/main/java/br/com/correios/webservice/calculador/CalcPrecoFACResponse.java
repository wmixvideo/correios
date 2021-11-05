package br.com.correios.webservice.calculador;

import jakarta.xml.bind.annotation.*;


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
 *         &lt;element name="CalcPrecoFACResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrecoFACResult"
})
@XmlRootElement(name = "CalcPrecoFACResponse")
public class CalcPrecoFACResponse {

    @XmlElement(name = "CalcPrecoFACResult", required = true)
    protected CResultado calcPrecoFACResult;

    /**
     * Obtém o valor da propriedade calcPrecoFACResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrecoFACResult() {
        return calcPrecoFACResult;
    }

    /**
     * Define o valor da propriedade calcPrecoFACResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrecoFACResult(CResultado value) {
        this.calcPrecoFACResult = value;
    }

}
