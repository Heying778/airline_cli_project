import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Booker {


    //    PROPERTIES -------
    private ArrayList<Flight> flightArrayList;
    private ArrayList<Passenger> passengerArrayList;

    //    CONSTRUCTOR -------
    public Booker(){

        flightArrayList = new ArrayList<>();
        passengerArrayList = new ArrayList<>();


    }
//      METHODS --------




    //    Add a new flight:
    public void addFlight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter destination:");
        String destination = scanner.nextLine();
        Random rand = new Random();
        int ID = rand.nextInt(100);

        Flight flight = new Flight(destination,ID,passengerArrayList);

        flightArrayList.add(flight);
        System.out.println("A flight to " + flight.getDestination() +" has been added to" + " flight list");
        System.out.println(flightArrayList.size());
    }

    public void removeFlight() {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        for (Flight flight : flightArrayList){
            if (destination.equals(flight.getDestination())){
                flightArrayList.remove(flight);
            } else {
                System.out.println("No flights found matching that destination");
            }
        }


    }

    public List<Flight> LookForDestination(String destination) {
        List<Flight> searchingResult = flightArrayList.stream()
                .filter(des -> des.getDestination().equals(destination))
                .toList();
        return searchingResult;
    }

    //    Display all available flights:
    public void displayFlights(){
        System.out.println("We have flights to: ");
        for (Flight flight : flightArrayList) {
            System.out.println(flight.getDestination());
        }
    }

//    Add a new passenger

    public void addPassenger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, contact number and email:");
        String name = scanner.nextLine();
        String contactNumber = scanner.nextLine();
        String contactEmail = scanner.nextLine();
        Random rand = new Random();
        int ID = rand.nextInt(100);

        Passenger passenger = new Passenger(name,contactEmail,contactNumber,ID);
        passengerArrayList.add(passenger);
        System.out.println(passenger.getName() +" has been added to " + "flight list");

    }

    public void addPassengerToFlight(Passenger passenger, Flight flight){
        ArrayList<Passenger> currentPassengerList =  flight.getPassengerList();
        currentPassengerList.add(passenger);
        flight.setPassengerList(currentPassengerList);

//        flight.setPassengerList(passengerArrayList);
        System.out.println("Passengers currently on this flight now are:");
        for (Passenger p: currentPassengerList){
            System.out.println(p.getName());
        }

    }

    public Passenger getPassengerToAddToFlight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the passenger?");
        String passengerName = scanner.nextLine();
        for (Passenger passenger: passengerArrayList){
            if (passengerName.equals(passenger.getName())){
                return passenger;
            }
        }

        return null;
    }

    public Flight getFlightToAddPassengerTo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which flight would you like to add passenger to?");
        String flightDestination = scanner.nextLine();
        for (Flight flight: flightArrayList){
            if (flightDestination.equals(flight.getDestination())){
                return flight;
            }
        }

        return null;
    }


}
