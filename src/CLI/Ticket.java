package CLI;

public class Ticket {
    private int id;

    public Ticket(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id;
    }
}
