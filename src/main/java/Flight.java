public class Flight {

    private String destination;
    private int id;
    private Passenger passengerCollection;

    public Flight (String destination, int id){
        this.destination = destination;
        this.id = id;
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
