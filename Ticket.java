package Amusement_park_management;

public class Ticket {
    private String ticketId;
    private String ticketType;
    private double price;
    private String purchaseDateTime;
    private String status;

    public Ticket(String ticketId, String ticketType, double price, String purchaseDateTime, String status) {
        this.ticketId = ticketId;
        this.ticketType = ticketType;
        this.price = price;
        this.purchaseDateTime = purchaseDateTime;
        this.status = status;
    }

    public void activate() {
        System.out.println("--- Початок методу activate ---");
        System.out.println("--- Кінець методу activate ---");
    }

    public void charge() {
        System.out.println("--- Початок методу charge ---");
        System.out.println("--- Кінець методу charge ---");
    }

    public void invalidate() {
        System.out.println("--- Початок методу invalidate ---");
        System.out.println("--- Кінець методу invalidate ---");
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", price=" + price +
                ", purchaseDateTime='" + purchaseDateTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
