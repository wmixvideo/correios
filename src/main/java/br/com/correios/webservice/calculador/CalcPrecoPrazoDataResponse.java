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
 *         &lt;element name="CalcPrecoPrazoDataResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrecoPrazoDataResult"
})
@XmlRootElement(name = "CalcPrecoPrazoDataResponse")
public class CalcPrecoPrazoDataResponse {

    @XmlElement(name = "CalcPrecoPrazoDataResult", required = true)
    protected CResultado calcPrecoPrazoDataResult;

    /**
     * Obtém o valor da propriedade calcPrecoPrazoDataResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrecoPrazoDataResult() {
        return calcPrecoPrazoDataResult;
    }

    /**
     * Define o valor da propriedade calcPrecoPrazoDataResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrecoPrazoDataResult(CResultado value) {
        this.calcPrecoPrazoDataResult = value;
    }

}
