
package org.datacontract.schemas._2004._07.bbs_epayment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ppro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ppro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PPRODynamicDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SepaMandate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SepaMandateUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ppro", propOrder = {
    "pproDynamicDescriptor",
    "sepaMandate",
    "sepaMandateUrl"
})
public class Ppro {

    @XmlElement(name = "PPRODynamicDescriptor", nillable = true)
    protected String pproDynamicDescriptor;
    @XmlElement(name = "SepaMandate", nillable = true)
    protected String sepaMandate;
    @XmlElement(name = "SepaMandateUrl", nillable = true)
    protected String sepaMandateUrl;

    /**
     * Gets the value of the pproDynamicDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPRODynamicDescriptor() {
        return pproDynamicDescriptor;
    }

    /**
     * Sets the value of the pproDynamicDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPRODynamicDescriptor(String value) {
        this.pproDynamicDescriptor = value;
    }

    /**
     * Gets the value of the sepaMandate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSepaMandate() {
        return sepaMandate;
    }

    /**
     * Sets the value of the sepaMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSepaMandate(String value) {
        this.sepaMandate = value;
    }

    /**
     * Gets the value of the sepaMandateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSepaMandateUrl() {
        return sepaMandateUrl;
    }

    /**
     * Sets the value of the sepaMandateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSepaMandateUrl(String value) {
        this.sepaMandateUrl = value;
    }

}
