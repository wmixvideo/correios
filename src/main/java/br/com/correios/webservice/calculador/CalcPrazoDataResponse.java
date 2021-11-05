
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
 *         &lt;element name="CalcPrazoDataResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrazoDataResult"
})
@XmlRootElement(name = "CalcPrazoDataResponse")
public class CalcPrazoDataResponse {

    @XmlElement(name = "CalcPrazoDataResult", required = true)
    protected CResultado calcPrazoDataResult;

    /**
     * Obtém o valor da propriedade calcPrazoDataResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrazoDataResult() {
        return calcPrazoDataResult;
    }

    /**
     * Define o valor da propriedade calcPrazoDataResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrazoDataResult(CResultado value) {
        this.calcPrazoDataResult = value;
    }

}
