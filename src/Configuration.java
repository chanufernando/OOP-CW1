public class Configuration {
    private int totalTickets;
    private int maxCapacity;
    private int releaseRate;

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getReleaseRate() {
        return releaseRate;
    }

    public void setReleaseRate(int releaseRate) {
        this.releaseRate = releaseRate;
    }

    @Override
    public String toString() {
        return "System Configuration:\n" +
                "Total Tickets: " + totalTickets + "\n" +
                "Max Capacity: " + maxCapacity + "\n" +
                "Release Rate: " + releaseRate + " ms\n";
    }
}
