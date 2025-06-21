package BuilderPattern;

public class Computer {
    // Required and optional attributes
    private final String cpu;
    private final String ram;
    private final String storage;
    private final boolean graphicsCard;
    private final boolean wifi;

    //It is a private constructor used by the Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
    }

    // It is a static nested Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private boolean graphicsCard;
        private boolean wifi;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    // Display configuration
    public void showSpecifications() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + (graphicsCard ? "Yes" : "No"));
        System.out.println("Wi-Fi: " + (wifi ? "Yes" : "No"));
    }
}