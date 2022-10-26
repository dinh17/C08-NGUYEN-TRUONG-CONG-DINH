package ss15_exception_handling_debug.exercise.exercise1;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}