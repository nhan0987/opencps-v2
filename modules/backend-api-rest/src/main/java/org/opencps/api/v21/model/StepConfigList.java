//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.09 at 04:01:16 PM ICT 
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
 *         &lt;element name="StepConfig" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stepCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="stepName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="stepType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="dossierStatus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dossierSubStatus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="menuGroup">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="menuStepName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="buttonConfig">
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
    "stepConfig"
})
@XmlRootElement(name = "StepConfigList")
public class StepConfigList {

    @XmlElement(name = "StepConfig", required = true)
    protected List<StepConfigList.StepConfig> stepConfig;

    /**
     * Gets the value of the stepConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepConfigList.StepConfig }
     * 
     * 
     */
    public List<StepConfigList.StepConfig> getStepConfig() {
        if (stepConfig == null) {
            stepConfig = new ArrayList<StepConfigList.StepConfig>();
        }
        return this.stepConfig;
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
     *         &lt;element name="stepCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="stepName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="stepType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="dossierStatus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dossierSubStatus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="menuGroup">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="menuStepName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="buttonConfig">
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
        "stepCode",
        "stepName",
        "stepType",
        "dossierStatus",
        "dossierSubStatus",
        "menuGroup",
        "menuStepName",
        "buttonConfig"
    })
    public static class StepConfig {

        @XmlElement(required = true)
        protected String stepCode;
        @XmlElement(required = true)
        protected String stepName;
        protected Integer stepType;
        @XmlElement(required = true)
        protected String dossierStatus;
        @XmlElement(required = true)
        protected String dossierSubStatus;
        @XmlElement(required = true)
        protected String menuGroup;
        @XmlElement(required = true)
        protected String menuStepName;
        @XmlElement(required = true)
        protected String buttonConfig;

        /**
         * Gets the value of the stepCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStepCode() {
            return stepCode;
        }

        /**
         * Sets the value of the stepCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStepCode(String value) {
            this.stepCode = value;
        }

        /**
         * Gets the value of the stepName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStepName() {
            return stepName;
        }

        /**
         * Sets the value of the stepName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStepName(String value) {
            this.stepName = value;
        }

        /**
         * Gets the value of the stepType property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getStepType() {
            return stepType;
        }

        /**
         * Sets the value of the stepType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setStepType(Integer value) {
            this.stepType = value;
        }

        /**
         * Gets the value of the dossierStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDossierStatus() {
            return dossierStatus;
        }

        /**
         * Sets the value of the dossierStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDossierStatus(String value) {
            this.dossierStatus = value;
        }

        /**
         * Gets the value of the dossierSubStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDossierSubStatus() {
            return dossierSubStatus;
        }

        /**
         * Sets the value of the dossierSubStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDossierSubStatus(String value) {
            this.dossierSubStatus = value;
        }

        /**
         * Gets the value of the menuGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMenuGroup() {
            return menuGroup;
        }

        /**
         * Sets the value of the menuGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMenuGroup(String value) {
            this.menuGroup = value;
        }

        /**
         * Gets the value of the menuStepName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMenuStepName() {
            return menuStepName;
        }

        /**
         * Sets the value of the menuStepName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMenuStepName(String value) {
            this.menuStepName = value;
        }

        /**
         * Gets the value of the buttonConfig property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getButtonConfig() {
            return buttonConfig;
        }

        /**
         * Sets the value of the buttonConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setButtonConfig(String value) {
            this.buttonConfig = value;
        }

    }

}
