package Leave_tracking_system;

public class Employee {
    // Properties (attributes)
    private int employeeId;
    private String name;
    private String department;
    private String email;

    // Constructor
    public Employee(int employeeId, String name, String department, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    // Methods will be added here
    private int leaveBalance = 20; // Annual leave balance in days

    // Getter method
    public int getLeaveBalance() {
        return leaveBalance;
    }

    // Setter method with validation
    public void setLeaveBalance(int leaveBalance) {
        if (leaveBalance >= 0) {
            this.leaveBalance = leaveBalance;
        } else {
            System.out.println("Leave balance cannot be negative.");
        }
    }

}