
package com.allianz.pricingdetailsservice.datamodel;

import java.math.BigDecimal;

public class PricingInputType {

    protected int productCode;
    protected BigDecimal lifeBenefitAmount;
    protected int insuredAge;
    protected String insuredGender;
    protected int policyDuration;
    protected String policyStartDate;
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public BigDecimal getLifeBenefitAmount() {
		return lifeBenefitAmount;
	}
	public void setLifeBenefitAmount(BigDecimal lifeBenefitAmount) {
		this.lifeBenefitAmount = lifeBenefitAmount;
	}
	public int getInsuredAge() {
		return insuredAge;
	}
	public void setInsuredAge(int insuredAge) {
		this.insuredAge = insuredAge;
	}
	public String getInsuredGender() {
		return insuredGender;
	}
	public void setInsuredGender(String insuredGender) {
		this.insuredGender = insuredGender;
	}
	public int getPolicyDuration() {
		return policyDuration;
	}
	public void setPolicyDuration(int policyDuration) {
		this.policyDuration = policyDuration;
	}
	public String getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(String policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

    
}
