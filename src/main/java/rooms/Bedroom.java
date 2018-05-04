package rooms;

import people.Guest;

import java.util.ArrayList;

public class Bedroom extends rooms.Room {

    int roomNumber;
    String type;
    int nightRate;

    public Bedroom(int capacity, int roomNumber, String type, int nightRate) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightRate = nightRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomName() {
        return type;
    }

    public void setRoomName(String type) {
        this.type = type;
    }

    public int getNightRate() {
        return nightRate;
    }

    public void setNightRate(int nightRate) {
        this.nightRate = nightRate;
    }

}

