public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Madryt");
        flight.flightFrom();
    }
}

class Flight{
    String deporture, arrival;
    public Flight(String deporture, String arrival){
        this.arrival = arrival;
        this.deporture = deporture;
    }
    public void flightFrom(){
        System.out.println("Lot z: " + this.deporture + " do: " +this.arrival);
    }
}
