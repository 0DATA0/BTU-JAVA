import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationSquareTest {
    @Test
    public void stationTest1(){
        Passenger salome = new Passenger("სალომე", false);
        Passenger mari = new Passenger("მარი", false);
        Train train = new Train();
        train.addPassenger(salome);
        train.addPassenger(mari);

        assertEquals(0,train.getPassengerList().size());
    }

    @Test
    public void stationTest2(){
        Passenger salome = new Passenger("სალომე", true);
        Passenger mari = new Passenger("მარი", false);
        Train train = new Train();
        train.addPassenger(salome);
        train.addPassenger(mari);
        assertEquals(1,train.getPassengerList().size());
    }

    @Test
    public void stationTest3(){
        Passenger salome = new Passenger("სალომე", true);
        Passenger mari = new Passenger("მარი", true);
        Train train = new Train();
        train.addPassenger(salome);
        train.addPassenger(mari);

        assertEquals(2,train.getPassengerList().size());
    }


}
