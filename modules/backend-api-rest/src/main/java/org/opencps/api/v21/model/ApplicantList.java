//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.24 at 04:30:45 PM ICT 
//


package org.opencps.api.v21.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Applicant" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicantIdNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="applicantName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="applicantIdType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="applicantIdDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="contactEmail">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="contactTelNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "applicant"
})
@XmlRootElement(name = "ApplicantList")
public class ApplicantList {

    @XmlElement(name = "Applicant", required = true)
    protected List<ApplicantList.Applicant> applicant;

    /**
     * Gets the value of the applicant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicantList.Applicant }
     * 
     * 
     */
    public List<ApplicantList.Applicant> getApplicant() {
        if (applicant == null) {
            applicant = new ArrayList<ApplicantList.Applicant>();
        }
        return this.applicant;
    }


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
     *         &lt;element name="applicantIdNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="applicantName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="applicantIdType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="applicantIdDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="contactEmail">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="contactTelNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "applicantIdNo",
        "applicantName",
        "applicantIdType",
        "applicantIdDate",
        "contactEmail",
        "contactTelNo"
    })
    public static class Applicant {

        @XmlElement(required = true)
        protected String applicantIdNo;
        @XmlElement(required = true)
        protected String applicantName;
        @XmlElement(required = true)
        protected String applicantIdType;
        @XmlElement(required = true)
        protected String applicantIdDate;
        @XmlElement(required = true)
        protected String contactEmail;
        @XmlElement(required = true)
        protected String contactTelNo;

        /**
         * Gets the value of the applicantIdNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicantIdNo() {
            return applicantIdNo;
        }

        /**
         * Sets the value of the applicantIdNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicantIdNo(String value) {
            this.applicantIdNo = value;
        }

        /**
         * Gets the value of the applicantName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicantName() {
            return applicantName;
        }

        /**
         * Sets the value of the applicantName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicantName(String value) {
            this.applicantName = value;
        }

        /**
         * Gets the value of the applicantIdType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicantIdType() {
            return applicantIdType;
        }

        /**
         * Sets the value of the applicantIdType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicantIdType(String value) {
            this.applicantIdType = value;
        }

        /**
         * Gets the value of the applicantIdDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicantIdDate() {
            return applicantIdDate;
        }

        /**
         * Sets the value of the applicantIdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicantIdDate(String value) {
            this.applicantIdDate = value;
        }

        /**
         * Gets the value of the contactEmail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactEmail() {
            return contactEmail;
        }

        /**
         * Sets the value of the contactEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactEmail(String value) {
            this.contactEmail = value;
        }

        /**
         * Gets the value of the contactTelNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactTelNo() {
            return contactTelNo;
        }

        /**
         * Sets the value of the contactTelNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactTelNo(String value) {
            this.contactTelNo = value;
        }

    }

}
