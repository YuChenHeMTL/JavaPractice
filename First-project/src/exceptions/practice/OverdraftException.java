package exceptions.practice;

public class OverdraftException extends Exception {
    private double deficit;

    public OverdraftException(String msg, double amount){
        super(msg);
        this.deficit = amount;
        System.out.println("deficit amount: " + this.deficit);
    }
    public double getDeficit(){
        return this.deficit;
    }
}
