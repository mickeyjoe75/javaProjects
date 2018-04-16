package hotel;

public class Guest {
    private String guestName;
    private int guestPartySize;

    public Guest ( String guestName, int guestPartySize){
        this.guestName = guestName;
        this.guestPartySize = guestPartySize;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getGuestPartySize() {
        return guestPartySize;
    }
}
