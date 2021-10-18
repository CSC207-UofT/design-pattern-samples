package adapter.with_adapter;

import java.time.*;

public class Ticket {

    /*
     * A simple legacy ticket class with a basic set of functionalities.
     */

    protected String id;
    protected String owner;
    protected String showName;
    protected LocalDateTime date;
    protected String seat;

    public Ticket(String id, String show, LocalDateTime date, String seat) {
        this.id = id;
        this.showName = show;
        this.date = date;
        this.seat = seat;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public String toString() {
        return "Ticket owned by " + owner + " for " + showName;
    }

}