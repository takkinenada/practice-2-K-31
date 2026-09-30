package Amusement_park_management;

public class Attraction {
    private String attractionId;
    private String name;
    private String type;
    private int maxCapacity;
    private String currentStatus;
    private int minHeight;
    private int minAge;

    public Attraction(String attractionId, String name, String type, int maxCapacity, String currentStatus, int minHeight, int minAge) {
        this.attractionId = attractionId;
        this.name = name;
        this.type = type;
        this.maxCapacity = maxCapacity;
        this.currentStatus = currentStatus;
        this.minHeight = minHeight;
        this.minAge = minAge;
    }

    public void changeStatus() {
        System.out.println("--- Початок методу changeStatus ---");
        System.out.println("--- Кінець методу changeStatus ---");
    }

    public void startSession() {
        System.out.println("--- Початок методу startSession ---");
        System.out.println("--- Кінець методу startSession ---");
    }

    public void stopSession() {
        System.out.println("--- Початок методу stopSession ---");
        System.out.println("--- Кінець методу stopSession ---");
    }

    public void checkAvailability() {
        System.out.println("--- Початок методу checkAvailability ---");
        System.out.println("--- Кінець методу checkAvailability ---");
    }

    public void validateRequirements() {
        System.out.println("--- Початок методу validateRequirements ---");
        System.out.println("--- Кінець методу validateRequirements ---");
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "attractionId='" + attractionId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", currentStatus='" + currentStatus + '\'' +
                ", minHeight=" + minHeight +
                ", minAge=" + minAge +
                '}';
    }
}
