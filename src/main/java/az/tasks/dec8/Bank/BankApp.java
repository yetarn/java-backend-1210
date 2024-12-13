package az.tasks.dec8.Bank;

public class BankApp {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new SavingsAccount("Adam1", 1000, 100, 5.0);
        accounts[1] = new SavingsAccount("Adam2", 2000, 101, 3.0);
        accounts[2] = new CurrentAccount("Adam3", 500, 102, 1000);
        accounts[3] = new CurrentAccount("Adam4", 1500, 103, 500);
        accounts[4] = new BankAccount("Adam5", 3000, 104);

        for (BankAccount account : accounts) {

            account.displayInfo();
            System.out.println();
        }

        accounts[0].deposit(500);
        accounts[1].withdraw(300);
        accounts[2].withdraw(600);
        accounts[3].withdraw(2000);
        accounts[4].withdraw(100);

        accounts[0].transfer(accounts[2], 200);

        ((SavingsAccount) accounts[0]).applyInterest();
        ((CurrentAccount) accounts[2]).withdraw(2000);
    }
}
