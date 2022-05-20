package DesignPatterns.PrototypeDP;




public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO document why this method is empty

        LaptopStore laptopStore = new LaptopStore();
        Laptop laptop = new HP("HP Note book", 8);
        Laptop laptop1 = new Dell("Dell Vostro", 4);
        laptopStore.addLaptop(laptop);
        laptopStore.addLaptop(laptop1);


        LaptopStore laptopStore1 = laptopStore.clone();//shallow cloning
        System.out.println("Before Removing : ");
        System.out.println(laptopStore.getLaptopArrayList()+" Address : "+laptopStore);
        System.out.println("Cloned object : "+laptopStore1.getLaptopArrayList()+" Address : "+laptopStore1);

        laptopStore.getLaptopArrayList().remove(1);
        System.out.println("After Removing : ");
        System.out.println(laptopStore.getLaptopArrayList()+" Address : "+laptopStore);
        System.out.println("Cloned object : "+laptopStore1.getLaptopArrayList()+" Address : "+laptopStore1
        );
    }
}
