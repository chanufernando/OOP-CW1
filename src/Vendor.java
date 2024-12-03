public class Vendor implements Runnable {
    private final TicketPool pool;
    private final int releaseRate;

    public Vendor(TicketPool pool, int releaseRate) {
        this.pool = pool;
        this.releaseRate = releaseRate;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; ; i++) {
                pool.addTickets(i);
                Thread.sleep(1000 / releaseRate);
            }
        } catch (InterruptedException e) {
            System.err.println("Vendor interrupted.");
        }
    }
}
