import java.util.Scanner;

public class Configuration {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    public void configureSystem() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter total number of tickets:");
            totalTickets = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter ticket release rate (tickets per second):");
            ticketReleaseRate = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter customer retrieval rate (tickets per second):");
            customerRetrievalRate = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter maximum ticket capacity:");
            maxTicketCapacity = Integer.parseInt(scanner.nextLine());

            System.out.println("System configured successfully!");
            System.out.println(this);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter numeric values.");
        }
    }

    @Override
    public String toString() {
        return "Total Tickets: " + totalTickets +
                "\nTicket Release Rate: " + ticketReleaseRate +
                "\nCustomer Retrieval Rate: " + customerRetrievalRate +
                "\nMax Ticket Capacity: " + maxTicketCapacity;
    }

    // Getters to use the configuration in other classes
    public int getTotalTickets() { return totalTickets; }
    public int getTicketReleaseRate() { return ticketReleaseRate; }
    public int getCustomerRetrievalRate() { return customerRetrievalRate; }
    public int getMaxTicketCapacity() { return maxTicketCapacity; }
}
