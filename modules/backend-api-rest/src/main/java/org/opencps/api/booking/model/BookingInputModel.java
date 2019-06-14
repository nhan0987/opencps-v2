//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2017.09.11 at 06:53:24 PM ICT 
//


package org.opencps.api.booking.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlType(name = "EformFileTemplateInputModel", propOrder = {
 "className",
 "classPK",
 "serviceCode",
 "codeNumber",
 "bookingName",
 "checkinDate",
 "gateNumber",
 "state",
 "bookingDate"
})

@XmlRootElement(name = "EformFileTemplateInputModel")
public class BookingInputModel {

	@FormParam(value = "className")
	protected String className;
	@FormParam(value = "classPK")
	protected Long classPK;
	@FormParam(value = "serviceCode")
	protected String serviceCode;
	@FormParam(value = "codeNumber")
	protected String codeNumber;
	@FormParam(value = "bookingName")
	protected String bookingName;
	@FormParam(value = "checkinDate")
	protected String checkinDate;
	@FormParam(value = "gateNumber")
	protected String gateNumber;
	@FormParam(value = "state")
	protected Integer state;
	@FormParam(value = "bookingDate")
	protected String bookingDate;

	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Long getClassPK() {
		return classPK;
	}
	public void setClassPK(Long classPK) {
		this.classPK = classPK;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getCodeNumber() {
		return codeNumber;
	}
	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}
	public String getBookingName() {
		return bookingName;
	}
	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}
	public String getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}
	public String getGateNumber() {
		return gateNumber;
	}
	public void setGateNumber(String gateNumber) {
		this.gateNumber = gateNumber;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

}
