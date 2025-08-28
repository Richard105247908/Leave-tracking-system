package Leave_tracking_system;

import java.util.ArrayList;

 interface Approvable {
    boolean approve(String approverName);
    boolean deny(String approverName, String reason);
}

public abstract class LeaveRequest implements Approvable {

    private int requestId;
    private Employee employee;
    private String startDate;
    private String endDate;
    private String status; // "Pending", "Approved", "Denied"
    private String reason;
    private ArrayList<StatusChange>statusHistory = new ArrayList<>();


    // Constructor
    public LeaveRequest(int requestId, Employee employee, String startDate,
                        String endDate,String status, String reason) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
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

//=====================Getters & Setters=====================
    public void setRequestId(int requestId) {this.requestId = requestId;}
    public void setEmployee(Employee employee) {this.employee = employee;}
    public void setStartDate(String startDate) {this.startDate = startDate;}
    public void setEndDate(String endDate) {this.endDate = endDate;}

//    public void setStatus(String status) {
//        this.status = status;
//    }
    public void setReason(String reason) {this.reason = reason;}

    public int getRequestId() {return this.requestId;}
    public Employee getEmployee() {return this.employee;}
    public String getStartDate() {return this.startDate;}
    public String getEndDate() {return endDate;}

//    public String getStatus() {
//        return status;
//    }
    public String getReason() {return reason;}
    public String getStatus() {return status;}

    public void setStatus(String status) {
        if (status.equals("Pending")|| status.equals("Approved")||status.equals("Denied")) {
            this.status = status;
        }else{
            System.out.println("Invalid status");
        }
    }

    //========Methods========
    public boolean processRequest() {
        // Basic request processing logic
        System.out.println("Processing generic leave request...");
        return true;
    }
    // Abstract method that subclasses must implement
    public abstract int calculateLeaveDays();

// ============== status change tracking==========
public void changeStatus(String newStatus, String changedBy){
    String oldStatus = this.status;
    this.status = newStatus;

    // Create a new status change record
    StatusChange change = new StatusChange(
            oldStatus, newStatus, getCurrentDate(), changedBy);
    statusHistory.add(change);
}


//===============Inner Class========================
    public class StatusChange{
        private String oldStatus;
        private String newStatus;
        private String changeDate;
        private String changedBy;


        public StatusChange(String oldStatus, String newStatus,
                            String changeDate, String changedBy){

            this.oldStatus = oldStatus;
            this.newStatus = newStatus;
            this.changeDate = changeDate;
            this.changedBy = changedBy;

        }



    }

}


