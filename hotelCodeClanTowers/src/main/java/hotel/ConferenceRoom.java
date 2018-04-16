package hotel;

public class ConferenceRoom extends Room{
    private String roomName;


    public ConferenceRoom(String roomName,int roomCapacity, double roomRate){
        super(roomCapacity,roomRate);
    }

    public String getRoomName() {
        return roomName;
    }
}
