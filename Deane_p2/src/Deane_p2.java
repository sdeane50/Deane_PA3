public class Deane_p2 {
    public Deane_p2() {
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        SavingsAccount.makebalance(2000.0);
        SavingsAccount.modifyInterestRate(0.04);
        for(int i = 0; i < 12; ++i) {
            SavingsAccount.calculateMonthlyInterest();
        }
        System.out.print("Saver 1's");
        SavingsAccount.printer();
        double currBalance1;
        currBalance1 = SavingsAccount.getSavingsBalance();
        SavingsAccount.makebalance(3000.0);
        SavingsAccount.modifyInterestRate(0.04);
        for(int i = 0; i < 12; ++i) {
            SavingsAccount.calculateMonthlyInterest();
        }
        System.out.print("Saver 2's");
        SavingsAccount.printer();
        double currBalance2;
        currBalance2 = SavingsAccount.getSavingsBalance();
        SavingsAccount.makebalance(currBalance1);
        SavingsAccount.modifyInterestRate(0.05);
        SavingsAccount.calculateMonthlyInterest();
        System.out.print("Saver 1's");
        SavingsAccount.printer();
        SavingsAccount.makebalance(currBalance2);
        SavingsAccount.modifyInterestRate(0.05);
        SavingsAccount.calculateMonthlyInterest();
        System.out.print("Saver 2's,");
        SavingsAccount.printer();
    }
}
