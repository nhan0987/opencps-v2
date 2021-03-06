//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.11 at 06:53:24 PM ICT 
//


package org.opencps.api.serviceinfo.model;

import com.liferay.petra.string.StringPool;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regularText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administrationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="public_" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceInfoId",
    "serviceCode",
    "serviceName",
    "processText",
    "methodText",
    "dossierText",
    "conditionText",
    "durationText",
    "applicantText",
    "resultText",
    "regularText",
    "feeText",
    "administrationCode",
    "domainCode",
    "_public",
    "maxLevel",
    "administrationName",
    "domainName",
    "active",
    "govAgencyText"

})
@XmlRootElement(name = "ServiceInfoInputModel")
public class ServiceInfoInputModel {
	
	@FormParam(value = "active")
	protected String active;

	
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@DefaultValue("0") @FormParam(value = "serviceInfoId")
    protected Long serviceInfoId;

	@XmlElement(required = true)
	@DefaultValue(StringPool.BLANK) @FormParam(value = "serviceCode")
    protected String serviceCode;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "serviceName")
    protected String serviceName;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "processText")
    protected String processText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "methodText")
    protected String methodText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "dossierText")
    protected String dossierText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "conditionText")
    protected String conditionText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "durationText")
    protected String durationText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "applicantText")
    protected String applicantText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "resultText")
    protected String resultText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "regularText")
    protected String regularText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "feeText")
    protected String feeText;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "administrationCode")
    protected String administrationCode;

	
	@DefaultValue(StringPool.BLANK) @FormParam(value = "domainCode")
    protected String domainCode;
	
    @XmlElement(name = "public")
	@FormParam(value = "public")
    protected String _public;

	@DefaultValue(StringPool.BLANK)
	@FormParam(value = "govAgencyText")
	protected String govAgencyText;
	
	public String get_public() {
		return _public;
	}

	public void set_public(String _public) {
		this._public = _public;
	}

	@DefaultValue("2") @FormParam(value = "maxLevel")
    protected Integer maxLevel;
	
    public String getAdministrationName() {
		return administrationName;
	}

	public void setAdministrationName(String administrationName) {
		this.administrationName = administrationName;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	protected String administrationName;
    protected String domainName;

    /**
     * Gets the value of the serviceInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceInfoId() {
        return serviceInfoId;
    }

    /**
     * Sets the value of the serviceInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceInfoId(Long value) {
        this.serviceInfoId = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the processText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessText() {
        return processText;
    }

    /**
     * Sets the value of the processText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessText(String value) {
        this.processText = value;
    }

    /**
     * Gets the value of the methodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodText() {
        return methodText;
    }

    /**
     * Sets the value of the methodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodText(String value) {
        this.methodText = value;
    }

    /**
     * Gets the value of the dossierText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierText() {
        return dossierText;
    }

    /**
     * Sets the value of the dossierText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierText(String value) {
        this.dossierText = value;
    }

    /**
     * Gets the value of the conditionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionText() {
        return conditionText;
    }

    /**
     * Sets the value of the conditionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionText(String value) {
        this.conditionText = value;
    }

    /**
     * Gets the value of the durationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationText() {
        return durationText;
    }

    /**
     * Sets the value of the durationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationText(String value) {
        this.durationText = value;
    }

    /**
     * Gets the value of the applicantText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantText() {
        return applicantText;
    }

    /**
     * Sets the value of the applicantText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantText(String value) {
        this.applicantText = value;
    }

    /**
     * Gets the value of the resultText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultText() {
        return resultText;
    }

    /**
     * Sets the value of the resultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultText(String value) {
        this.resultText = value;
    }

    /**
     * Gets the value of the regularText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularText() {
        return regularText;
    }

    /**
     * Sets the value of the regularText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularText(String value) {
        this.regularText = value;
    }

    /**
     * Gets the value of the feeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeText() {
        return feeText;
    }

    /**
     * Sets the value of the feeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeText(String value) {
        this.feeText = value;
    }

    /**
     * Gets the value of the administrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationCode() {
        return administrationCode;
    }

    /**
     * Sets the value of the administrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationCode(String value) {
        this.administrationCode = value;
    }

    /**
     * Gets the value of the domainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * Sets the value of the domainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainCode(String value) {
        this.domainCode = value;
    }

    /**
     * Gets the value of the public property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public String getPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPublic(String value) {
        this._public = value;
    }

    /**
     * Gets the value of the maxLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * Sets the value of the maxLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLevel(Integer value) {
        this.maxLevel = value;
    }

	public String getGovAgencyText() {
		return govAgencyText;
	}

	public void setGovAgencyText(String govAgencyText) {
		this.govAgencyText = govAgencyText;
	}

}
