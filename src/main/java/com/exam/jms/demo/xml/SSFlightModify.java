package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ssFlightModify", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
public class SSFlightModify {

    private CommonCompositeFlightId commonCompositeFlightId;
    private String controlledDepartureTime;
    private String controlledArrivalTime;
    private AssignedArrivalSlot assignedArrivalSlot;

    @XmlElement(name = "commonCompositeFlightId", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public CommonCompositeFlightId getCommonCompositeFlightId() {
        return commonCompositeFlightId;
    }

    public void setCommonCompositeFlightId(CommonCompositeFlightId commonCompositeFlightId) {
        this.commonCompositeFlightId = commonCompositeFlightId;
    }

    @XmlElement(name = "controlledDepartureTime", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getControlledDepartureTime() {
        return controlledDepartureTime;
    }

    public void setControlledDepartureTime(String controlledDepartureTime) {
        this.controlledDepartureTime = controlledDepartureTime;
    }

    @XmlElement(name = "controlledArrivalTime", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getControlledArrivalTime() {
        return controlledArrivalTime;
    }

    public void setControlledArrivalTime(String controlledArrivalTime) {
        this.controlledArrivalTime = controlledArrivalTime;
    }

    @XmlElement(name = "assignedArrivalSlot", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public AssignedArrivalSlot getAssignedArrivalSlot() {
        return assignedArrivalSlot;
    }

    public void setAssignedArrivalSlot(AssignedArrivalSlot assignedArrivalSlot) {
        this.assignedArrivalSlot = assignedArrivalSlot;
    }
}