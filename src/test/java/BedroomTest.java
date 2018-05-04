import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.Bedroom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Liam");
        guest2 = new Guest("Heather");
        bedroom1 = new Bedroom(2, 13, "Deluxe", 50);
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void hasRoomType() {
        assertEquals("Deluxe", bedroom1.getRoomName());
    }

    @Test
    public void hasRoomRate() {
        assertEquals(50, bedroom1.getNightRate());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(13, bedroom1.getRoomNumber());
    }

    @Test
    public void canChangeRate() {
        bedroom1.setNightRate(55);
        assertEquals(55, bedroom1.getNightRate());
    }

    @Test
    public void canAddGuestToRoom() {
        bedroom1.addGuestsToRoom(guest1);
        assertEquals(1, bedroom1.getGuestsInRoom());
    }
}
