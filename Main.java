package ua.prog.kiev.lesson2.taskOne;

public class Main {

    public static void main(String[] args) {
        TrainsControllingSystem trainsReport = new TrainsControllingSystem();
        Trains trains = trainsReport.deMarshallingXML("C:/Java/trains.xml");
        System.out.println("\nAll Trains list:\n");
        System.out.println(trains.toString());

        double departureTimeFrom = 15.00;
        double departureTimeTo = 19.00;
        System.out.println("\nTrains with departure time between " + departureTimeFrom + " and " + departureTimeTo + " :");
        for (Train train : trains.getTrains()) {
            if (trainsReport.isTrainMeetDepartureTimeSlot(train, departureTimeFrom, departureTimeTo)) {
                System.out.println(train.toString());
            }
        }

        Train newTrain = new Train("3a", "Dubai", "North", "03.10.2018", "21:00");
        trains.addTrain(newTrain);
        trainsReport.marshallingXML(trains, "C:/Java/trains2.xml");

        trains = trainsReport.deMarshallingXML("C:/Java/trains2.xml");
        System.out.println("\nAll Trains list (with added trains):\n");
        System.out.println(trains.toString());


    }

}
