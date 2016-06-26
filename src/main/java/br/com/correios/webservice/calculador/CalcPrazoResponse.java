
package br.com.correios.webservice.calculador;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="CalcPrazoResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrazoResult"
})
@XmlRootElement(name = "CalcPrazoResponse")
public class CalcPrazoResponse {

    @XmlElement(name = "CalcPrazoResult", required = true)
    protected CResultado calcPrazoResult;

    /**
     * Obtém o valor da propriedade calcPrazoResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrazoResult() {
        return calcPrazoResult;
    }

    /**
     * Define o valor da propriedade calcPrazoResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrazoResult(CResultado value) {
        this.calcPrazoResult = value;
    }

}
