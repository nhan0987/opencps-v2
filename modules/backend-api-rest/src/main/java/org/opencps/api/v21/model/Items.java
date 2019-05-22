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
 *         &lt;element name="DictItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="itemName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="itemNameEN">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="itemDescription">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="parent">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="sibling">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="metadata">
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
    "dictItem"
})
@XmlRootElement(name = "items")
public class Items {

    @XmlElement(name = "DictItem", required = true)
    protected List<Items.DictItem> dictItem;

    /**
     * Gets the value of the dictItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Items.DictItem }
     * 
     * 
     */
    public List<Items.DictItem> getDictItem() {
        if (dictItem == null) {
            dictItem = new ArrayList<Items.DictItem>();
        }
        return this.dictItem;
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
     *         &lt;element name="itemCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="itemName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="itemNameEN">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="itemDescription">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="parent">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="sibling">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="metadata">
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
        "itemCode",
        "itemName",
        "itemNameEN",
        "itemDescription",
        "parent",
        "level",
        "sibling",
        "metadata"
    })
    public static class DictItem {

        @XmlElement(required = true)
        protected String itemCode;
        @XmlElement(required = true)
        protected String itemName;
        @XmlElement(required = true)
        protected String itemNameEN;
        @XmlElement(required = true)
        protected String itemDescription;
        @XmlElement(required = true)
        protected String parent;
        protected int level;
        @XmlElement(required = true)
        protected String sibling;
        @XmlElement(required = true)
        protected String metadata;

        /**
         * Gets the value of the itemCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemCode() {
            return itemCode;
        }

        /**
         * Sets the value of the itemCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemCode(String value) {
            this.itemCode = value;
        }

        /**
         * Gets the value of the itemName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemName() {
            return itemName;
        }

        /**
         * Sets the value of the itemName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemName(String value) {
            this.itemName = value;
        }

        /**
         * Gets the value of the itemNameEN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemNameEN() {
            return itemNameEN;
        }

        /**
         * Sets the value of the itemNameEN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemNameEN(String value) {
            this.itemNameEN = value;
        }

        /**
         * Gets the value of the itemDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemDescription() {
            return itemDescription;
        }

        /**
         * Sets the value of the itemDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemDescription(String value) {
            this.itemDescription = value;
        }

        /**
         * Gets the value of the parent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParent() {
            return parent;
        }

        /**
         * Sets the value of the parent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParent(String value) {
            this.parent = value;
        }

        /**
         * Gets the value of the level property.
         * 
         */
        public int getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         */
        public void setLevel(int value) {
            this.level = value;
        }

        /**
         * Gets the value of the sibling property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSibling() {
            return sibling;
        }

        /**
         * Sets the value of the sibling property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSibling(String value) {
            this.sibling = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetadata(String value) {
            this.metadata = value;
        }

    }

}
