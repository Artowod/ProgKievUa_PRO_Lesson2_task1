package ua.prog.kiev.lesson2.taskOne;

import javax.xml.bind.*;
import java.io.File;

public class TrainsControllingSystem {
    private File file;


    public TrainsControllingSystem() {
    }

    public Trains deMarshallingXML(String filePath) {
        this.file = new File(filePath);
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Trains trains = (Trains) unmarshaller.unmarshal(file);
            return trains;

        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void marshallingXML(Trains train, String filePath) {
        this.file = new File(filePath);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
            Marshaller marshaller = null;
            marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(train, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public Boolean isTrainMeetDepartureTimeSlot(Train train, double from, double to) {
        double departureTime = Double.valueOf(train.getDeparture().replace(":", "."));
        if (departureTime > from && departureTime < to) {
            return true;
        }
        return false;
    }

}
