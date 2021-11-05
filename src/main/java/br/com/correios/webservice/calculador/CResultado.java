package br.com.correios.webservice.calculador;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cResultado complex type.
 * <p>
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;complexType name="cResultado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Servicos" type="{http://tempuri.org/}ArrayOfCServico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cResultado", propOrder = {
        "servicos"
})
public class CResultado {

    @XmlElement(name = "Servicos")
    protected ArrayOfCServico servicos;

    /**
     * Obtém o valor da propriedade servicos.
     *
     * @return possible object is
     * {@link ArrayOfCServico }
     */
    public ArrayOfCServico getServicos() {
        return servicos;
    }

    /**
     * Define o valor da propriedade servicos.
     *
     * @param value allowed object is
     *              {@link ArrayOfCServico }
     */
    public void setServicos(ArrayOfCServico value) {
        this.servicos = value;
    }

}
