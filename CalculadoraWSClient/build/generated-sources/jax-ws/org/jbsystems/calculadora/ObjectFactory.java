
package org.jbsystems.calculadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jbsystems.calculadora package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProduct_QNAME = new QName("http://calculadora.jbsystems.org/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://calculadora.jbsystems.org/", "getProductResponse");
    private final static QName _GetDifference_QNAME = new QName("http://calculadora.jbsystems.org/", "getDifference");
    private final static QName _GetQuotientResponse_QNAME = new QName("http://calculadora.jbsystems.org/", "getQuotientResponse");
    private final static QName _GetQuotient_QNAME = new QName("http://calculadora.jbsystems.org/", "getQuotient");
    private final static QName _GetDifferenceResponse_QNAME = new QName("http://calculadora.jbsystems.org/", "getDifferenceResponse");
    private final static QName _GetSumResponse_QNAME = new QName("http://calculadora.jbsystems.org/", "getSumResponse");
    private final static QName _GetSum_QNAME = new QName("http://calculadora.jbsystems.org/", "getSum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jbsystems.calculadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link GetQuotient }
     * 
     */
    public GetQuotient createGetQuotient() {
        return new GetQuotient();
    }

    /**
     * Create an instance of {@link GetDifference }
     * 
     */
    public GetDifference createGetDifference() {
        return new GetDifference();
    }

    /**
     * Create an instance of {@link GetQuotientResponse }
     * 
     */
    public GetQuotientResponse createGetQuotientResponse() {
        return new GetQuotientResponse();
    }

    /**
     * Create an instance of {@link GetDifferenceResponse }
     * 
     */
    public GetDifferenceResponse createGetDifferenceResponse() {
        return new GetDifferenceResponse();
    }

    /**
     * Create an instance of {@link GetSum }
     * 
     */
    public GetSum createGetSum() {
        return new GetSum();
    }

    /**
     * Create an instance of {@link GetSumResponse }
     * 
     */
    public GetSumResponse createGetSumResponse() {
        return new GetSumResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jbsystems.org/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jbsystems.org/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDifference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jbsystems.org/", name = "getDifference")
    public JAXBElement<GetDifference> createGetDifference(GetDifference value) {
        return new JAXBElement<GetDifference>(_GetDifference_QNAME, GetDifference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jbsystems.org/", name = "getQuotientResponse")
    public JAXBElement<GetQuotientResponse> createGetQuotientResponse(GetQuotientResponse value) {
        return new JAXBElement<GetQuotientResponse>(_GetQuotientResponse_QNAME, GetQuotientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jbsystems.org/", name = "getQuotient")
    public JAXBElement<GetQuotient> createGetQuotient(GetQuotient value) {
        return new JAXBElement<GetQuotient>(_GetQuotient_QNAME, GetQuotient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDifferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jbsystems.org/", name = "getDifferenceResponse")
    public JAXBElement<GetDifferenceResponse> createGetDifferenceResponse(GetDifferenceResponse value) {
        return new JAXBElement<GetDifferenceResponse>(_GetDifferenceResponse_QNAME, GetDifferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jbsystems.org/", name = "getSumResponse")
    public JAXBElement<GetSumResponse> createGetSumResponse(GetSumResponse value) {
        return new JAXBElement<GetSumResponse>(_GetSumResponse_QNAME, GetSumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jbsystems.org/", name = "getSum")
    public JAXBElement<GetSum> createGetSum(GetSum value) {
        return new JAXBElement<GetSum>(_GetSum_QNAME, GetSum.class, null, value);
    }

}
