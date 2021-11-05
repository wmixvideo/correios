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
 *         &lt;element name="CalcPrecoDataResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrecoDataResult"
})
@XmlRootElement(name = "CalcPrecoDataResponse")
public class CalcPrecoDataResponse {

    @XmlElement(name = "CalcPrecoDataResult", required = true)
    protected CResultado calcPrecoDataResult;

    /**
     * Obtém o valor da propriedade calcPrecoDataResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrecoDataResult() {
        return calcPrecoDataResult;
    }

    /**
     * Define o valor da propriedade calcPrecoDataResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrecoDataResult(CResultado value) {
        this.calcPrecoDataResult = value;
    }

}
