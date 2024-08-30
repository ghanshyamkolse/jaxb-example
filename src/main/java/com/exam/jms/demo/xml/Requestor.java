package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "requestor", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
public class Requestor {

    private String center;

    @XmlElement(name = "center", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommondatatypes")
    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }
}