package az.bank;

public class CustomerValidator {
    public void validateCustomer(String customerName) throws InvalidCustomerException {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new InvalidCustomerException("Customer name is not right.");
        }
        System.out.println("Customer name checked successfully: " + customerName);
    }
}
