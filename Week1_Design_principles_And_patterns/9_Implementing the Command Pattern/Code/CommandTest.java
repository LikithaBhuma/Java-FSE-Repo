package CommandPattern;

public class CommandTest {
    public static void main(String[] args) {
        Light RoomLight = new Light();

        Command lightOn = new LightOnCommand(RoomLight);
        Command lightOff = new LightOffCommand(RoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}