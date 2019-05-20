/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorawsclient;

/**
 *
 * @author 15104312
 */
public class CalculadoraWSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            double a = 1;
            double b = 2;
            double result = getSum(a,b);
            System.out.println("Resultado = " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    private static double getDifference(double a, double b) {
        org.jbsystems.calculadora.CalculadoraWS_Service service = new org.jbsystems.calculadora.CalculadoraWS_Service();
        org.jbsystems.calculadora.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getDifference(a, b);
    }

    private static double getSum(double a, double b) {
        org.jbsystems.calculadora.CalculadoraWS_Service service = new org.jbsystems.calculadora.CalculadoraWS_Service();
        org.jbsystems.calculadora.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getSum(a, b);
    }

    private static double getDifference_1(double a, double b) {
        org.jbsystems.calculadora.CalculadoraWS_Service service = new org.jbsystems.calculadora.CalculadoraWS_Service();
        org.jbsystems.calculadora.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getDifference(a, b);
    }

    private static double getProduct(double a, double b) {
        org.jbsystems.calculadora.CalculadoraWS_Service service = new org.jbsystems.calculadora.CalculadoraWS_Service();
        org.jbsystems.calculadora.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getProduct(a, b);
    }
    
}
