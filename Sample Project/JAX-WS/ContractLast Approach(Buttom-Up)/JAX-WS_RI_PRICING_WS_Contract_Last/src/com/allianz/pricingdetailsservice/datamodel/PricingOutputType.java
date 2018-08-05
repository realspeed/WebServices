
package com.allianz.pricingdetailsservice.datamodel;

import java.math.BigDecimal;


public class PricingOutputType {

    protected BigDecimal netPremium;
    protected BigDecimal grossPremium;
    protected String policyEndDate;
    protected int productCode;
	public BigDecimal getNetPremium() {
		return netPremium;
	}
	public void setNetPremium(BigDecimal netPremium) {
		this.netPremium = netPremium;
	}
	public BigDecimal getGrossPremium() {
		return grossPremium;
	}
	public void setGrossPremium(BigDecimal grossPremium) {
		this.grossPremium = grossPremium;
	}
	public String getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(String policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
}
