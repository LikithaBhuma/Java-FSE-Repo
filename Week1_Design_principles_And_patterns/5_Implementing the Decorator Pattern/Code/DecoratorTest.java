package DecoratorPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();

        // Wrap EmailNotifier with SMS and Slack decorators
        Notifier multiChannelNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(baseNotifier));

        multiChannelNotifier.send("Testing the decorator pattern test class.");
    }
}
