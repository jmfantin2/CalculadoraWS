
package org.jbsystems.calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getQuotient complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getQuotient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuotient", propOrder = {
    "a",
    "b"
})
public class GetQuotient {

    protected double a;
    protected double b;

    /**
     * Obtém o valor da propriedade a.
     * 
     */
    public double getA() {
        return a;
    }

    /**
     * Define o valor da propriedade a.
     * 
     */
    public void setA(double value) {
        this.a = value;
    }

    /**
     * Obtém o valor da propriedade b.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * Define o valor da propriedade b.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

}
