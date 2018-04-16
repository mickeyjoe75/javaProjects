package hotel;

import java.util.ArrayList;

public abstract class Room {


    private int roomCapacity;
    private ArrayList<Guest> occupants;
    private double roomRate;



    public Room( int roomCapacity, double roomRate){
        this.roomCapacity = roomCapacity;
        this.roomRate = roomRate;

        this.occupants = new ArrayList<Guest>();
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }


    public double getRoomRate() {
        return roomRate;
    }

    public ArrayList<Guest> getGuests() {
        return occupants;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int guestPartySize(){
        return occupants.size();
    }

    public boolean isRoomVacant(){
        return guestPartySize() == 0;
    }

    public boolean isRoomOccupied(){
        return guestPartySize() == roomCapacity;
    }

    public void checkInToRoom(Guest occupant){
        occupants.add(occupant);
    }

    public void checkOutRoom(){
        occupants.clear();
    }

    public void setOccupants(ArrayList<Guest> occupants) {
        this.occupants = occupants;
    }
}
