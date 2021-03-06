//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.27 at 11:42:22 AM ICT 
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
 *         &lt;element name="DossierPart" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="partNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="partName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="partTip">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="partType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="multiple" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="esign" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="fileTemplateNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="deliverableType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="deliverableAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="eForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="sampleData">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fileMark" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dossierPart"
})
@XmlRootElement(name = "parts")
public class Parts {

    @XmlElement(name = "DossierPart", required = true)
    protected List<Parts.DossierPart> dossierPart;

    /**
     * Gets the value of the dossierPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dossierPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDossierPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parts.DossierPart }
     * 
     * 
     */
    public List<Parts.DossierPart> getDossierPart() {
        if (dossierPart == null) {
            dossierPart = new ArrayList<Parts.DossierPart>();
        }
        return this.dossierPart;
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
     *         &lt;element name="partNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="partName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="partTip">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="partType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="multiple" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="esign" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="fileTemplateNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="deliverableType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="deliverableAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="eForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="sampleData">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fileMark" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "partNo",
        "partName",
        "partTip",
        "partType",
        "multiple",
        "required",
        "esign",
        "fileTemplateNo",
        "deliverableType",
        "deliverableAction",
        "eForm",
        "sampleData",
        "fileMark"
    })
    public static class DossierPart {

        @XmlElement(required = true)
        protected String partNo;
        @XmlElement(required = true)
        protected String partName;
        @XmlElement(required = true)
        protected String partTip;
        protected int partType;
        protected boolean multiple;
        protected boolean required;
        protected boolean esign;
        @XmlElement(required = true)
        protected String fileTemplateNo;
        @XmlElement(required = true)
        protected String deliverableType;
        protected int deliverableAction;
        protected boolean eForm;
        @XmlElement(required = true)
        protected String sampleData;
        protected int fileMark;

        /**
         * Gets the value of the partNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartNo() {
            return partNo;
        }

        /**
         * Sets the value of the partNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartNo(String value) {
            this.partNo = value;
        }

        /**
         * Gets the value of the partName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartName() {
            return partName;
        }

        /**
         * Sets the value of the partName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartName(String value) {
            this.partName = value;
        }

        /**
         * Gets the value of the partTip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartTip() {
            return partTip;
        }

        /**
         * Sets the value of the partTip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartTip(String value) {
            this.partTip = value;
        }

        /**
         * Gets the value of the partType property.
         * 
         */
        public int getPartType() {
            return partType;
        }

        /**
         * Sets the value of the partType property.
         * 
         */
        public void setPartType(int value) {
            this.partType = value;
        }

        /**
         * Gets the value of the multiple property.
         * 
         */
        public boolean isMultiple() {
            return multiple;
        }

        /**
         * Sets the value of the multiple property.
         * 
         */
        public void setMultiple(boolean value) {
            this.multiple = value;
        }

        /**
         * Gets the value of the required property.
         * 
         */
        public boolean isRequired() {
            return required;
        }

        /**
         * Sets the value of the required property.
         * 
         */
        public void setRequired(boolean value) {
            this.required = value;
        }

        /**
         * Gets the value of the esign property.
         * 
         */
        public boolean isEsign() {
            return esign;
        }

        /**
         * Sets the value of the esign property.
         * 
         */
        public void setEsign(boolean value) {
            this.esign = value;
        }

        /**
         * Gets the value of the fileTemplateNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileTemplateNo() {
            return fileTemplateNo;
        }

        /**
         * Sets the value of the fileTemplateNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileTemplateNo(String value) {
            this.fileTemplateNo = value;
        }

        /**
         * Gets the value of the deliverableType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliverableType() {
            return deliverableType;
        }

        /**
         * Sets the value of the deliverableType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliverableType(String value) {
            this.deliverableType = value;
        }

        /**
         * Gets the value of the deliverableAction property.
         * 
         */
        public int getDeliverableAction() {
            return deliverableAction;
        }

        /**
         * Sets the value of the deliverableAction property.
         * 
         */
        public void setDeliverableAction(int value) {
            this.deliverableAction = value;
        }

        /**
         * Gets the value of the eForm property.
         * 
         */
        public boolean isEForm() {
            return eForm;
        }

        /**
         * Sets the value of the eForm property.
         * 
         */
        public void setEForm(boolean value) {
            this.eForm = value;
        }

        /**
         * Gets the value of the sampleData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSampleData() {
            return sampleData;
        }

        /**
         * Sets the value of the sampleData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSampleData(String value) {
            this.sampleData = value;
        }

        /**
         * Gets the value of the fileMark property.
         * 
         */
        public int getFileMark() {
            return fileMark;
        }

        /**
         * Sets the value of the fileMark property.
         * 
         */
        public void setFileMark(int value) {
            this.fileMark = value;
        }

    }

}
