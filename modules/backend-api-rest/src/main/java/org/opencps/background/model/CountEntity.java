//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.16 at 10:28:11 AM ICT 
//


package org.opencps.background.model;

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
 *         &lt;element name="database" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="lucene" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "database",
    "lucene"
})
@XmlRootElement(name = "CountEntity")
public class CountEntity {

    protected long database;
    protected long lucene;

    /**
     * Gets the value of the database property.
     * 
     */
    public long getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     */
    public void setDatabase(long value) {
        this.database = value;
    }

    /**
     * Gets the value of the lucene property.
     * 
     */
    public long getLucene() {
        return lucene;
    }

    /**
     * Sets the value of the lucene property.
     * 
     */
    public void setLucene(long value) {
        this.lucene = value;
    }

}
