//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.26 at 02:43:12 PM CLST 
//


package cl.minsal.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FooType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FooType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="foobar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FooType", propOrder = {
    "bar",
    "foobar"
})
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
@Deprecated
public class FooType {

    @XmlElement(required = true)
    protected String bar;
    @XmlElement(required = true)
    @Deprecated
    protected String foobar;

    /**
     * Gets the value of the bar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBar() {
        return bar;
    }

    /**
     * Sets the value of the bar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBar(String value) {
        this.bar = value;
    }

    /**
     * Gets the value of the foobar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @SuppressWarnings({
        "unchecked",
        "rawtypes"
    })
    @Deprecated
    public String getFoobar() {
        return foobar;
    }

    /**
     * Sets the value of the foobar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Deprecated
    public void setFoobar(
        @Deprecated
        String value) {
        this.foobar = value;
    }

}
