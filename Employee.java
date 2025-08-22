package Leave_tracking_system;

public class Employee {
    // Properties (attributes)
    private int employeeId;
    private String name;
    private String department;
    private String email;

    //default constructor
    public Employee(){
        this.employeeId = 0;
        this.name = "Unknown";
        this.department = "Not Assigned";
        this.email = "noemail@company.com";
    }

    // Constructor
    public Employee(int employeeId, String name, String department, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public void setEmployeeId(int employeeId) {this.employeeId = employeeId;}
    public void setName(String name){this.name=name;}
    public void setDepartment(String department) {this.department = department;}
    public void setEmail(String email) {this.email = email;}

    public int getEmployeeId() {return employeeId;}
    public String getName() {return name;}
    public String getDepartment() {return department;}
    public String getEmail() {return email;}

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
    public void deductLeave(int days){
        if (days <= leaveBalance && days>0) {
            leaveBalance -=days;
        }else{
            System.out.println("Insufficient leave balance or invalid days");
        }
    }
}