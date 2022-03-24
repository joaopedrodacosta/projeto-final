package edu.mjv.school.projetofinal.exception;

public class ObjNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1;



    public ObjNotFoundException(String message) {
        super(message);
    }

    public ObjNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}