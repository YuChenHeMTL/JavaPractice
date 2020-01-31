package exceptions.MyStringBufferExceptions;

public class IndexIsNegativeException extends Exception {
    public IndexIsNegativeException(){}

    public IndexIsNegativeException(String msg){
        super(msg);
    }
}
