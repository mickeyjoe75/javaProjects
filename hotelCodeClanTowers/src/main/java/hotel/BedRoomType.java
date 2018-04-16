package hotel;

public enum BedRoomType {
    SINGLE("Single", 1),
    Double("Double", 2),
    Family("Family", 4);

    private String roomType;
    private int roomCapacity;


    BedRoomType(String roomType, int roomCapacity){
        this.roomType = roomType;
        this.roomCapacity = roomCapacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }
}
