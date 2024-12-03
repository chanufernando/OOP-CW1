public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the CLI Ticketing System!");

        Configuration config = new Configuration();
        config.configureSystem();

        TicketPool pool = new TicketPool(config.getMaxTicketCapacity());

        Thread vendorThread = new Thread(new Vendor(pool, config.getTicketReleaseRate()));
        Thread customerThread = new Thread(new Customer(pool, config.getCustomerRetrievalRate()));

        vendorThread.start();
        customerThread.start();
    }
}
