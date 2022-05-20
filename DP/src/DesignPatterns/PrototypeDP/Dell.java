package DesignPatterns.PrototypeDP;

public class Dell  extends  Laptop{

    public Dell(String name, int ram) {
        super(name, ram);
    }

    @Override
    public String toString() {
        return "Dell{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                '}';
    }
}
