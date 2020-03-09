package bankingsystem;

public class Client {
    private String name;
    private String nationalID;
    private String address;
    private String phone;
    private Account account;

    //Constructors
    public Client() {
        name = null;
        nationalID = null;
        address = null;
        phone = null;
        account = null;
    }

    public Client(Account myObj) {
        account = myObj;
    }

    //Getters
    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account accountObj) {
        this.account = accountObj;
    }

    //toString overriding
    public String toString() {
        return "Name: " + name + "\nNational ID: " + nationalID + "\nAddress: " + address + "\nPhone Number: " + phone + "\n" + account.toString();

    }

    public String toString(Client client) {
        return "Name: " + client.name + "\nNational ID: " + client.nationalID + "\nAddress: " + client.address + "\nPhone Number: " + client.phone + "\n" + client.account.toString();

    }

}
