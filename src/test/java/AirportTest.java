import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Airport airport;
    Plane plane;
    Flight flight;

    @Before
    public void before(){
        airport = new Airport(AirportCode.LCY);
        plane = new Plane(Model.BOMBARDIER, Airline.EMIRATES);
        flight = new Flight(plane, 909, airport.getAirportCode(), 40);

    }

    @Test
    public void checkGetAirportCode(){
        assertEquals(AirportCode.LCY, airport.getAirportCode());
    }

    @Test
    public void checkAddPlaneToHangar(){
        airport.addPlaneToHangar(plane);
        assertEquals(1, airport.countHowManyPlaneInHangar());
    }

    @Test
    public void checkCreateFlight(){
        airport.addPlaneToHangar(plane);
        airport.createFlight(plane, 1, flight);
        assertEquals(1, airport.countHowManyPlaneInHangar());
    }

    @Test
    public void checkSellTicket(){
        assertEquals(40, flight.sellTickets());
    }
}
