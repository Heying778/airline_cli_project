import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookerTest {
    Passenger passenger;

    Booker booker;

    Flight flight;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger("DBCooper","gmail","075",99);
        ArrayList<Passenger> passengerList = new ArrayList<>();
        flight = new Flight("London",12,passengerList);
        booker = new Booker();

    }

    @Test
    public void canAddPassengerToFlight(){
        ArrayList<Passenger> currentList = flight.getPassengerList();
        currentList.add(passenger);
        String expected = "DBCooper";
        String actual = currentList.get(0).getName();

        assertEquals(expected,actual);
    }

//    @Test
//    public void canAddFlight(){
//
//    }
}
