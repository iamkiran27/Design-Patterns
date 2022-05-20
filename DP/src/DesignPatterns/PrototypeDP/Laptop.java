package DesignPatterns.PrototypeDP;

abstract class Laptop  {

   protected String name;
    protected   int ram;


    public Laptop(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + this.name + '\'' +
                ", ram=" + this.ram +
                '}';
    }


}
