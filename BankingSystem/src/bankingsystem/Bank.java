package bankingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    //    private String name;  //useless stuff left temporary
//    private String address;
//    private String phone;
//    private ArrayList<Account> accounts;
    private ArrayList<Client> clients; //arrays where clients and accounts are stored

    public Bank() {
//        name = null;
//        address = null;
//        phone = "000000000";
//        accounts = new ArrayList<Account>();
        clients = new ArrayList<>(); //initializes clients array
    }

    //    //Setters
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    //Getters
//    public String getName() {
//        return name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
    //Getters
    public Client getClient(int clientPosition) {
        return clients.get(clientPosition);
    }

    //Methods
    public void addClientAndAccount(Client client) {
        clients.add(client);
    } //Adds already made client info to the client array

    public void displayAllAccountsAndClients() { //Displays all clients and accounts
        Client client = new Client();
        for (Client value : clients) {
            System.out.println(client.toString(value));
            System.out.println("--------------------------");
        }
    }

    public void displayCertainAccount(int accountPosition) {
        Client client = new Client();
        System.out.println(client.toString(clients.get(accountPosition)));
    } //Displays a certain account/client

    public CommercialClient createCommercialClient(Account accountObj) {
        Scanner clientScan = new Scanner(System.in);
        CommercialClient commercialClientObj = new CommercialClient(accountObj);
        System.out.println("Please enter your name: ");
        String clientName = clientScan.nextLine();
        commercialClientObj.setName(clientName);
        System.out.println("Please enter nationalID: ");
        String nationalID = clientScan.nextLine();
        commercialClientObj.setNationalID(nationalID);
        System.out.println("Please enter address: ");
        String address = clientScan.nextLine();
        commercialClientObj.setAddress(address);
        System.out.println("Please enter phoneNumber: ");
        String phone = clientScan.nextLine();
        commercialClientObj.setPhone(phone);
        System.out.println("Please enter your commercialID: ");
        String commercialID = clientScan.nextLine();
        commercialClientObj.setCommercialID(commercialID);
        return commercialClientObj;
    } //registers a commercial client

    public Client createNormalClient(Account accountObj) {
        Scanner clientScan = new Scanner(System.in);
        Client clientObj = new Client(accountObj);
        System.out.println("Please enter your name: ");
        String clientName = clientScan.nextLine();
        clientObj.setName(clientName);
        System.out.println("Please enter nationalID: ");
        String nationalID = clientScan.nextLine();
        clientObj.setNationalID(nationalID);
        System.out.println("Please enter address: ");
        String address = clientScan.nextLine();
        clientObj.setAddress(address);
        System.out.println("Please enter phoneNumber: ");
        String phone = clientScan.nextLine();
        clientObj.setPhone(phone);
        return clientObj;
    } //registers a normal client

    public Account createNormalAccount() {
        Scanner accountScan = new Scanner(System.in);
        Account accountObj = new Account();
        while (true) {
            System.out.println("Please enter your account number: ");
            int accountNumber = accountScan.nextInt();
            if (checkAccount(accountNumber) != -1) {
                System.out.println("Account already exists");
            } else {
                accountObj.setAccountNumber(accountNumber);
                System.out.println("Please enter your balance: ");
                double balance = accountScan.nextDouble();
                accountObj.setBalance(balance);
                break;
            }
        }
        return accountObj;
    }  //registers a normal account

    public SpecialAccount createSpecialAccount() {
        Scanner accountScan = new Scanner(System.in);
        SpecialAccount specialAccountObj = new SpecialAccount();

        while (true) {
            System.out.println("Please enter your account number: ");
            int accountNumber = accountScan.nextInt();
            if (checkAccount(accountNumber) != -1) {
                System.out.println("Account already exists");
            } else {
                specialAccountObj.setAccountNumber(accountNumber);
                System.out.println("Please enter your balance: ");
                double balance = accountScan.nextDouble();
                specialAccountObj.setBalance(balance);
                break;
            }
        }
        return specialAccountObj;
    } //registers a special account

    public int checkAccount(int element) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getAccount().getAccountNumber() == element) {
                return i;
            }
        }
        return -1;
    } //checks if account number exists for specific operations


}