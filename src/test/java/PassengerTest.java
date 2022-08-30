import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PassengerTest {
    private Passenger passenger;
    private Booker booker;

    @Test
    public void canCollectPassengerInfo(){
        booker.addPassenger();
        String expected = "DBCooper";
        String actual = passenger.getName();

        assertEquals(expected,actual);
    }
}
