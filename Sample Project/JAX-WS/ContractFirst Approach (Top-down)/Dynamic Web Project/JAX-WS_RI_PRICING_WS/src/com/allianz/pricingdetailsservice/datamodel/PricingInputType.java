
package com.allianz.pricingdetailsservice.datamodel;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pricing-input-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pricing-input-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product-code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="life-benefit-amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="insured-age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insured-gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policy-duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="policy-start-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricing-input-type", propOrder = {
    "productCode",
    "lifeBenefitAmount",
    "insuredAge",
    "insuredGender",
    "policyDuration",
    "policyStartDate"
})
public class PricingInputType {

    @XmlElement(name = "product-code")
    protected int productCode;
    @XmlElement(name = "life-benefit-amount", required = true)
    protected BigDecimal lifeBenefitAmount;
    @XmlElement(name = "insured-age")
    protected int insuredAge;
    @XmlElement(name = "insured-gender", required = true)
    protected String insuredGender;
    @XmlElement(name = "policy-duration")
    protected int policyDuration;
    @XmlElement(name = "policy-start-date", required = true)
    protected String policyStartDate;

    /**
     * Gets the value of the productCode property.
     * 
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     */
    public void setProductCode(int value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the lifeBenefitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLifeBenefitAmount() {
        return lifeBenefitAmount;
    }

    /**
     * Sets the value of the lifeBenefitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLifeBenefitAmount(BigDecimal value) {
        this.lifeBenefitAmount = value;
    }

    /**
     * Gets the value of the insuredAge property.
     * 
     */
    public int getInsuredAge() {
        return insuredAge;
    }

    /**
     * Sets the value of the insuredAge property.
     * 
     */
    public void setInsuredAge(int value) {
        this.insuredAge = value;
    }

    /**
     * Gets the value of the insuredGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredGender() {
        return insuredGender;
    }

    /**
     * Sets the value of the insuredGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredGender(String value) {
        this.insuredGender = value;
    }

    /**
     * Gets the value of the policyDuration property.
     * 
     */
    public int getPolicyDuration() {
        return policyDuration;
    }

    /**
     * Sets the value of the policyDuration property.
     * 
     */
    public void setPolicyDuration(int value) {
        this.policyDuration = value;
    }

    /**
     * Gets the value of the policyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStartDate() {
        return policyStartDate;
    }

    /**
     * Sets the value of the policyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStartDate(String value) {
        this.policyStartDate = value;
    }

}
