//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.16 at 05:01:18 PM GMT 
//


package org.deegree.portal.cataloguemanager.model;

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
 *         &lt;element name="name">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.isotc211.org/2005/gco}aName"/>
 *                   &lt;element ref="{http://www.isotc211.org/2005/gco}attributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.isotc211.org/2005/srv}direction"/>
 *         &lt;element name="description">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.isotc211.org/2005/gco}CharacterString"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.isotc211.org/2005/srv}optionality"/>
 *         &lt;element ref="{http://www.isotc211.org/2005/srv}repeatability"/>
 *         &lt;element ref="{http://www.isotc211.org/2005/srv}valueType"/>
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
    "name",
    "direction",
    "description",
    "optionality",
    "repeatability",
    "valueType"
})
@XmlRootElement(name = "SV_Parameter", namespace = "http://www.isotc211.org/2005/srv")
public class SVParameter {

    @XmlElement(namespace = "http://www.isotc211.org/2005/srv", required = true)
    protected SVParameter.Name name;
    @XmlElement(namespace = "http://www.isotc211.org/2005/srv", required = true)
    protected Direction direction;
    @XmlElement(namespace = "", required = true)
    protected SVParameter.Description description;
    @XmlElement(namespace = "http://www.isotc211.org/2005/srv", required = true)
    protected Optionality optionality;
    @XmlElement(namespace = "http://www.isotc211.org/2005/srv", required = true)
    protected Repeatability repeatability;
    @XmlElement(namespace = "http://www.isotc211.org/2005/srv", required = true)
    protected ValueType valueType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SVParameter.Name }
     *     
     */
    public SVParameter.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SVParameter.Name }
     *     
     */
    public void setName(SVParameter.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setDirection(Direction value) {
        this.direction = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link SVParameter.Description }
     *     
     */
    public SVParameter.Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SVParameter.Description }
     *     
     */
    public void setDescription(SVParameter.Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the optionality property.
     * 
     * @return
     *     possible object is
     *     {@link Optionality }
     *     
     */
    public Optionality getOptionality() {
        return optionality;
    }

    /**
     * Sets the value of the optionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Optionality }
     *     
     */
    public void setOptionality(Optionality value) {
        this.optionality = value;
    }

    /**
     * Gets the value of the repeatability property.
     * 
     * @return
     *     possible object is
     *     {@link Repeatability }
     *     
     */
    public Repeatability getRepeatability() {
        return repeatability;
    }

    /**
     * Sets the value of the repeatability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Repeatability }
     *     
     */
    public void setRepeatability(Repeatability value) {
        this.repeatability = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setValueType(ValueType value) {
        this.valueType = value;
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
     *         &lt;element ref="{http://www.isotc211.org/2005/gco}CharacterString"/>
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
        "characterString"
    })
    public static class Description {

        @XmlElement(name = "CharacterString", namespace = "http://www.isotc211.org/2005/gco", required = true)
        protected String characterString;

        /**
         * Gets the value of the characterString property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharacterString() {
            return characterString;
        }

        /**
         * Sets the value of the characterString property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharacterString(String value) {
            this.characterString = value;
        }

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
     *         &lt;element ref="{http://www.isotc211.org/2005/gco}aName"/>
     *         &lt;element ref="{http://www.isotc211.org/2005/gco}attributeType"/>
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
        "aName",
        "attributeType"
    })
    public static class Name {

        @XmlElement(namespace = "http://www.isotc211.org/2005/gco", required = true)
        protected AName aName;
        @XmlElement(namespace = "http://www.isotc211.org/2005/gco", required = true)
        protected AttributeType attributeType;

        /**
         * Gets the value of the aName property.
         * 
         * @return
         *     possible object is
         *     {@link AName }
         *     
         */
        public AName getAName() {
            return aName;
        }

        /**
         * Sets the value of the aName property.
         * 
         * @param value
         *     allowed object is
         *     {@link AName }
         *     
         */
        public void setAName(AName value) {
            this.aName = value;
        }

        /**
         * Gets the value of the attributeType property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType }
         *     
         */
        public AttributeType getAttributeType() {
            return attributeType;
        }

        /**
         * Sets the value of the attributeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType }
         *     
         */
        public void setAttributeType(AttributeType value) {
            this.attributeType = value;
        }

    }

}