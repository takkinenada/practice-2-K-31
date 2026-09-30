package Amusement_park_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> userTickets = new ArrayList<>();
        userTickets.add("TICKET-999");

        Visitor visitor = new Visitor("V-001", 17, 175, userTickets);
        System.out.println("--- Тестування класу Visitor ---");
        visitor.buyTicket();
        System.out.println(visitor.toString());
        System.out.println();

        Attraction attraction = new Attraction("A-010", "Американські гірки", "Екстремальний", 24, "Активний", 140, 14);
        System.out.println("--- Тестування класу Attraction ---");
        attraction.startSession();
        System.out.println(attraction.toString());
        System.out.println();

        Ticket ticket = new Ticket("TICKET-999", "Безлімітний", 550.0, "2026-09-28 10:00", "Активний");
        System.out.println("--- Тестування класу Ticket ---");
        ticket.activate();
        System.out.println(ticket.toString());
        System.out.println();
        
        Employee employee = new Employee("EMP-404", "Олександр Петренко", "Оператор", "A-010", "Зміна 1 (00:00 - 22:00)");
        System.out.println("--- Тестування класу Employee ---");
        employee.scanTicket();
        System.out.println(employee.toString());
    }
}