package src.com.entertainment;
/*
 * Application-specific custom exception class - CHECKED EXCEPTION
 */
public class InvalidVolumeException extends Exception{
    public InvalidVolumeException() {
    }

    public InvalidVolumeException(String message) {
        super(message);
    }

    public InvalidVolumeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidVolumeException(Throwable cause) {
        super(cause);
    }

    public InvalidVolumeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}