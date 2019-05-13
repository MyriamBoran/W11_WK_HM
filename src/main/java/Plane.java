import java.util.ArrayList;

public class Plane {
    private Model model;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(Model model, Airline airline) {
        this.model = model;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public Model getModel(){
        return model;
    }

    public Airline getAirline(){
        return airline;
    }

    public void addPassengerToPlane(Passenger client){
        this.passengers.add(client);
    }

    public int getPassengersCount(){
        return passengers.size();
    }
}
