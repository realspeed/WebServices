
package com.allianz.pricingdetailsservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPricingResponse", namespace = "http://www.allianz.com/PricingDetailsService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPricingResponse", namespace = "http://www.allianz.com/PricingDetailsService/")
public class GetPricingResponse {

    @XmlElement(name = "pricing-output", namespace = "http://www.allianz.com/PricingDetailsService/datamodel")
    private com.allianz.pricingdetailsservice.datamodel.PricingOutputType pricingOutput;

    /**
     * 
     * @return
     *     returns PricingOutputType
     */
    public com.allianz.pricingdetailsservice.datamodel.PricingOutputType getPricingOutput() {
        return this.pricingOutput;
    }

    /**
     * 
     * @param pricingOutput
     *     the value for the pricingOutput property
     */
    public void setPricingOutput(com.allianz.pricingdetailsservice.datamodel.PricingOutputType pricingOutput) {
        this.pricingOutput = pricingOutput;
    }

}
