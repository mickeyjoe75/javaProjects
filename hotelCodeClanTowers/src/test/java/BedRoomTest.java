import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import hotel.BedRoom;
import hotel.BedRoomType;
import hotel.Guest;
import org.junit.Before;

import java.util.ArrayList;

public class BedRoomTest {
    BedRoom singleRoom;
    BedRoom doubleRoom;
    BedRoom familyRoom;

    Guest guest1;
    Guest guest2;

    @Before
    public void setUp(){
        singleRoom = new BedRoom(102,BedRoomType.SINGLE,120,1);
        doubleRoom = new BedRoom(202,BedRoomType.Double,200,2);
        familyRoom = new BedRoom(302,BedRoomType.Family,250,4);

        guest1 = new Guest("Donna Dunlop",2);
        guest2 = new Guest("Scott Miller",4);




    }












}
