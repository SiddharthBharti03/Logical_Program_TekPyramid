package student.management.exception;

public class ArrayIndexOutOfBoundException extends RuntimeException{
    String msg;
    public ArrayIndexOutOfBoundException(String msg){
        super(msg);
    }
}
