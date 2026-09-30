package Amusement_park_management;

public class Employee {
    private String employeeId;
    private String fullName;
    private String position;
    private String assignedAttractionId;
    private String workSchedule;

    public Employee(String employeeId, String fullName, String position, String assignedAttractionId, String workSchedule) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.position = position;
        this.assignedAttractionId = assignedAttractionId;
        this.workSchedule = workSchedule;
    }

    public void manageAttraction() {
        System.out.println("--- Початок методу manageAttraction ---");
        System.out.println("--- Кінець методу manageAttraction ---");
    }

    public void performMaintenance() {
        System.out.println("--- Початок методу performMaintenance ---");
        System.out.println("--- Кінець методу performMaintenance ---");
    }

    public void scanTicket() {
        System.out.println("--- Початок методу scanTicket ---");
        System.out.println("--- Кінець методу scanTicket ---");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", assignedAttractionId='" + assignedAttractionId + '\'' +
                ", workSchedule='" + workSchedule + '\'' +
                '}';
    }
}