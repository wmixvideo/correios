
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
 *         &lt;element name="CalcPrazoRestricaoResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrazoRestricaoResult"
})
@XmlRootElement(name = "CalcPrazoRestricaoResponse")
public class CalcPrazoRestricaoResponse {

    @XmlElement(name = "CalcPrazoRestricaoResult", required = true)
    protected CResultado calcPrazoRestricaoResult;

    /**
     * Obtém o valor da propriedade calcPrazoRestricaoResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrazoRestricaoResult() {
        return calcPrazoRestricaoResult;
    }

    /**
     * Define o valor da propriedade calcPrazoRestricaoResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrazoRestricaoResult(CResultado value) {
        this.calcPrazoRestricaoResult = value;
    }

}
