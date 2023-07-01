package exception;

public class invalidCarBrandException extends RuntimeException {
    public invalidCarBrandException (String message){
        super (message);
    }
}
