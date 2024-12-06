public class Customer implements Runnable {
    private TicketPool ticketPool;

    public Customer(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Ticket ticket = ticketPool.retrieveTicket();
                if (ticket != null) {
                    System.out.println("Customer retrieved: " + ticket);
                } else {
                    System.out.println("No tickets available!");
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Customer interrupted.");
        }
    }
}
