package hotel;

public class BedRoom extends Room {
    private int roomNumber;
    private BedRoomType roomType;


    public BedRoom(int roomNumber, BedRoomType roomType, double roomRate, int roomCapacity, String roomName){
        super(roomCapacity,roomRate, roomName);
        this.roomType =roomType;
        this.roomNumber =roomNumber;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType.getRoomType();
    }

    @Override
    public double getRoomRate() {
        return super.getRoomRate();
    }
}
