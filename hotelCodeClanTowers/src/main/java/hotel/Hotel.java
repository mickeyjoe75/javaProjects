package hotel;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<BedRoom> bedRooms;
    private ConferenceRoom conferenceRoom;
    private DiningRoom diningRoom;



    public Hotel(String name){
        this.name = name;
        bedRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(ArrayList<BedRoom> bedRooms) {
        this.bedRooms = bedRooms;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    public void addBedRoom(BedRoom bedRoom) {
        this.bedRooms.add(bedRoom);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int bedRoomCount(){
        return this.bedRooms.size();
    }

    public void serveFood(ArrayList<Guest>guests){
        this.diningRoom.checkInToRoom(Guest guests);
    }





}
