package bankingsystem;
/**
*@author Maxes
*@date 20/2/2020
 * @version 1.0
 **/
import java.util.Scanner;

import static java.lang.System.exit;

public class MainClass {
    static Scanner scan = new Scanner(System.in);

    public static void mainScreen(Bank bankObj) {
        System.out.println("Choose one of the following options: \n"
                + "1.Create a Client and Account\n"
                + "2.Edit an Account\n"
                + "3.Print all Accounts and Clients\n"
                + "4.Print a specific Account-Client\n" +
                "5.Exit\n");
        System.out.println("Your choice: ");
        int userChoice = scan.nextInt();
        //User Switch
        switch (userChoice) {
            //Creating an Account
            case 1:
                System.out.println("1.Create a normal account\n"
                        + "2.Create a special account\n");
                System.out.println("Your choice: ");
                int accountChoice = scan.nextInt();
                //Account switch
                switch (accountChoice) {
                    //Normal Account
                    case 1:
                        System.out.println("Choose the client type you want: \n"
                                + "1.Normal client\n"
                                + "2.Commercial client\n");
                        System.out.println("Your choice: ");
                        int clientChoiceNormal = scan.nextInt();
                        //ClientChoice
                        switch (clientChoiceNormal) {
                            //NormalAccount NormalClient
                            case 1:
                                bankObj.addClientAndAccount(bankObj.createNormalClient(bankObj.createNormalAccount()));
                                break;
                            //NormalAccount CommercialClient
                            case 2:
                                bankObj.addClientAndAccount(bankObj.createCommercialClient(bankObj.createNormalAccount()));
                                break;
                            default:
                                System.out.println("Invalid input");
                        }
                        break;
                    //Special Account
                    case 2:
                        System.out.println("Choose the client type you want: \n"
                                + "1.Normal client\n"
                                + "2.Commercial client\n");
                        System.out.println("Your choice: ");
                        int clientChoiceSpecial = scan.nextInt();
                        switch (clientChoiceSpecial) {
                            //SpecialAccount NormalClient
                            case 1:
                                bankObj.addClientAndAccount((bankObj.createNormalClient(bankObj.createSpecialAccount())));
                                break;
                            //SpecialAccount CommercialClient
                            case 2:
                                bankObj.addClientAndAccount(bankObj.createCommercialClient(bankObj.createSpecialAccount()));
                                break;
                            default:
                                System.out.println("Invalid input");
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                break;
            case 2:
                System.out.println("Enter your account number: ");
                int accountNumber = scan.nextInt();
                int accountPosition = bankObj.checkAccount(accountNumber);
                if (accountPosition != -1) {
                    System.out.println("Choose the operation you want to do: " +
                            "1.Withdraw\n" +
                            "2.Deposit\n");
                    System.out.println("Your choice: ");
                    int operationChoice = scan.nextInt();
                    switch (operationChoice) {
                        case 1:
                            System.out.println("Enter the amount you want to withdraw: \n");
                            double amount = scan.nextDouble();
                            bankObj.getClient(accountPosition).getAccount().withdraw(amount);
                            break;
                        case 2:
                            System.out.println("Enter the amount you want to deposit: \n");
                            amount = scan.nextDouble();
                            bankObj.getClient(accountPosition).getAccount().deposit(amount);
                            break;
                        default:
                            System.out.println("Invalid input");
                    }

                } else {
                    System.out.println("Account number doesn't exist");
                }
                break;
            case 3:
                bankObj.displayAllAccountsAndClients();
                break;
            case 4:
                System.out.println("Enter the account number: ");
                accountNumber = scan.nextInt();
                accountPosition = bankObj.checkAccount(accountNumber);
                if (accountPosition != -1) {
                    bankObj.displayCertainAccount(accountPosition);
                } else {
                    System.out.println("Account doesn't exist");
                }
                break;
            case 5:
                exit(0);
                break;

            default:
                System.out.println("Invalid input");

        }

    }

    public static void main(String[] args) {
        Bank bankObj = new Bank();
        try {
            while (true) {
                mainScreen(bankObj);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }

}



