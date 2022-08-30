import java.util.ArrayList;
import java.util.List;

public class Booker {


//    PROPERTIES -------
    private ArrayList<Flight>flightArrayList;
    private Passenger passenger;

//    CONSTRUCTOR -------
    public Booker(){

        this.flightArrayList = new ArrayList<>();


    }
//METHODS --------




    //    Add a new flight:
    public void addFlight(Flight flight) {
        this.flightArrayList.add(flight);
        System.out.println(flight + "" + "has been added to " + "flight list");
    }

    public void removeFlight(Flight flight) {
        this.flightArrayList.remove(flight);

    }

    public List<Flight> LookForDestination(String destination) {
        List<Flight> searchingResult = flightArrayList.stream()
                .filter(des -> des.getDestination().equals(destination))
                .toList();
        return searchingResult;
    }

    //    Display all available flights:
    public void displayFlights(){
        for (Flight flight : flightArrayList) {
            System.out.println(flight);
        }
    }

//    Add a new passenger
//    Book a passenger onto a flight
//    Cancel a flight


}
