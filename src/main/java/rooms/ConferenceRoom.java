package rooms;

import people.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends rooms.Room {

    String name;
    int hourlyRate;

    public ConferenceRoom(int capacity,String name, int hourlyRate) {
        super(capacity);
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getPriceToRentRoom(double hoursRented){
        return this.hourlyRate * hoursRented;
    }
}
