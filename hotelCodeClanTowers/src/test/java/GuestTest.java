import hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp(){
        guest = new Guest("Marcella Backland",4);
    }

    @Test
    public void guestHasName(){
        assertEquals("Marcella Backland",guest.getGuestName());
    }

    @Test
    public void guestpartysize(){
        assertEquals(4,guest.getGuestPartySize());
    }



}
