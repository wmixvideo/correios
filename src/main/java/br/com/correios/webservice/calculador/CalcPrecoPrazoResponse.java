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
 *         &lt;element name="CalcPrecoPrazoResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrecoPrazoResult"
})
@XmlRootElement(name = "CalcPrecoPrazoResponse")
public class CalcPrecoPrazoResponse {

    @XmlElement(name = "CalcPrecoPrazoResult", required = true)
    protected CResultado calcPrecoPrazoResult;

    /**
     * Obtém o valor da propriedade calcPrecoPrazoResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrecoPrazoResult() {
        return calcPrecoPrazoResult;
    }

    /**
     * Define o valor da propriedade calcPrecoPrazoResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrecoPrazoResult(CResultado value) {
        this.calcPrecoPrazoResult = value;
    }

}
