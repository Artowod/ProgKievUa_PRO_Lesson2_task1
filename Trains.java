package ua.prog.kiev.lesson2.taskOne;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "trains")
public class Trains {
    @XmlElement(name = "train")
    private List<Train> trains;

    public Trains() {
        trains = new ArrayList<>();
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Train train : trains) {
            sb.append(train.toString());
        }
        return "<trains>" +
                sb +
                "\n</trains>";
    }
}
