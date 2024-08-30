package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "assignedArrivalSlot", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
public class AssignedArrivalSlot {

    private String airport;
    private String slotTime;
    private String uniqueLetter;

    @XmlElement(name = "airport", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    @XmlElement(name = "slotTime", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }

    @XmlElement(name = "uniqueLetter", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getUniqueLetter() {
        return uniqueLetter;
    }

    public void setUniqueLetter(String uniqueLetter) {
        this.uniqueLetter = uniqueLetter;
    }
}