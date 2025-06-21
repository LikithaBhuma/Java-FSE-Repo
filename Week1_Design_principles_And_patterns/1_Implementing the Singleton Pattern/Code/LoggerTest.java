package SingletonPattern;

//It is a test class to check whether logger class is working or not
public class LoggerTest {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.log("First log message");

        Logger log2 = Logger.getInstance();
        log2.log("Second log message");

        // Check if both instances are same
        if (log1 == log2) {
            System.out.println("Logger class is Singleton Pattern. Both instances are the same.");
        } else {
            System.out.println("Logger class is NOT Singleton Pattern. Both instances are not same");
        }
    }
}