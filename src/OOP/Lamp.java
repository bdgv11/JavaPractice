package OOP;
public class Lamp {

    public boolean lightStatus = false;
    private String roomName;

    public Lamp(String room) {
        roomName = room;
        System.out.println("Creating object of the lamp class on " + roomName);
    }

    public void printLightStatus() {
        if (lightStatus) {
            System.out.println("The lamp in " + roomName + " is ON");
        } else {
            System.out.println("The lamp in " + roomName + " is OFF");
        }
    }

}
