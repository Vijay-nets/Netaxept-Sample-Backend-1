
package org.datacontract.schemas._2004._07.bbs_epayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountCaptured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountCredited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Annulled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Authorized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedAmount" type="{http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary}AdjustedDetails" minOccurs="0"/&gt;
 *         &lt;element name="ChargeBackAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountAnnulled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialSummary", propOrder = {
    "amountCaptured",
    "amountCredited",
    "annulled",
    "authorizationId",
    "authorized",
    "authorizedAmount",
    "adjustedAmount",
    "chargeBackAmount",
    "amountAnnulled"
})
public class FinancialSummary {

    @XmlElement(name = "AmountCaptured", nillable = true)
    protected String amountCaptured;
    @XmlElement(name = "AmountCredited", nillable = true)
    protected String amountCredited;
    @XmlElement(name = "Annulled")
    protected Boolean annulled;
    @XmlElement(name = "AuthorizationId", nillable = true)
    protected String authorizationId;
    @XmlElement(name = "Authorized")
    protected Boolean authorized;
    @XmlElement(name = "AuthorizedAmount", nillable = true)
    protected String authorizedAmount;
    @XmlElement(name = "AdjustedAmount", nillable = true)
    protected AdjustedDetails adjustedAmount;
    @XmlElement(name = "ChargeBackAmount", nillable = true)
    protected String chargeBackAmount;
    @XmlElement(name = "AmountAnnulled", nillable = true)
    protected String amountAnnulled;

    /**
     * Gets the value of the amountCaptured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountCaptured() {
        return amountCaptured;
    }

    /**
     * Sets the value of the amountCaptured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountCaptured(String value) {
        this.amountCaptured = value;
    }

    /**
     * Gets the value of the amountCredited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountCredited() {
        return amountCredited;
    }

    /**
     * Sets the value of the amountCredited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountCredited(String value) {
        this.amountCredited = value;
    }

    /**
     * Gets the value of the annulled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnulled() {
        return annulled;
    }

    /**
     * Sets the value of the annulled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnulled(Boolean value) {
        this.annulled = value;
    }

    /**
     * Gets the value of the authorizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationId() {
        return authorizationId;
    }

    /**
     * Sets the value of the authorizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationId(String value) {
        this.authorizationId = value;
    }

    /**
     * Gets the value of the authorized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorized(Boolean value) {
        this.authorized = value;
    }

    /**
     * Gets the value of the authorizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedAmount() {
        return authorizedAmount;
    }

    /**
     * Sets the value of the authorizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedAmount(String value) {
        this.authorizedAmount = value;
    }

    /**
     * Gets the value of the adjustedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustedDetails }
     *     
     */
    public AdjustedDetails getAdjustedAmount() {
        return adjustedAmount;
    }

    /**
     * Sets the value of the adjustedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustedDetails }
     *     
     */
    public void setAdjustedAmount(AdjustedDetails value) {
        this.adjustedAmount = value;
    }

    /**
     * Gets the value of the chargeBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeBackAmount() {
        return chargeBackAmount;
    }

    /**
     * Sets the value of the chargeBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeBackAmount(String value) {
        this.chargeBackAmount = value;
    }

    /**
     * Gets the value of the amountAnnulled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountAnnulled() {
        return amountAnnulled;
    }

    /**
     * Sets the value of the amountAnnulled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountAnnulled(String value) {
        this.amountAnnulled = value;
    }

}
