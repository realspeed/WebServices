
package com.allianz.pricingdetailsservice.datamodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.allianz.pricingdetailsservice.datamodel package. 
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

    private final static QName _PricingInput_QNAME = new QName("http://www.allianz.com/PricingDetailsService/datamodel", "pricing-input");
    private final static QName _PricingOutput_QNAME = new QName("http://www.allianz.com/PricingDetailsService/datamodel", "pricing-output");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.allianz.pricingdetailsservice.datamodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PricingInputType }
     * 
     */
    public PricingInputType createPricingInputType() {
        return new PricingInputType();
    }

    /**
     * Create an instance of {@link PricingOutputType }
     * 
     */
    public PricingOutputType createPricingOutputType() {
        return new PricingOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.allianz.com/PricingDetailsService/datamodel", name = "pricing-input")
    public JAXBElement<PricingInputType> createPricingInput(PricingInputType value) {
        return new JAXBElement<PricingInputType>(_PricingInput_QNAME, PricingInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.allianz.com/PricingDetailsService/datamodel", name = "pricing-output")
    public JAXBElement<PricingOutputType> createPricingOutput(PricingOutputType value) {
        return new JAXBElement<PricingOutputType>(_PricingOutput_QNAME, PricingOutputType.class, null, value);
    }

}
