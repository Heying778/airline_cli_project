import java.awt.print.Book;
import java.util.Scanner;
import java.util.UUID;

public class Runner {

    static Booker booker = new Booker();

    public static void greet () throws InterruptedException {
        System.out.println(" 🛫 WELCOME To EasyTRAVELS! 🛬");
        Thread.sleep(1000); // 1000ms = 1s
        System.out.println("Press \"E\" to Exit or \"ENTER\" To Continue");

        Scanner scanner1 = new Scanner(System.in);
        String userChoice = scanner1.nextLine();

//        if user input is Y, Options are printed, else it prints "thank you..." and ends"
        scanner1.nextLine();
        if (userChoice.equals("e")) {
            System.out.println("Thank You For Using Our Services.");
        } else {

            System.out.println(":::THIS IS A SELF-SERVICE SYSTEM:::");
            System.out.println("");

            System.out.println(" To Add A New Flight Press 1");
            System.out.println(" To Display All Available Flights Press 2");
            System.out.println(" To Add A New Passenger Press 3");
            System.out.println(" To Book A Passenger Onto A Flight Press 4");
            System.out.println(" To Cancel A Flight Press 5");

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
                UUID userId = UUID.randomUUID();
                Thread.sleep(900); // 900ms = 0.9s
                System.out.println("GENERATING PASSENGER ID...");
                System.out.println("");
                Thread.sleep(1000); // 1000ms = 1s
                System.out.println("PassengerId: " + userId);
                System.out.println("");

            } else if (action == 4) {
                booker.addPassengerToFlight(booker.getPassengerToAddToFlight(), booker.getFlightToAddPassengerTo());

            } else if (action == 5) {
                System.out.println("Please Key In Your Unique ID Number");
                Scanner scanner3 = new Scanner(System.in);
                int PassengerID = Integer.parseInt(scanner1.nextLine());
                booker.removeFlight();
                System.out.println(PassengerID + " Flight Has Been Cancelled");
                System.out.println("");

            }

//        }

            Runner.greet();

        }




    }
}

