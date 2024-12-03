public class Customer implements Runnable {
    private final TicketPool pool;
    private final int retrievalRate;

    public Customer(TicketPool pool, int retrievalRate) {
        this.pool = pool;
        this.retrievalRate = retrievalRate;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int ticket = pool.removeTicket();
                Thread.sleep(1000 / retrievalRate);
            }
        } catch (InterruptedException e) {
            System.err.println("Customer interrupted.");
        }
    }
}
