package bankingsystem;

public class CommercialClient extends Client {
    private String commercialID;

    //Constructor
    public CommercialClient() {
        commercialID = null;
        setNationalID("0000000000000");
    }

    public CommercialClient(Account accountObj) {
        setAccount(accountObj);
        setNationalID("0000000000000");
        commercialID = null;
    }

    //Getters
    public String getCommercialID() {
        return commercialID;
    }

    //Setters
    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    //toString overriding
    public String toString() {
        return toString() + "Commercial ID: " + commercialID;
    }

    public String toString(CommercialClient commercialClient) {
        return commercialClient.toString() + "Commercial ID: " + commercialClient.commercialID;
    }

}
