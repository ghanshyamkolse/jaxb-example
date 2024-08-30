package com.exam.jms.demo.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "commonCompositeFlightId", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
public class CommonCompositeFlightId {

    private String callSign;
    private String departureAirport;
    private String arrivalAirport;
    private String departureDateTime;

    @XmlElement(name = "callSign", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    @XmlElement(name = "departureAirport", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    @XmlElement(name = "arrivalAirport", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @XmlElement(name = "departureDateTime", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }
}