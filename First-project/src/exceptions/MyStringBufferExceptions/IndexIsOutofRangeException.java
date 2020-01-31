package exceptions.MyStringBufferExceptions;

public class IndexIsOutofRangeException extends Exception {
    public IndexIsOutofRangeException(){

    }
    public IndexIsOutofRangeException(String msg){
        super(msg);
    }
}
