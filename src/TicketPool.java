
import java.util.LinkedList;
import java.util.Queue;

public class TicketPool {
    private Queue<Ticket> ticketQueue;

    public TicketPool() {
        this.ticketQueue = new LinkedList<>();
    }

    public void addTicket(Ticket ticket) {
        ticketQueue.offer(ticket);
    }

    public Ticket retrieveTicket() {
        return ticketQueue.poll();
    }

    public int getAvailableTickets() {
        return ticketQueue.size();
    }
}
