import hotel.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom room;

    @Before
    public void setUp(){
        room = new ConferenceRoom("Clyde",12,250);
    }

    @Test
    public void hasName(){
        assertEquals("Clyde",room.getRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(12,room.getRoomCapacity());
    }

    @Test
    public void hasRate(){
        assertEquals(250,room.getRoomRate(),0.01);
    }

}
