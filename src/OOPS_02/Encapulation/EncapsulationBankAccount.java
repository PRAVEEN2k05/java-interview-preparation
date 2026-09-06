package OOPS_02.Encapulation;

public class EncapsulationBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(1000);

        System.out.println("Balance: " + account.getBalance());

        account.withdraw(10000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
class BankAccount{
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

}