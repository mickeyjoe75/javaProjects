package hotel;

import java.util.ArrayList;

public abstract class Room {


    private int roomCapacity;
    private ArrayList<Guest> guests;
    private double roomRate;
    private String roomName;


    public Room( int roomCapacity, double roomRate, String roomName){
        this.roomCapacity = roomCapacity;
        this.roomRate = roomRate;
        this.roomName = roomName;
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public String getRoomName() {
        return roomName;
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
