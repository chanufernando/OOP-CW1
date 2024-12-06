
public class Ticket {
    private int ticketId;

    public Ticket(int ticketId) {
        this.ticketId = ticketId;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId;
    }
}
