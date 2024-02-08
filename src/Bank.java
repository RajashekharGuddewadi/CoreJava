import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts;

    public  Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(String accountNumber){
        accounts.add(new BankAccount(accountNumber));
        System.out.println("Account created successfully with account number: " + accountNumber);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccount_number().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    public void deposit(String accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    public void checkBalance(String accountNumber) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            System.out.println("Balance for account " + accountNumber + ": " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
