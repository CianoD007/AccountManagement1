public class Main {
    public static void main(String[] args) {
        Account account = new Account("John Doe", 1000, "123456789");

        try {
            // Simulating a transfer with a value greater than the available funds
            account.transfer(5000);
        } catch (LackOfMoney e) {
            System.out.println("Transfer failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            // Return the current account balance
            System.out.println("Current balance: " + account.getBalance());
            System.out.println("Owner:"+account.getOwner());
            System.out.println("AccountNumber:"+account.getAccountNumber());
        }
    }
}
