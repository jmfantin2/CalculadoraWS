/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbsystems.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author 15104312
 */
@WebService(serviceName = "CalculadoraWS")
@Stateless()
public class CalculadoraWS {

    /**
     * Realiza a soma de duas entradas
     */
    @WebMethod(operationName = "getSum")
    public double getSum(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        double sum = a + b;
        return sum;
    }
    
    /**
     * Realiza a subtração de duas entradas
     */
    @WebMethod(operationName = "getDifference")
    public double getDifference(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        double difference = a - b;
        return difference;
    }    

    /**
     * Realiza a multiplicação de duas entradas
     */
    @WebMethod(operationName = "getProduct")
    public double getProduct(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        double product = a * b;
        return product;
    }
        
    /**
     * Realiza a divisão de duas entradas
     */
    @WebMethod(operationName = "getQuotient")
    public double getQuotient(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        double quotient = a / b;
        return quotient;
    }
}
