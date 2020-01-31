package exceptions.practice;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect){
        super(balance);
        this.overdraftProtection = protect;
    }

    @Override
    public void withdraw(double amount) throws OverdraftException {
        this.balance -= amount;
        if ((0 - this.balance) > overdraftProtection){
            throw new OverdraftException("balance is in deficit", this.balance);
        }
    }
}
