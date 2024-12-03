import java.util.LinkedList;
import java.util.Queue;

public class TicketPool {
    private final Queue<Integer> tickets = new LinkedList<>();
    private final int maxCapacity;

    public TicketPool(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public synchronized void addTickets(int ticket) throws InterruptedException {
        while (tickets.size() >= maxCapacity) {
            wait(); // Wait if the pool is full
        }
        tickets.offer(ticket);
        System.out.println("Added ticket: " + ticket);
        notifyAll(); // Notify waiting threads
    }

    public synchronized int removeTicket() throws InterruptedException {
        while (tickets.isEmpty()) {
            wait(); // Wait if the pool is empty
        }
        int ticket = tickets.poll();
        System.out.println("Removed ticket: " + ticket);
        notifyAll(); // Notify waiting threads
        return ticket;
    }
}
