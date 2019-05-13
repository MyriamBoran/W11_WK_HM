import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        this.plane = new Plane(Model.BOEING747, Airline.DELTA);
        this.passenger = new Passenger("Lara Croft");
    }

    @Test
    public void checkGetModel(){
        assertEquals(Model.BOEING747, plane.getModel());
    }

    @Test
    public void checkGetAirline(){
        assertEquals(Airline.DELTA, plane.getAirline());
    }

    @Test
    public void checkPassengersCount(){
        plane.addPassengerToPlane(passenger);
        assertEquals(1, plane.getPassengersCount());
    }
}
