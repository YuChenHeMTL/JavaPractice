package exceptions.practice;

public class Account {
    protected double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws OverdraftException {
        this.balance -= amount;
        if (this.balance < 0){
            throw new OverdraftException("balance is in deficit", this.balance);
        }
    }

    public static void main(String[] args) {
        CheckingAccount newC = new CheckingAccount(100.0, 100.0);
        try {
            newC.withdraw(200);
            newC.withdraw(1);
        } catch (OverdraftException e){
            e.printStackTrace();
        }
    }
}
