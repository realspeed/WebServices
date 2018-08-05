package com.allianz.pricingdetailsservice.resources;

import java.math.BigDecimal;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.allianz.pricingdetailsservice.datamodel.PricingRequest;
import com.allianz.pricingdetailsservice.datamodel.PricingResponse;

@Path("/pricing")
public class PricingResource {
	
	@Path("/getPricingDetails")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public PricingResponse getPricing(PricingRequest request) {
		PricingResponse output=new PricingResponse();
		output.setGrossPremium(BigDecimal.valueOf(10000));
		output.setNetPremium(BigDecimal.valueOf(9500));
		output.setPolicyEndDate("20190718");
		output.setProductCode(request.getProductCode());
		return output;
	}
	/**
	{
	    "productCode": 5754,
	    "lifeBenefitAmount": 56800,
	    "insuredAge": 69,
	    "insuredGender": "M",
	    "policyDuration": 15,
	    "policyStartDate": "20180503"
	}
	 */
	
	@Path("/getSample")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public PricingRequest getSample() {
		return new PricingRequest();
	}
}
