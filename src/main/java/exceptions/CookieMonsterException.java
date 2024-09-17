package exceptions;

public class CookieMonsterException extends Exception {
    public CookieMonsterException(String message, int cookiesCount){
        super(message + "You cannot divide " + cookiesCount + " cookies evenly between 0 friends!");
    }
}
