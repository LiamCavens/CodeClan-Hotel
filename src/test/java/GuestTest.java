import org.junit.Before;
import people.Guest;

public class GuestTest {

    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Liam");
    }
}
