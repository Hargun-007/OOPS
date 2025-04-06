import java.util.Scanner;

class Bank {
    String name;
    int acc_no;
    String acc_type;
    float balance;

    void openAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Account No: ");
        acc_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Type: ");
        acc_type = sc.nextLine();
        System.out.print("Enter Balance: ");
        balance = sc.nextFloat();
    }

    void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + acc_no);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    void deposit() {
        float amt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount you want to deposit: ");
        amt = sc.nextFloat();
        balance = balance + amt;
    }

    void withdrawal() {
        float amt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount you want to withdraw: ");
        amt = sc.nextFloat();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    boolean search(int ac_no) {
        if (acc_no == ac_no) {
            showAccount();
            return true;
        }
        return false;
    }
}

public class BankingSystem {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many customers do you want to input? ");
        int n = sc.nextInt();
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Bank();
            C[i].openAccount();
        }

        int ch;
        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Display All");
            System.out.println("2. Search By Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdrawal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter Account No you want to search: ");
                    int ac_no = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account No: ");
                    ac_no = sc.nextInt();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account doesn't exist.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No: ");
                    ac_no = sc.nextInt();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account doesn't exist.");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (ch != 5);
    }
}
