import java.io.FileWriter;
import java.io.PrintWriter;

//ADVANCED extension
//files stored on your system and add functionality to
// store the records of flights and passengers to their
// own files.

public class Saver {
    private Flight id;
    private Flight destination;
    private Flight passengerList;

    private Passenger name;
    private Passenger contactEmail;
    private Passenger contactNumber;
    private Passenger passengerID;

    public static void saver(Flight id,
                 Flight destination,
                 Flight passengerList,

                 Passenger name,
                 Passenger contactEmail,
                 Passenger contactNumber,
                 Passenger passengerID ) {

        String flightData =id+"||"+destination+"||"+passengerList ;//This is the data in the output file
        String passengerData =passengerID+"||"+name+"||"+contactEmail+"||"+contactNumber;//This is the data in the output file

        // in case there is only flight or passenger added, not both, therefore try(){}
        try (PrintWriter out = new PrintWriter("flightData.txt")) {
            out.println(flightData);
        }

        catch (Exception e) {
            e.getStackTrace();
        }

        try (PrintWriter out = new PrintWriter("flightData.txt")) {
            out.println(passengerData);
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
