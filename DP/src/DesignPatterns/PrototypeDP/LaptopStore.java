package DesignPatterns.PrototypeDP;

import java.util.ArrayList;

public class LaptopStore  implements  Cloneable{

   private ArrayList<Laptop> laptopArrayList;

    public LaptopStore() {
     laptopArrayList   = new ArrayList<>();
    }


    public void addLaptop(Laptop a)
    {

        getLaptopArrayList().add(a);
    }

    public ArrayList<Laptop> getLaptopArrayList() {
        return laptopArrayList;
    }

//    @Override
//    public String toString() {
//        return "LaptopStore{" +
//                "laptopArrayList=" + laptopArrayList +
//                '}';
//    }

    @Override
    protected LaptopStore clone() throws CloneNotSupportedException {


        //deep cloning
//        LaptopStore laptopStore = new LaptopStore();
//        for(Laptop l : this.getLaptopArrayList())
//        {
//
//            laptopStore.addLaptop(l);
//
//        }
        return (LaptopStore) super.clone();
    }
}
