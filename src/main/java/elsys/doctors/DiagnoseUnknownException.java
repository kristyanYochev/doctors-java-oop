package main.java.elsys.doctors;

public class DiagnoseUnknownException extends Exception {
    public DiagnoseUnknownException() {
        super("Could not determine diagnose");
    }

    public DiagnoseUnknownException(String message) {
        super(message);
    }
}
