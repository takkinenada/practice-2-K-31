package Amusement_park_management;

import java.util.List;

public class Visitor {
    private String visitorId;
    private int age;
    private int height;
    private List<String> activeTickets;

    public Visitor(String visitorId, int age, int height, List<String> activeTickets) {
        this.visitorId = visitorId;
        this.age = age;
        this.height = height;
        this.activeTickets = activeTickets;
    }

    public void buyTicket() {
        System.out.println("--- Початок методу buyTicket ---");
        System.out.println("--- Кінець методу buyTicket ---");
    }

    public void enterAttraction() {
        System.out.println("--- Початок методу enterAttraction ---");
        System.out.println("--- Кінець методу enterAttraction ---");
    }

    public void provideInfo() {
        System.out.println("--- Початок методу provideInfo ---");
        System.out.println("--- Кінець методу provideInfo ---");
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "visitorId='" + visitorId + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", activeTickets=" + activeTickets +
                '}';
    }
}