import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    ConferenceRoom confroom1;

    @Before
    public void before() {
        guest1 = new Guest("Liam");
        guest2 = new Guest("Fred");
        guest3 = new Guest("Jim");
        guest4 = new Guest("Ross");
        confroom1 = new ConferenceRoom(25, "Highland Business", 30);
    }

    @Test
    public void hasCapacity() {
        assertEquals(25, confroom1.getCapacity());
    }

    @Test
    public void hasHourlyRate() {
        assertEquals(30, confroom1.getHourlyRate());
    }

    @Test
    public void priceToRentConferenceRoom() {
        //Renting for 4 hours
        assertEquals(120, confroom1.getPriceToRentRoom(4), 0.01);
    }
}
