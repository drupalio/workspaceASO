package com.bbva.zic.renapopersons.business.ws.byData;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import org.springframework.stereotype.Component;

import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.10
 * 2015-08-24T10:52:41.792-05:00
 * Generated source version: 2.6.10
 * 
 */
@Component
@WebServiceClient(name = "ConsultaCurpDetalleService", 
                  wsdlLocation = "ConsultaCurpDetalleService.wsdl",
                  targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx") 
public class ConsultaCurpDetalleService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleService");
    public final static QName ConsultaCurpDetalleServiceHttpsSoap12Endpoint = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpsSoap12Endpoint");
    public final static QName ConsultaCurpDetalleServiceHttpsSoap11Endpoint = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpsSoap11Endpoint");
    public final static QName ConsultaCurpDetalleServiceHttpsEndpoint = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpsEndpoint");
    public final static QName ConsultaCurpDetalleServiceHttpEndpoint = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpEndpoint");
    public final static QName ConsultaCurpDetalleServiceHttpSoap12Endpoint = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpSoap12Endpoint");
    public final static QName ConsultaCurpDetalleServiceHttpSoap11Endpoint = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpSoap11Endpoint");
    static {
        URL url = ConsultaCurpDetalleService.class.getResource("ConsultaCurpDetalleService.wsdl");
        if (url == null) {
            url = ConsultaCurpDetalleService.class.getClassLoader().getResource("ConsultaCurpDetalleService.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(ConsultaCurpDetalleService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "ConsultaCurpDetalleService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ConsultaCurpDetalleService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsultaCurpDetalleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaCurpDetalleService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
//    public ConsultaCurpDetalleService(WebServiceFeature ... features) {
//        super(WSDL_LOCATION, SERVICE, features);
//    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
//    public ConsultaCurpDetalleService(URL wsdlLocation, WebServiceFeature ... features) {
//        super(wsdlLocation, SERVICE, features);
//    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
//    public ConsultaCurpDetalleService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
//        super(wsdlLocation, serviceName, features);
//    }

    /**
     *
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpsSoap12Endpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpsSoap12Endpoint() {
        return super.getPort(ConsultaCurpDetalleServiceHttpsSoap12Endpoint, ConsultaCurpDetalleServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpsSoap12Endpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpsSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(ConsultaCurpDetalleServiceHttpsSoap12Endpoint, ConsultaCurpDetalleServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpsSoap11Endpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpsSoap11Endpoint() {
        return super.getPort(ConsultaCurpDetalleServiceHttpsSoap11Endpoint, ConsultaCurpDetalleServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpsSoap11Endpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(ConsultaCurpDetalleServiceHttpsSoap11Endpoint, ConsultaCurpDetalleServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpsEndpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpsEndpoint() {
        return super.getPort(ConsultaCurpDetalleServiceHttpsEndpoint, ConsultaCurpDetalleServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpsEndpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpsEndpoint(WebServiceFeature... features) {
        return super.getPort(ConsultaCurpDetalleServiceHttpsEndpoint, ConsultaCurpDetalleServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpEndpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpEndpoint() {
        return super.getPort(ConsultaCurpDetalleServiceHttpEndpoint, ConsultaCurpDetalleServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpEndpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(ConsultaCurpDetalleServiceHttpEndpoint, ConsultaCurpDetalleServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpSoap12Endpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpSoap12Endpoint() {
        return super.getPort(ConsultaCurpDetalleServiceHttpSoap12Endpoint, ConsultaCurpDetalleServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpSoap12Endpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(ConsultaCurpDetalleServiceHttpSoap12Endpoint, ConsultaCurpDetalleServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpSoap11Endpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpSoap11Endpoint() {
        return super.getPort(ConsultaCurpDetalleServiceHttpSoap11Endpoint, ConsultaCurpDetalleServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpSoap11Endpoint")
    public ConsultaCurpDetalleServicePortType getConsultaCurpDetalleServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(ConsultaCurpDetalleServiceHttpSoap11Endpoint, ConsultaCurpDetalleServicePortType.class, features);
    }

}
