package helpers;

public class MyError {
    private static String type;
    private static String message;

    public MyError(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public static String getType() {
        return type;
    }

    public static String getMessage() {
        return message;
    }
}
