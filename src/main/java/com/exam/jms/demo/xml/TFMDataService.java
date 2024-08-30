package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tfmDataService", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmdataservice")
public class TFMDataService {

    private TfmRequestReply tfmRequestReply;

    @XmlElement(name = "tfmRequestReply", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmdataservice")
    public TfmRequestReply getTfmRequestReply() {
        return tfmRequestReply;
    }

    public void setTfmRequestReply(TfmRequestReply tfmRequestReply) {
        this.tfmRequestReply = tfmRequestReply;
    }
}