package az.tasks.dec8.Bank;

public class SavingsAccount extends BankAccount {
    private double monthlyInterestRate;
    private int withdrawalLimit = 3;
    private int withdrawalsMade = 0;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate) {
        super(accountHolder, balance, accountNumber);
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public int getWithdrawalsMade() {
        return withdrawalsMade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate);
        System.out.println("Remaining Withdrawals: " + (withdrawalLimit - withdrawalsMade));
    }

    @Override
    public void withdraw(double amount) {
        if (withdrawalsMade < withdrawalLimit) {
            super.withdraw(amount);
            withdrawalsMade++;
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }

    public void applyInterest() {
        double interest = getBalance() * (monthlyInterestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: " + interest);
    }
}
