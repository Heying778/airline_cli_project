import java.awt.print.Book;
import java.util.Scanner;

public class Runner {

    static Booker booker = new Booker();

    public static void greet() {
        System.out.println("WELCOME TO Team 5's TRAVELS! Press \"E\" to Exit & \"ENTER\" To Continue");
        Scanner scanner1 = new Scanner(System.in);
        String userChoice = scanner1.nextLine();

//        if user input is Y, Options are printed, else it prints "thank you..." and ends"
        scanner1.nextLine();
        if (userChoice.equals("e")) {
            System.out.println("Thank You For Using Our Services");
        } else {

            System.out.println(" To add a new flight press 1");
            System.out.println(" To display all available flights press 2");
            System.out.println(" To add a new passenger press 3");
            System.out.println(" To book a passenger onto a flight press 4");
            System.out.println(" To cancel a flight press 5");

            Scanner scanner2 = new Scanner(System.in);
            int action = scanner2.nextInt();


            if (action == 1) {
                booker.addFlight();

            } else if (action == 2) {
//            booker.displayFlights();
                for (Destination destination : Destination.values()) {
                    System.out.println(destination);

                }

            } else if (action == 3) {
                booker.addPassenger();

            } else if (action == 4) {
                booker.addPassengerToFlight(booker.getPassengerToAddToFlight(), booker.getFlightToAddPassengerTo());

            } else if (action == 5) {
                booker.removeFlight();

            }

//        }

            Runner.greet();

        }


    }
}

