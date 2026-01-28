package student.management.exception;

public class ArrayFullException extends RuntimeException{
    String msg;
    public ArrayFullException(String msg){
        super(msg);
    }
}
