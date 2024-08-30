package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "requestId", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
public class RequestId {

    private String uniqueMsgId;
    private Requestor requestor;
    private String replyOption;

    @XmlElement(name = "uniqueMsgId", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getUniqueMsgId() {
        return uniqueMsgId;
    }

    public void setUniqueMsgId(String uniqueMsgId) {
        this.uniqueMsgId = uniqueMsgId;
    }

    @XmlElement(name = "requestor", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public Requestor getRequestor() {
        return requestor;
    }

    public void setRequestor(Requestor requestor) {
        this.requestor = requestor;
    }

    @XmlElement(name = "replyOption", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getReplyOption() {
        return replyOption;
    }

    public void setReplyOption(String replyOption) {
        this.replyOption = replyOption;
    }
}