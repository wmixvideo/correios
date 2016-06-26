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
 *         &lt;element name="sCepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDtCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "nCdServico",
        "sCepOrigem",
        "sCepDestino",
        "sDtCalculo"
})
@XmlRootElement(name = "CalcPrazoData")
public class CalcPrazoData {

    protected String nCdServico;
    protected String sCepOrigem;
    protected String sCepDestino;
    protected String sDtCalculo;

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
     * Obtém o valor da propriedade sCepOrigem.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSCepOrigem() {
        return sCepOrigem;
    }

    /**
     * Define o valor da propriedade sCepOrigem.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSCepOrigem(String value) {
        this.sCepOrigem = value;
    }

    /**
     * Obtém o valor da propriedade sCepDestino.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSCepDestino() {
        return sCepDestino;
    }

    /**
     * Define o valor da propriedade sCepDestino.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSCepDestino(String value) {
        this.sCepDestino = value;
    }

    /**
     * Obtém o valor da propriedade sDtCalculo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSDtCalculo() {
        return sDtCalculo;
    }

    /**
     * Define o valor da propriedade sDtCalculo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSDtCalculo(String value) {
        this.sDtCalculo = value;
    }

}
