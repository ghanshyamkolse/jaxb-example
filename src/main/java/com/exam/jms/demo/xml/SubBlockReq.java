package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "subBlockReq", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
public class SubBlockReq {

    private SSFlightModify[] ssFlightModify;

    @XmlElement(name = "ssFlightModify", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public SSFlightModify[] getSsFlightModify() {
        return ssFlightModify;
    }

    public void setSsFlightModify(SSFlightModify[] ssFlightModify) {
        this.ssFlightModify = ssFlightModify;
    }
}