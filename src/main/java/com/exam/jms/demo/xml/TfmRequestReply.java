package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tfmRequestReply", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmdataservice")
public class TfmRequestReply {

    private Request request;

    @XmlElement(name = "request", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmdataservice")
    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
