package FinalProjectOfDS;

public class User {

    private String username;
    private int password;
    private boolean isAdmin;
    private boolean isActive;
    private Stack<Customer> servedStack = new Stack<>();
    private final String[][] empReport = new String[50][6];
    private int count = 0;

    public User(String username, int password, boolean admin, boolean active) {
        this.username = username;
        this.password = password;
        this.isAdmin = admin;
        this.isActive = active;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Stack<Customer> getServedStack() {
        return servedStack;
    }

    public void addReport(Customer customer) {
        empReport[count][0] = customer.getWaitingId();
        empReport[count][1] = customer.getName();
        empReport[count][2] = customer.getNationalId();
        empReport[count][3] = customer.getIssue();
        empReport[count][4] = customer.isSolved() ? "Solved" : "Not Solved";
        empReport[count][5] = customer.getServedBy();
        count++;
    }
}
