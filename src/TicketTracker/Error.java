package TicketTracker;

public class Error <T> {
    private T errorMessage;

    public  Error () {}

    public Error(T errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(T errorMessage) {
        this.errorMessage = errorMessage;
    }
}
