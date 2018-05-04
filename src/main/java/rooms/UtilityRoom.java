package rooms;

public class UtilityRoom extends rooms.Room {

    String type;

    public UtilityRoom(int capacity, String type) {
        super(capacity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
