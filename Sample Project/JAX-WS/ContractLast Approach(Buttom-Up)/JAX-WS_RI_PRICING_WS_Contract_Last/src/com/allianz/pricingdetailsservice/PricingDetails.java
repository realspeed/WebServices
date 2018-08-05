
package com.allianz.pricingdetailsservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.allianz.pricingdetailsservice.datamodel.PricingInputType;
import com.allianz.pricingdetailsservice.datamodel.PricingOutputType;

@WebService(name = "PricingDetails", targetNamespace = "http://www.allianz.com/PricingDetailsService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface PricingDetails {

    @WebMethod(action = "http://www.allianz.com/PricingDetailsService/getPricing")
    @WebResult(name = "pricing-output", targetNamespace = "http://www.allianz.com/PricingDetailsService/datamodel", partName = "output")
    public PricingOutputType getPricing(
        @WebParam(name = "pricing-input", targetNamespace = "http://www.allianz.com/PricingDetailsService/datamodel", partName = "input")
        PricingInputType input);

}
