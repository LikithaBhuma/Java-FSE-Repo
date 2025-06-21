package ProxyPattern;

public class ProxyTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("lamp.png");
        Image img2 = new ProxyImage("pump.png");
        Image img3 = new ProxyImage("lamp.png"); // Should load from cache

        img1.display(); // Image loads from server
        img2.display(); // Image loads from server
        img3.display(); // It uses cached instance
    }
}
