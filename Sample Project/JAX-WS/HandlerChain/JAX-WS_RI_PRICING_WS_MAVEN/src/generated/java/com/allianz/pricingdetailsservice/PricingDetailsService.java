package com.allianz.pricingdetailsservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-000281-redhat-3
 * 2018-07-29T14:41:55.519+05:30
 * Generated source version: 3.1.11.fuse-000281-redhat-3
 * 
 */
@WebServiceClient(name = "PricingDetailsService", 
                  wsdlLocation = "file:/E:/Dhananjaya-realspeed/SOAP-Training_Allianz/new/JAX-WS_RI_PRICING_WS_MAVEN/src/main/webapp/WEB-INF/PricingDetailsService.wsdl",
                  targetNamespace = "http://www.allianz.com/PricingDetailsService/") 
public class PricingDetailsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.allianz.com/PricingDetailsService/", "PricingDetailsService");
    public final static QName PricingDetailsServiceSOAPPort = new QName("http://www.allianz.com/PricingDetailsService/", "PricingDetailsServiceSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/Dhananjaya-realspeed/SOAP-Training_Allianz/new/JAX-WS_RI_PRICING_WS_MAVEN/src/main/webapp/WEB-INF/PricingDetailsService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PricingDetailsService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/Dhananjaya-realspeed/SOAP-Training_Allianz/new/JAX-WS_RI_PRICING_WS_MAVEN/src/main/webapp/WEB-INF/PricingDetailsService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PricingDetailsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PricingDetailsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PricingDetailsService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public PricingDetailsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PricingDetailsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PricingDetailsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns PricingDetails
     */
    @WebEndpoint(name = "PricingDetailsServiceSOAPPort")
    public PricingDetails getPricingDetailsServiceSOAPPort() {
        return super.getPort(PricingDetailsServiceSOAPPort, PricingDetails.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PricingDetails
     */
    @WebEndpoint(name = "PricingDetailsServiceSOAPPort")
    public PricingDetails getPricingDetailsServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(PricingDetailsServiceSOAPPort, PricingDetails.class, features);
    }

}
