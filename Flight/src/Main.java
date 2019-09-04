import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FlightDataBase flightDataBase = new FlightDataBase();
        flightDataBase.checkIfFlightExists("Berlin", "Tokyo");
    }
}

class Flight {
    String deporture, arrival;

    public Flight(String deporture, String arrival) {
        this.arrival = arrival;
        this.deporture = deporture;
    }

    public void flightFrom() {
        System.out.println("Lot z: " + this.deporture + " do: " + this.arrival);
    }
}

class FlightDataBase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDataBase() {
        this.flights.add(new Flight("Berlin", "Tokyo"));
        this.flights.add(new Flight("London", "Warsaw"));
        this.flights.add(new Flight("Berlin", "Moskow"));
        this.flights.add(new Flight("Madrid", "Tokyo"));
        this.flights.add(new Flight("Porto", "Paris"));
    }

    public void checkIfFlightExists(String start, String end) {
        boolean notExist = true;
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (start.equals(flight.deporture) && (end.equals(flight.arrival))) {
                System.out.println("Flight exist!!!");
                notExist = false;
            }
        }
        if (notExist){
            System.out.println("Flight with given params not exist");
        }
    }
}




