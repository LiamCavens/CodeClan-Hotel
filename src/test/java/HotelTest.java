import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.UtilityRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel1;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    UtilityRoom diningroom;
    UtilityRoom lobby;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;
    Guest guest6;

    @Before
    public void before() {
        guest1 = new Guest("Liam");
        guest2 = new Guest("Edwardo");
        guest3 = new Guest("Stuwie");
        guest4 = new Guest("Mad Fraz");
        guest5 = new Guest("Doland Troomp");
        guest6 = new Guest("Posh Lyle");

        bedroom1 = new Bedroom(3, 69, "Triple Deluxe", 80);
        bedroom2 = new Bedroom(2, 32, "Exec Double", 120);

        conferenceRoom = new ConferenceRoom(25, "Stag Do Party", 45);

        diningroom = new UtilityRoom(30, "Dining Hall");
        lobby = new UtilityRoom(50, "lobby");

        hotel1 = new Hotel("MegaPalace", 3.5);

        bedroom1.addGuestsToRoom(guest1);
        bedroom1.addGuestsToRoom(guest2);
        bedroom1.addGuestsToRoom(guest3);
        hotel1.addBedroomToList(bedroom1);
        hotel1.addBedroomToList(bedroom2);
        hotel1.addConferenceRoomToList(conferenceRoom);
        hotel1.addUtilityToList(diningroom);
        hotel1.addUtilityToList(lobby);

    }

    @Test
    public void hotelHasName() {
        assertEquals("MegaPalace", hotel1.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(3.5, hotel1.getRating(), 0.01);
    }

    @Test
    public void changeHotelName() {
        hotel1.setName("MegaPalabongo");
        assertEquals("MegaPalabongo", hotel1.getName());
    }

    @Test
    public void changeRating() {
        hotel1.setRating(4.5);
        assertEquals(4.5, hotel1.getRating(), 0.01);
    }

    @Test
    public void checkGuestIntoRoomWhenVacant() {
        hotel1.checkGuestInToRoomIfSpace(guest4, bedroom2);
        assertEquals(1, bedroom2.getGuestsInRoom());
    }

    @Test
    public void doNotCheckGuestInWhenFull() {
        hotel1.checkGuestInToRoomIfSpace(guest4, bedroom1);
        assertEquals(3, bedroom1.getGuestsInRoom());
    }

    @Test
    public void getNameofGuestsInRoom() {
        assertEquals(3, hotel1.getGuestsInRoom(bedroom1).size());
    }

    @Test
    public void getFreeRoom(){
        assertEquals("Exec Double, Room 32", hotel1.checkForVacantRoom(bedroom2));
    }

    @Test
    public void getNumberofVacantRooms() {
        Bedroom emptybedroom1 = new Bedroom(1, 23, "Empty", 10);
        Bedroom emptybedroom2 = new Bedroom(2, 24, "Empty2", 10);
        assertEquals(3, hotel1.getVacantRooms().size());
    }
}
