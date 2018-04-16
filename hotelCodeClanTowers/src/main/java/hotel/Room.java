package hotel;

import java.util.ArrayList;

public abstract class Room {


    private int roomCapacity;
    private ArrayList<Guest> guests;
    private double roomRate;



    public Room( int roomCapacity, double roomRate){
        this.roomCapacity = roomCapacity;
        this.roomRate = roomRate;

        this.guests = new ArrayList<Guest>();
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }


    public double getRoomRate() {
        return roomRate;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int guestPartySize(){
        return guests.size();
    }

    public boolean isRoomVacant(){
        return guestPartySize() == 0;
    }

    public boolean isRoomOccupied(){
        return guestPartySize() == roomCapacity;
    }

    public void checkInToRoom(Guest guest){
        guests.add(guest);
    }

    public void checkOutRoom(){
        guests.clear();
    }




}
