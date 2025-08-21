package Leave_tracking_system;

public class LeaveRequest {

    private int requestId;
    private Employee employee;
    private String startDate;
    private String endDate;
    private String status; // "Pending", "Approved", "Denied"
    private String reason;

    // Constructor
    public LeaveRequest(int requestId, Employee employee, String startDate,
                        String endDate, String reason) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending"; // Default status
        this.reason = reason;
    }

    // Methods will be added here
}
