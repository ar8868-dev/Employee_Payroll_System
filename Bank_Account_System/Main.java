import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🏦 Welcome to Simple Bank System");
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial deposit: ₹");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);
        System.out.println("\n✅ Account created successfully!\n");

        int choice;
        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.accountInfo();
                    break;

                case 5:
                    System.out.println("👋 Thank you for banking with us!");
                    break;

                default:
                    System.out.println("⚠️ Invalid option! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
