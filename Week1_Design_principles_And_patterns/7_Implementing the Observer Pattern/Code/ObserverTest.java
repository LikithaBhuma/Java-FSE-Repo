package ObserverPattern;

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket tcsStock = new StockMarket("TCS");

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        tcsStock.registerObserver(mobileApp);
        tcsStock.registerObserver(webApp);

        tcsStock.setStockPrice(3250.75);
        tcsStock.setStockPrice(3275.40);
    }
}
