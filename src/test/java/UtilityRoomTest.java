import org.junit.Before;
import org.junit.Test;
import rooms.UtilityRoom;

import static org.junit.Assert.assertEquals;

public class UtilityRoomTest {

    UtilityRoom utilityRoom;

    @Before
    public void before() {
        utilityRoom = new UtilityRoom(12, "Dining");
    }

    @Test
    public void hasType() {
        assertEquals("Dining", utilityRoom.getType());
    }

    @Test
    public void canChangeType() {
        utilityRoom.setType("Maintenance");
        assertEquals("Maintenance", utilityRoom.getType());
    }
}
