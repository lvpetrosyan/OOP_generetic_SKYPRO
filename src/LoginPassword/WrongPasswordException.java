package LoginPassword;

public class WrongPasswordException extends Exception{
    CorrectInfo correctInfo;
    public WrongPasswordException(String message) {
        super(message);

    }
}
