<%-- 
    Document   : index
    Created on : 20/05/2019, 20:40:49
    Author     : 15104312
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora Canalha!</h1>
        <%-- start web service invocation --%><hr/>
        <%
        try {
            org.jbsystems.calculadora.CalculadoraWS_Service service = new org.jbsystems.calculadora.CalculadoraWS_Service();
            org.jbsystems.calculadora.CalculadoraWS port = service.getCalculadoraWSPort();
             // TODO initialize WS operation arguments here
            double a = 1.0d;
            double b = 2.0d;
            // TODO process result here
            double result = port.getSum(a, b);
            out.println("Result = "+result);
        } catch (Exception e) {
            out.println("exception" + e);
        }
        %>
        <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
        <%
        try {
            org.jbsystems.calculadora.CalculadoraWS_Service service = new org.jbsystems.calculadora.CalculadoraWS_Service();
            org.jbsystems.calculadora.CalculadoraWS port = service.getCalculadoraWSPort();
             // TODO initialize WS operation arguments here
            double a = 3.0d;
            double b = 4.0d;
            // TODO process result here
            double result = port.getDifference(a, b);
            out.println("Result = "+result);
        } catch (Exception e) {
            out.println("exception" + e);
        }
        %>
        <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
        <%
        try {
            org.jbsystems.calculadora.CalculadoraWS_Service service = new org.jbsystems.calculadora.CalculadoraWS_Service();
            org.jbsystems.calculadora.CalculadoraWS port = service.getCalculadoraWSPort();
             // TODO initialize WS operation arguments here
            double a = 5.0d;
            double b = 6.0d;
            // TODO process result here
            double result = port.getProduct(a, b);
            out.println("Result = "+result);
        } catch (Exception e) {
            out.println("exception" + e);
        }
        %>
        <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
        <%
        try {
            org.jbsystems.calculadora.CalculadoraWS_Service service = new org.jbsystems.calculadora.CalculadoraWS_Service();
            org.jbsystems.calculadora.CalculadoraWS port = service.getCalculadoraWSPort();
             // TODO initialize WS operation arguments here
            double a = 7.0d;
            double b = 8.0d;
            // TODO process result here
            double result = port.getQuotient(a, b);
            out.println("Result = "+result);
        } catch (Exception e) {
            out.println("exception" + e);
        }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
