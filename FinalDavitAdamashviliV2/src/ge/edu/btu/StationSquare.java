package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger gio = new Passenger("გიო", true);
        Passenger nika = new Passenger("ნიკა", false);
        Passenger ana = new Passenger("ანა", true);

        Train train = new Train();

        train.addPassenger(gio);
        train.addPassenger(nika);
        train.addPassenger(ana);

        printPassengers(train);

    }

    static void printPassengers(Train train){
        System.out.println("მგზავრების სია:");
        for(Passenger passenger : train.getPassengerList())
            System.out.println(passenger.getName());
    }
}
