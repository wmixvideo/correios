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
 *         &lt;element name="CalcPrecoResult" type="{http://tempuri.org/}cResultado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "calcPrecoResult"
})
@XmlRootElement(name = "CalcPrecoResponse")
public class CalcPrecoResponse {

    @XmlElement(name = "CalcPrecoResult", required = true)
    protected CResultado calcPrecoResult;

    /**
     * Obtém o valor da propriedade calcPrecoResult.
     *
     * @return possible object is
     * {@link CResultado }
     */
    public CResultado getCalcPrecoResult() {
        return calcPrecoResult;
    }

    /**
     * Define o valor da propriedade calcPrecoResult.
     *
     * @param value allowed object is
     *              {@link CResultado }
     */
    public void setCalcPrecoResult(CResultado value) {
        this.calcPrecoResult = value;
    }

}
