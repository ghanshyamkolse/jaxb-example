package com.exam.jms.demo.xml;

import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;

@RestController
@RequestMapping("/api")
public class XmlController {

    @GetMapping("/parse")
    public String parseXml() {
        try {
            File file = new File("src/main/java/com/exam/jms/demo/xml/request.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(TFMDataService.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            TFMDataService tfmDataService = (TFMDataService) jaxbUnmarshaller.unmarshal(file);

            // Return some information from the parsed XML
            return "Unique Message ID: "
                    + tfmDataService.getTfmRequestReply().getRequest().getRequestId().getUniqueMsgId();
        } catch (JAXBException e) {
            e.printStackTrace();
            return "Error parsing XML";
        }
    }

    @PostMapping("/marshal")
    public String marshalXml() {
        try {
            TFMDataService tfmDataService = createSampleTFMDataService(); // Create an instance of TFMDataService

            // Create JAXBContext and Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(TFMDataService.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // Set the marshaller property to format the XML output
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Create a StringWriter to hold the XML string
            StringWriter stringWriter = new StringWriter();
            jaxbMarshaller.marshal(tfmDataService, stringWriter);

            // Get the XML string from the StringWriter
            String xmlString = stringWriter.toString();
            return xmlString; // Return the marshaled XML string
        } catch (JAXBException e) {
            e.printStackTrace();
            return "Error marshaling XML";
        }
    }

    private TFMDataService createSampleTFMDataService() {
        TFMDataService tfmDataService = new TFMDataService();
        TfmRequestReply tfmRequestReply = new TfmRequestReply();
        Request request = new Request();
        RequestId requestId = new RequestId();
        Requestor requestor = new Requestor();
        SubBlockReq subBlockReq = new SubBlockReq();

        // Set up sample data
        requestor.setCenter("AAL");
        requestId.setUniqueMsgId("25048748-b3c1-419e-8bea-7bf664bd72ea");
        requestId.setRequestor(requestor);
        requestId.setReplyOption("SUCC_OR_ERR_OR_WARN");

        request.setRequestId(requestId);
        request.setSubBlockReq(subBlockReq);

        tfmRequestReply.setRequest(request);
        tfmDataService.setTfmRequestReply(tfmRequestReply);

        return tfmDataService;
    }
}