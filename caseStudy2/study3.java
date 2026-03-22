abstract class Transport {
    String id;
    String dest;

    public Transport(String i, String d) {
        id = i;
        dest = d;
    }

    public abstract void dispatch();
}

interface GPS {
    String getCoordinates();
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {
    public DeliveryDrone(String i, String d) {
        super(i, d);
    }

    public void dispatch() {
        System.out.println("Drone " + id + " taking off...");
    }

    public String getCoordinates() {
        return "40.7128 N";
    }

    public void selfNavigate() {
        System.out.println("Drone navigating automatically...");
    }
}

class Truck extends Transport {
    public Truck(String i, String d) {
        super(i, d);
    }

    public void dispatch() {
        System.out.println("Truck " + id + " leaving warehouse...");
    }
}

class CargoShip extends Transport {
    public CargoShip(String i, String d) {
        super(i, d);
    }

    public void dispatch() {
        System.out.println("Ship " + id + " sailing...");
    }
}

public class study3 {
    public static void main(String[] args) {
        Transport t1 = new DeliveryDrone("D101", "NY");
        Transport t2 = new Truck("T201", "LA");
        Transport t3 = new CargoShip("C301", "UK");

        Transport arr[] = {t1, t2, t3};

        for (Transport t : arr) {
            t.dispatch();

            if (t instanceof GPS) {
                GPS g = (GPS) t;
                System.out.println(g.getCoordinates());
            }

            if (t instanceof Autonomous) {
                Autonomous a = (Autonomous) t;
                a.selfNavigate();
            }
        }
    }
}