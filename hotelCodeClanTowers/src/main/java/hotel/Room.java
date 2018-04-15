package hotel;

public abstract class Room {

    String roomCategory;
    int roomCapacity;

    public Room( String roomCategory, int roomCapacity){
        this.roomCategory = roomCategory;
        this.roomCapacity = roomCapacity;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }
}
