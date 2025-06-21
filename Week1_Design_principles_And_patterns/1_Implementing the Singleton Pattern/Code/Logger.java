package SingletonPattern;

public class Logger {
    //a private static instance of the same class
    private static Logger instance;

    //a private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger Is Initialized");
    }

    // a public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); //this is Lazy initialization
        }
        return instance;
    }

    // logging method which prints the message
    public void log(String message) {
        System.out.println("[LOG] message : " + message);
    }
}
