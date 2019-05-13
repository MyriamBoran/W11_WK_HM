import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> hangar;
    private AirportCode code;
    private ArrayList<Flight> flights;

    public Airport(AirportCode code){
        this.code = code;
        this.hangar = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public AirportCode getAirportCode(){
        return code;
    }

    public ArrayList<Plane> getHangar(){
        return hangar;
    }

    public int countHowManyPlaneInHangar(){
        return hangar.size();
    }

    public void addPlaneToHangar(Plane plane){
        this.hangar.add(plane);

    }

    public ArrayList<Flight> getFlights(){
        return flights;
    }

    public Flight getFlightNumber(int flightNumber){
        return flights.get(flightNumber);
    }

    public void createFlight(Plane plane, int flightNumber, Flight destination){
        ArrayList<Flight> newFlight = new ArrayList<>();
        if (this.hangar.contains(plane)){
            newFlight.add(destination);
            System.out.println(newFlight);
        }
        return;
    }

    public void sellTicket(int flightNumber){
        Flight flight = this.flights.get(flightNumber);
        flight.sellTickets();
    }

}
