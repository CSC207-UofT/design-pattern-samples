package adapter.with_adapter;

import java.util.*;

public class ObjectTicketAdapter implements Tradable {

    /*
     * Adapter Type 1: Object Adapter
     *
     * An adapter class that allows a ticket to be traded (i.e; be sold to other customers).
     * This adapter is made by composition; i.e. the adapter contains an instance of the adaptee class;
     * i.e., the Ticket Class.
     */

    private final Ticket ticket;
    private final List<String> tradeHistory;


    public ObjectTicketAdapter(Ticket ticket) {
        this.ticket = ticket;
        this.tradeHistory = new ArrayList<>();
    }

    public void setOwner(String owner) {
        ticket.setOwner(owner);
    }

    public void trade(String newOwner) {
        String previousOwner = this.ticket.getOwner();
        this.ticket.setOwner(newOwner);
        this.addToHistory("(" + previousOwner + ", " + newOwner + ")");
    }

    public void addToHistory(String event) {
        tradeHistory.add(event);
    }

    public List<String> getTradeHistory() {
        return tradeHistory;
    }

    public void tradeUndo() {
        int lastTrade = getTradeHistory().size() - 1;
        String tradeLogOfLastTrade = getTradeHistory().get(lastTrade);
        String previousOwner = tradeLogOfLastTrade.split(",")[0].replace("(", "");
        this.ticket.setOwner(previousOwner);
        getTradeHistory().remove(lastTrade);

    }

    public String toString() {
        return ticket.toString();
    }
}