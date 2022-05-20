package DesignPatterns.BehaviouralDP.ChainOfResponsibilityDP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DB1 implements  IDB{

private  IDB idb;

    private static Map<String,String>  map = new HashMap<>();


    static  {

        map.put("ram", "ram's data");
        map.put("sai", "sai's data found");
        map.put("ravi", "ravi's data");

    }

    @Override
    public void searchUserData(Data data) {

        if(map.containsKey(data.getUsername()))
        {
            System.out.println("Data found : "+map.get(data.getUsername()));
        }
        else {
            idb.searchUserData(data);
        }

    }

    @Override
    public void searchNextDb(IDB idb) {
this.idb = idb;
    }
}
