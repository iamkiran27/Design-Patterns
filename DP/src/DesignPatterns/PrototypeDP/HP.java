package DesignPatterns.PrototypeDP;

public class HP extends  Laptop {

    public HP(String name, int ram) {
        super(name,ram);

    }

    @Override
    public String toString() {
        return "HP{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                '}';
    }
}
