class BankAccount {
    
    private String accountNumber;
    private String accountHolder;
    private double balance;

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit! Amount must be greater than 0.");
        }
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal! Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Invalid withdrawal! Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    
    public void displayDetails() {
        System.out.println("\n--- Bank Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Q2 {
    public static void main(String[] args) {

        
        BankAccount account = new BankAccount();

        
        account.setAccountNumber("ACC1001");
        account.setAccountHolder("Rahul");
        account.setBalance(5000);

        
        account.displayDetails();

        
        account.deposit(2000);

        
        account.deposit(-500);

        
        account.withdraw(3000);

        
        account.withdraw(10000);

        
        System.out.println("\nFinal Balance: ₹" + account.getBalance());
    }
}
