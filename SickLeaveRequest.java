package Leave_tracking_system;

public class SickLeaveRequest extends LeaveRequest {
    private boolean medicalCertificateProvided;
    private int duration;

    public SickLeaveRequest(int requestId, Employee employee,
                            String startDate, String endDate,
                            boolean medicalCertificateProvided) {
        super(requestId, employee, startDate, endDate, "Sick Leave");
        this.medicalCertificateProvided = medicalCertificateProvided;
    }

    public boolean isMedicalCertificateProvided() {
        return medicalCertificateProvided;
    }

    public void setDuration(int duration) {this.duration = duration;}
    public int getDuration() {return duration;}

    // In the SickLeaveRequest class
    @Override
    public boolean processRequest() {
        if (!medicalCertificateProvided && getDuration() > 2) {
            System.out.println("Sick leave longer than 2 days requires a medical certificate");
            return false;
        }
        System.out.println("Processing sick leave request...");
        return true;
    }
}
