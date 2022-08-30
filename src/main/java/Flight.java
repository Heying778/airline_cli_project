import java.util.List;

public class Flight {
//      a destination, an id and a collection of passengers.
    private String destination;
    private int id;
    private List<Passenger>passengerList;

    public Flight (String destination, int id, List<Passenger> passengerList){
        this.destination = destination;
        this.id = id;
        this.passengerList = passengerList;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
