import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Configuration config = new Configuration();
        TicketPool ticketPool = new TicketPool();

        System.out.println("Welcome to the Ticketing System CLI!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Configure System");
            System.out.println("2. Add Tickets");
            System.out.println("3. Retrieve Tickets");
            System.out.println("4. Show Configuration");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Total Tickets: ");
                    int totalTickets = scanner.nextInt();
                    System.out.print("Enter Max Capacity: ");
                    int maxCapacity = scanner.nextInt();
                    System.out.print("Enter Release Rate (ms): ");
                    int releaseRate = scanner.nextInt();
                    config.setTotalTickets(totalTickets);
                    config.setMaxCapacity(maxCapacity);
                    config.setReleaseRate(releaseRate);
                    System.out.println("Configuration updated!");
                    break;

                case 2:
                    System.out.print("Enter number of tickets to add: ");
                    int ticketsToAdd = scanner.nextInt();
                    for (int i = 0; i < ticketsToAdd; i++) {
                        ticketPool.addTicket(new Ticket(i + 1));
                    }
                    System.out.println(ticketsToAdd + " tickets added!");
                    break;

                case 3:
                    System.out.print("Enter number of tickets to retrieve: ");
                    int ticketsToRetrieve = scanner.nextInt();
                    for (int i = 0; i < ticketsToRetrieve; i++) {
                        Ticket ticket = ticketPool.retrieveTicket();
                        if (ticket != null) {
                            System.out.println("Retrieved: " + ticket);
                        } else {
                            System.out.println("No tickets available!");
                        }
                    }
                    break;

                case 4:
                    System.out.println(config);
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
