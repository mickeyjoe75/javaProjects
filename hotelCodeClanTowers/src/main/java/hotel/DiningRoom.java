package hotel;

public class DiningRoom extends Room{
    private String roomName;

    public DiningRoom( int roomCapacity, double roomRate, String roomName){
        super(roomCapacity, roomRate);
    }

    public String getRoomName() {
        return roomName;
    }
}
