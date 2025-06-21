package ObserverPattern;

public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("MobileApp - " + stockName + " updated to ₹" + newPrice);
    }
}

