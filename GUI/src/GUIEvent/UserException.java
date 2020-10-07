package GUIEvent;

public class UserException extends Exception {
    final static public int NO_EMAIL = 0;
    final static public int NO_NAME = 1;
    final static public int ALREADY_EXIST = 2;
    private int code;

    public UserException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
