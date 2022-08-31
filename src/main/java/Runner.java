import java.awt.print.Book;
import java.util.Scanner;

public class Runner {

    static Booker booker = new Booker();

    public static void greet(){
        System.out.println("WELCOME TO Team 5's TRAVELS! Press enter to continue");
        Scanner scanner1 = new Scanner(System.in);
        scanner1.nextLine();

        System.out.println(" To add a new flight press 1");
        System.out.println(" To display all available flights press 2");
        System.out.println(" To add a new passenger press 3");
        System.out.println(" To book a passenger onto a flight press 4");
        System.out.println(" To cancel a flight press 5");

        Scanner scanner2 = new Scanner(System.in);
        int action = scanner2.nextInt();



        if (action == 1){
            booker.addFlight();

        } else if (action == 2) {
            booker.displayFlights();

        } else if (action == 3) {
            booker.addPassenger();

        } else if (action == 4) {
            // Need to book passenger onto flight
            booker.addPassengerToFlight(booker.getPassengerToAddToFlight(),booker.getFlightToAddPassengerTo());


        } else if (action == 5) {
            booker.removeFlight();

        }

        for (Destination destination : Destination.values()) {
            System.out.println(destination);

        }

        Runner.greet();

    }


    }

