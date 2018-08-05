
package com.allianz.pricingdetailsservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPricing", namespace = "http://www.allianz.com/PricingDetailsService/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPricing", namespace = "http://www.allianz.com/PricingDetailsService/")
public class GetPricing {

    @XmlElement(name = "pricing-input", namespace = "http://www.allianz.com/PricingDetailsService/datamodel")
    private com.allianz.pricingdetailsservice.datamodel.PricingInputType pricingInput;

    /**
     * 
     * @return
     *     returns PricingInputType
     */
    public com.allianz.pricingdetailsservice.datamodel.PricingInputType getPricingInput() {
        return this.pricingInput;
    }

    /**
     * 
     * @param pricingInput
     *     the value for the pricingInput property
     */
    public void setPricingInput(com.allianz.pricingdetailsservice.datamodel.PricingInputType pricingInput) {
        this.pricingInput = pricingInput;
    }

}
