import hotel.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom room;

    @Before
    public void setUp(){
        room = new DiningRoom( 50,100,"Mezzanine");
    }

    @Test
    public void roomHasName(){
        assertEquals("Mezzanine",room.getRoomName());
    }

    @Test
    public void roomHasRate(){
        assertEquals(100,room.getRoomRate(),0.01);
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(50,room.getRoomCapacity());
    }


}
