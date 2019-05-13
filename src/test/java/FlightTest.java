import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Airport airport;

    @Before
    public void before(){
        plane = new Plane(Model.BOEING747, Airline.DELTA);
        airport = new Airport(AirportCode.GLA);
        flight = new Flight(plane, 23, airport.getAirportCode(), 40);
    }

    @Test
    public void checkGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void checkGetFlightNumber(){
        assertEquals(23, flight.getFlightNumber());
    }

    @Test
    public void checkGetDestination(){
        assertEquals("Glasgow International Airport", flight.getDestination());
    }

    @Test
    public void checkCanGetAirport(){
        assertEquals(AirportCode.GLA, airport.getAirportCode());
    }
}
