import people.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.Room;
import rooms.UtilityRoom;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private double rating;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<UtilityRoom> utilityRooms;


    public Hotel(String name, double rating) {
        this.name = name;
        this.rating = rating;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.utilityRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addBedroomToList(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoomToList(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addUtilityToList(UtilityRoom utilityRoom) {
        this.utilityRooms.add(utilityRoom);
    }

    public void checkGuestInToRoomIfSpace(Guest guest, Bedroom bedroom) {
        if (bedroom.getGuestsInRoom() < bedroom.getCapacity()) {
            bedroom.addGuestsToRoom(guest);
        }
    }

    public void checkGuestOut(Guest guest, Bedroom bedroom) {
        bedroom.removeGuestFromRoom(guest);
    }

    public ArrayList<Guest> getGuestsInRoom(Room room) {
        return room.getGuests();
    }

    public String checkForVacantRoom(Bedroom bedroom){
        if (bedroom.getGuestsInRoom() == 0){
            return "" + bedroom.getRoomName()+ ", Room " + bedroom.getRoomNumber() + "";
        } return "No Vacant Rooms";
    }

    public ArrayList<Bedroom> getVacantRooms(){
        ArrayList<Bedroom> vacantRooms = new ArrayList<>();
        for(Bedroom bedroom : this.bedrooms) {
            if (bedroom.getGuestsInRoom() == 0) {
                vacantRooms.add(bedroom);
            }
        } return vacantRooms;
    }

    public int guestStaysMultipleNights(Bedroom bedroom, int nightsStaying){
        return (bedroom.getNightRate() * nightsStaying);
    }
}
