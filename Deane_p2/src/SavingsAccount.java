public class SavingsAccount {
    private static double savingsBalance;
    private static double annualInterestRate;
    public SavingsAccount() {
    }
    public static void calculateMonthlyInterest() {
        double monthlyInterest;
        monthlyInterest = savingsBalance * annualInterestRate / 12.0;
        savingsBalance = savingsBalance + monthlyInterest;
    }
    public static void printer() {
        System.out.printf(" balance is $%.2f\n", savingsBalance);
    }
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
    public static double getSavingsBalance() {
        return savingsBalance;
    }
    public static void makebalance(double userBalance) {
        savingsBalance = userBalance;
    }

}
