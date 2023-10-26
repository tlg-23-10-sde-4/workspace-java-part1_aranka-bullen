package com.entertainment;

// CHECKED exception, because it extends Exception
public class InvalidBrandException extends Exception {

    public InvalidBrandException() {
    }

    public InvalidBrandException(String string) {
        super(string);
    }

    public InvalidBrandException(String string, Throwable cause) {
        super(string, cause);
    }

    public InvalidBrandException(Throwable cause) {
        super(cause);
    }


}