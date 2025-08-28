package Leave_tracking_system;

public interface Approvable {
    boolean approve(String approverName);
    boolean deny(String approverName, String reason);
}

