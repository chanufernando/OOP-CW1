package CLI;

public class Vendor implements Runnable {
    private TicketPool ticketPool;
    private int releaseRate;

    public Vendor(TicketPool ticketPool, int releaseRate) {
        this.ticketPool = ticketPool;
        this.releaseRate = releaseRate;
    }

    @Override
    public void run() {
        try {
            while (true) {
                ticketPool.addTicket(new Ticket((int) (Math.random() * 1000)));
                Thread.sleep(releaseRate);
            }
        } catch (InterruptedException e) {
            System.out.println("Vendor interrupted.");
        }
    }
}
