public class BankAccount {
    private  String account_Number;
    private double balance;

    public BankAccount(String accountNumber) {
        this.account_Number = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount){
        balance +=amount;
        System.out.println(amount+" deposited successfully. Total balance : "+ balance);
    }

    public void  withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Total balance : " + balance);
        }else{
            System.out.println("Insufficient balance.");
        }
    }

    public String getAccount_number() {
        return account_Number;
    }

    public double getBalance() {
        return balance;
    }
}
