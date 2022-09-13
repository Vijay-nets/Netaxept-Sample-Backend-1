
package org.datacontract.schemas._2004._07.bbs_epayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustedDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustedDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NegativeAdjusted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositiveAdjusted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustedDetails", propOrder = {
    "negativeAdjusted",
    "positiveAdjusted"
})
public class AdjustedDetails {

    @XmlElement(name = "NegativeAdjusted", nillable = true)
    protected String negativeAdjusted;
    @XmlElement(name = "PositiveAdjusted", nillable = true)
    protected String positiveAdjusted;

    /**
     * Gets the value of the negativeAdjusted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeAdjusted() {
        return negativeAdjusted;
    }

    /**
     * Sets the value of the negativeAdjusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeAdjusted(String value) {
        this.negativeAdjusted = value;
    }

    /**
     * Gets the value of the positiveAdjusted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveAdjusted() {
        return positiveAdjusted;
    }

    /**
     * Sets the value of the positiveAdjusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveAdjusted(String value) {
        this.positiveAdjusted = value;
    }

}
