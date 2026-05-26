package FinalProjectOfDS;

public class Customer {

    private static int counter =1 ;

    private String waitingId;
    private String name;
    private String nationalId;
    private String address;
    private String issue;
    private boolean solved;
    private String servedBy;

    private String[][] serviceDetails = new String[30][6];

    public Customer() {
        if (counter<10) {
            this.waitingId="00"+counter;
        }else if(counter>100){
          this.waitingId="0"+counter;
        }else{
        this.waitingId=" "+counter;
        }
        counter++;
    }

    public String getWaitingId() { return waitingId; }
    public String getName() { return name; }
    public String getNationalId() { return nationalId; }
    public String getAddress() { return address; }
    public String getIssue() { return issue; }
    public boolean isSolved() { return solved; }
    public String getServedBy() { return servedBy; }

    public void setData(String name, String nationalId, String address,
                        String issue, boolean solved, String servedBy) {

        this.name = name;
        this.nationalId = nationalId;
        this.address = address;
        this.issue = issue;
        this.solved = solved;
        this.servedBy = servedBy;

        serviceDetails[0][0] = waitingId;
        serviceDetails[1][1] = name;
        serviceDetails[2][2] = nationalId;
        serviceDetails[3][3] = address;
        serviceDetails[4][4] = issue;
        serviceDetails[5][5] = solved ? "Solved" : "Not Solved";
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }

    public void setWaitingId(String waitingId) {
        this.waitingId = waitingId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public void setServedBy(String servedBy) {
        this.servedBy = servedBy;
    }

    public void setServiceDetails(String[][] serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    @Override
    public String toString() {
        if (this.name==null) {
            return "Customer ID :["+this.waitingId+"] Status : (waiting in Queue )";
        }
 return "Tickit :"+this.waitingId+"|| Naame :"+this.name+"\n Issue "+this.issue+"||Statut  "+(this.solved ?"Solved" :"Not Solved")+"\n Served by :"+this.servedBy;    }
}
