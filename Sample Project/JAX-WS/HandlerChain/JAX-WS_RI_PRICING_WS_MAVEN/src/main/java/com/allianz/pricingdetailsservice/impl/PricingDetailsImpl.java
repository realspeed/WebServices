package com.allianz.pricingdetailsservice.impl;

import java.math.BigDecimal;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import com.allianz.pricingdetailsservice.datamodel.PricingInputType;
import com.allianz.pricingdetailsservice.datamodel.PricingOutputType;

@WebService(endpointInterface="com.allianz.pricingdetailsservice.PricingDetails",portName="PricingDetailsServiceSOAPPort")
@HandlerChain(file="com\\allianz\\pricingdetailsservice\\handler\\pricing-handler.xml")
public class PricingDetailsImpl{
	public PricingOutputType getPricing(PricingInputType input) {
		
		//Business Logic 
		
		PricingOutputType output=new PricingOutputType();
		output.setGrossPremium(BigDecimal.valueOf(10000));
		output.setNetPremium(BigDecimal.valueOf(9500));
		output.setPolicyEndDate("20190718");
		output.setProductCode(input.getProductCode());
		
		return output;
	}

}
