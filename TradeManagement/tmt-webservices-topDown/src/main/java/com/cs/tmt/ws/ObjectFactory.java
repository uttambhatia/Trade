
package com.cs.tmt.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cs.tmt.ws package. 
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

    private final static QName _GetInfoDataRequest_QNAME = new QName("http://ws.tmt.cs.com", "getInfoDataRequest");
    private final static QName _GetInfoDataResponse_QNAME = new QName("http://ws.tmt.cs.com", "getInfoDataResponse");
    private final static QName _GetInfoDataDetailsRequest_QNAME = new QName("http://ws.tmt.cs.com", "getInfoDataDetailsRequest");
    private final static QName _GetInfoDataDetailsResponse_QNAME = new QName("http://ws.tmt.cs.com", "getInfoDataDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cs.tmt.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoDataRequest }
     * 
     */
    public GetInfoDataRequest createGetInfoDataRequest() {
        return new GetInfoDataRequest();
    }

    /**
     * Create an instance of {@link GetInfoDataResponse }
     * 
     */
    public GetInfoDataResponse createGetInfoDataResponse() {
        return new GetInfoDataResponse();
    }

    /**
     * Create an instance of {@link GetInfoDataDetailsRequest }
     * 
     */
    public GetInfoDataDetailsRequest createGetInfoDataDetailsRequest() {
        return new GetInfoDataDetailsRequest();
    }

    /**
     * Create an instance of {@link GetInfoDataDetailsResponse }
     * 
     */
    public GetInfoDataDetailsResponse createGetInfoDataDetailsResponse() {
        return new GetInfoDataDetailsResponse();
    }

    /**
     * Create an instance of {@link InfoData }
     * 
     */
    public InfoData createInfoData() {
        return new InfoData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tmt.cs.com", name = "getInfoDataRequest")
    public JAXBElement<GetInfoDataRequest> createGetInfoDataRequest(GetInfoDataRequest value) {
        return new JAXBElement<GetInfoDataRequest>(_GetInfoDataRequest_QNAME, GetInfoDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tmt.cs.com", name = "getInfoDataResponse")
    public JAXBElement<GetInfoDataResponse> createGetInfoDataResponse(GetInfoDataResponse value) {
        return new JAXBElement<GetInfoDataResponse>(_GetInfoDataResponse_QNAME, GetInfoDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDataDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tmt.cs.com", name = "getInfoDataDetailsRequest")
    public JAXBElement<GetInfoDataDetailsRequest> createGetInfoDataDetailsRequest(GetInfoDataDetailsRequest value) {
        return new JAXBElement<GetInfoDataDetailsRequest>(_GetInfoDataDetailsRequest_QNAME, GetInfoDataDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDataDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tmt.cs.com", name = "getInfoDataDetailsResponse")
    public JAXBElement<GetInfoDataDetailsResponse> createGetInfoDataDetailsResponse(GetInfoDataDetailsResponse value) {
        return new JAXBElement<GetInfoDataDetailsResponse>(_GetInfoDataDetailsResponse_QNAME, GetInfoDataDetailsResponse.class, null, value);
    }

}
