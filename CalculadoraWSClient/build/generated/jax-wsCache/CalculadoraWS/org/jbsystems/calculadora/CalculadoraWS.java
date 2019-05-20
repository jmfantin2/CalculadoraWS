
package org.jbsystems.calculadora;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculadoraWS", targetNamespace = "http://calculadora.jbsystems.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculadoraWS {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://calculadora.jbsystems.org/", className = "org.jbsystems.calculadora.GetProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://calculadora.jbsystems.org/", className = "org.jbsystems.calculadora.GetProductResponse")
    @Action(input = "http://calculadora.jbsystems.org/CalculadoraWS/getProductRequest", output = "http://calculadora.jbsystems.org/CalculadoraWS/getProductResponse")
    public double getProduct(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSum", targetNamespace = "http://calculadora.jbsystems.org/", className = "org.jbsystems.calculadora.GetSum")
    @ResponseWrapper(localName = "getSumResponse", targetNamespace = "http://calculadora.jbsystems.org/", className = "org.jbsystems.calculadora.GetSumResponse")
    @Action(input = "http://calculadora.jbsystems.org/CalculadoraWS/getSumRequest", output = "http://calculadora.jbsystems.org/CalculadoraWS/getSumResponse")
    public double getSum(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDifference", targetNamespace = "http://calculadora.jbsystems.org/", className = "org.jbsystems.calculadora.GetDifference")
    @ResponseWrapper(localName = "getDifferenceResponse", targetNamespace = "http://calculadora.jbsystems.org/", className = "org.jbsystems.calculadora.GetDifferenceResponse")
    @Action(input = "http://calculadora.jbsystems.org/CalculadoraWS/getDifferenceRequest", output = "http://calculadora.jbsystems.org/CalculadoraWS/getDifferenceResponse")
    public double getDifference(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuotient", targetNamespace = "http://calculadora.jbsystems.org/", className = "org.jbsystems.calculadora.GetQuotient")
    @ResponseWrapper(localName = "getQuotientResponse", targetNamespace = "http://calculadora.jbsystems.org/", className = "org.jbsystems.calculadora.GetQuotientResponse")
    @Action(input = "http://calculadora.jbsystems.org/CalculadoraWS/getQuotientRequest", output = "http://calculadora.jbsystems.org/CalculadoraWS/getQuotientResponse")
    public double getQuotient(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

}
