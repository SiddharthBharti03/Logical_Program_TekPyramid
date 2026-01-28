package student.management.exception;

public class StudentNotFoundException extends Exception{
    String msg;
    public StudentNotFoundException(String msg) throws StudentNotFoundException {
        super(msg);
    }
}
