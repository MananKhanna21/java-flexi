abstract class Device {
    String brand;

    public Device(String b) {
        brand = b;
    }

    public abstract void turnOn();
}

interface RemoteControllable {
    void connectToWifi();
}

interface PowerSaving {
    int getEnergyRating();
}

class SmartTV extends Device implements RemoteControllable, PowerSaving {
    public SmartTV(String b) {
        super(b);
    }

    public void turnOn() {
        System.out.println(brand + " TV is turning on");
    }

    public void connectToWifi() {
        System.out.println("Connecting");
    }

    public int getEnergyRating() {
        return 5;
    }
}

class ElectricKettle extends Device {
    public ElectricKettle(String b) {
        super(b);
    }

    public void turnOn() {
        System.out.println(brand + " kettle is heating");
    }
}

public class study2 {
    public static void main(String[] args) {
        Device d = new SmartTV("Sony");
        d.turnOn();

        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();

        Device d2 = new ElectricKettle("Philips");
        d2.turnOn();
    }
}