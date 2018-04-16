import hotel.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom singleRoom;
    BedRoom doubleRoom;
    BedRoom familyRoom;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;

    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        singleRoom = new BedRoom(102, BedRoomType.SINGLE, 120, 1);
        doubleRoom = new BedRoom(202, BedRoomType.Double, 200, 2);
        familyRoom = new BedRoom(302, BedRoomType.Family, 250, 4);


        hotel = new Hotel("CodeClan Towers");
        guest1 = new Guest("Donna Dunlop", 2);
        guest2 = new Guest("Scott Miller", 4);


    }

    @Test
    public void hotelHasname(){
        assertEquals("CodeClan Towers",hotel.getName());
    }

    @Test public void canAddBedRoom(){
        hotel.addBedRoom(doubleRoom);
        assertEquals(1,hotel.bedRoomCount());
    }





}
