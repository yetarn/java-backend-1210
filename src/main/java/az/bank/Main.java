package az.bank;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("AZ123456789", 500.00);

        try {
            account.withdraw(600.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(200.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        CurrencyConverter converter = new CurrencyConverter();
        try {
            double convertedAmount = converter.convert(100.0, "USD", "AZN");
            System.out.println("Converted value: " + convertedAmount + " AZN");
        } catch (UnsupportedCurrencyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        CustomerValidator validator = new CustomerValidator();
        try {
            validator.validateCustomer("Yetar");
            validator.validateCustomer("Revan");
        } catch (InvalidCustomerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
