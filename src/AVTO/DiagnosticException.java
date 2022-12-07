package AVTO;

public class DiagnosticException extends Exception{
    Transport transport;
    public DiagnosticException(String message, Transport transport) {
        super(message);
        this.transport=transport;
    }
}
