package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmdataservice")
public class Request {

    private RequestId requestId;
    private SubBlockReq subBlockReq;

    @XmlElement(name = "requestId", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public RequestId getRequestId() {
        return requestId;
    }

    public void setRequestId(RequestId requestId) {
        this.requestId = requestId;
    }

    @XmlElement(name = "subBlockReq", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public SubBlockReq getSubBlockReq() {
        return subBlockReq;
    }

    public void setSubBlockReq(SubBlockReq subBlockReq) {
        this.subBlockReq = subBlockReq;
    }
}
