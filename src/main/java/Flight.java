public class Flight {
    private Plane plane;
    private int flightNumber;
    private AirportCode destination;
    private int tickets;

    public Flight(Plane plane, int flightNumber, AirportCode destination, int tickets){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.tickets = 40;
    }

    public Plane getPlane(){
        return plane;
    }

    public int getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination.getName();
    }

    public int sellTickets(){
        return this.tickets;
    }
}
