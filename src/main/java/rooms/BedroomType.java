package rooms;

public enum BedroomType {

    SINGLE(1, 20),
    DOUBLE(2, 40),
    TWIN(2, 35),
    FAMILY(4, 50);

    private int capacity;
    private int rate;

    BedroomType(int capacity, int rate) {
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }
}
