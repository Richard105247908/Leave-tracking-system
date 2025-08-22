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

    //New Constructor without a reason
    public LeaveRequest(int requestId, Employee employee, String startDate,
                        String endDate) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending"; // Default status
        this.reason = "No reason provided reason";
    }


    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

//    public void setStatus(String status) {
//        this.status = status;
//    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public String getEndDate() {
        return endDate;
    }

//    public String getStatus() {
//        return status;
//    }

    public String getReason() {
        return reason;
    }

    // Methods will be added here
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        if (status.equals("Pending")|| status.equals("Approved")||status.equals("Denied")) {
            this.status = status;
        }else{
            System.out.println("Invalid status");
        }
    }
}


