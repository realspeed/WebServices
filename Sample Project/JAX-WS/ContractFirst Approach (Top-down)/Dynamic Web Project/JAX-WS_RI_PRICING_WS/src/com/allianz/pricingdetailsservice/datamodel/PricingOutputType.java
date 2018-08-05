
package com.allianz.pricingdetailsservice.datamodel;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pricing-output-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pricing-output-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="net-premium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="gross-premium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="policy-end-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product-code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricing-output-type", propOrder = {
    "netPremium",
    "grossPremium",
    "policyEndDate",
    "productCode"
})
public class PricingOutputType {

    @XmlElement(name = "net-premium", required = true)
    protected BigDecimal netPremium;
    @XmlElement(name = "gross-premium", required = true)
    protected BigDecimal grossPremium;
    @XmlElement(name = "policy-end-date", required = true)
    protected String policyEndDate;
    @XmlElement(name = "product-code")
    protected int productCode;

    /**
     * Gets the value of the netPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPremium() {
        return netPremium;
    }

    /**
     * Sets the value of the netPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPremium(BigDecimal value) {
        this.netPremium = value;
    }

    /**
     * Gets the value of the grossPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossPremium() {
        return grossPremium;
    }

    /**
     * Sets the value of the grossPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossPremium(BigDecimal value) {
        this.grossPremium = value;
    }

    /**
     * Gets the value of the policyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyEndDate() {
        return policyEndDate;
    }

    /**
     * Sets the value of the policyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyEndDate(String value) {
        this.policyEndDate = value;
    }

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

}
