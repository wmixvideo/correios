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
 *         &lt;element name="CalcPrecoPrazoRestricaoResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrecoPrazoRestricaoResult"
})
@XmlRootElement(name = "CalcPrecoPrazoRestricaoResponse")
public class CalcPrecoPrazoRestricaoResponse {

    @XmlElement(name = "CalcPrecoPrazoRestricaoResult", required = true)
    protected CResultado calcPrecoPrazoRestricaoResult;

    /**
     * Obtém o valor da propriedade calcPrecoPrazoRestricaoResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrecoPrazoRestricaoResult() {
        return calcPrecoPrazoRestricaoResult;
    }

    /**
     * Define o valor da propriedade calcPrecoPrazoRestricaoResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrecoPrazoRestricaoResult(CResultado value) {
        this.calcPrecoPrazoRestricaoResult = value;
    }

}
