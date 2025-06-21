package BuilderPattern;

public class BuilderTest {
    public static void main(String[] args) {
        // This object of Computer class has  Basic configuration
        Computer officePC = new Computer.Builder()
            .setCpu("Intel i5")
            .setRam("8GB")
            .setStorage("512GB SSD")
            .build();

        // This object of Computer class has Gaming configuration
        Computer gamingPC = new Computer.Builder()
            .setCpu("AMD Ryzen 9")
            .setRam("32GB")
            .setStorage("2TB SSD")
            .setGraphicsCard(true)
            .setWifi(true)
            .build();

        System.out.println("Office PC Specifications:");
        officePC.showSpecifications();

        System.out.println("\nGaming PC Specifications:");
        gamingPC.showSpecifications();
    }
}
