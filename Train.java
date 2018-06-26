package ua.prog.kiev.lesson2.taskOne;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Train {
    @XmlAttribute(name = "id")
    private String id;
    private String from = "";
    private String to = "";
    private String date;
    private String departure;

    public Train(String id, String from, String to, String date, String departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    @XmlElement
    public String getFrom() {
        return from;
    }

    @XmlElement
    public String getTo() {
        return to;
    }

    @XmlElement
    public String getDate() {
        return date;
    }

    @XmlElement
    public String getDeparture() {
        return departure;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Train() {
    }

    @Override
    public String toString() {
        return "\n <train id=" + id + ">\n" +
                "   <from>" + from + "</from>\n" +
                "   <to>" + to + "</to>\n" +
                "   <date>" + date + "</date>\n" +
                "   <departure>" + departure + "</departure>\n" +
                " </train>";
    }
}
