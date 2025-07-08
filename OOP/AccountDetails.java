public class AccountDetails {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccountDetails(123456, "Divyesh", 1000000.0, 10.0);
        acc.calculateInterest();
        acc.displayAccountDetails();
        acc.deposit(20000);
        acc.withdraw(500);
    }
}


class Account{
    int accountNumber;
    String custName;
    double balance;
    double interestRate;


   public void calculateInterest( ){
        double interest = (balance * interestRate) / 100;
        balance+= interest;
    }

    public void setAccountDetails(int accountNumber, String custName, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.custName = custName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + custName);
        System.out.println("Balance        : " + balance);
        System.out.println("Interest Rate  : " + interestRate + "%");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }
}