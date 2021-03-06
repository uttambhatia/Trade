
package com.cs.tmt.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cs.tmt.model.InfoData;


/**
 * <p>Java class for getInfoDataDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInfoDataDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infoData" type="{http://ws.tmt.cs.com}infoData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoDataDetailsRequest", propOrder = {
    "infoData"
})
public class GetInfoDataDetailsRequest {

    @XmlElement(required = true)
    protected InfoData infoData;

    /**
     * Gets the value of the infoData property.
     * 
     * @return
     *     possible object is
     *     {@link InfoData }
     *     
     */
    public InfoData getInfoData() {
        return infoData;
    }

    /**
     * Sets the value of the infoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoData }
     *     
     */
    public void setInfoData(InfoData value) {
        this.infoData = value;
    }

}
