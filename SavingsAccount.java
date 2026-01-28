public class SavingsAccount {
    public static void main(String[] args) {

        double balance = 100000;
        double interestRate = 5;

        double interest = balance * interestRate / 100;
        double newBalance = balance + interest;

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest: " + interest);
        System.out.println("New balance: " + newBalance);
    }
}
