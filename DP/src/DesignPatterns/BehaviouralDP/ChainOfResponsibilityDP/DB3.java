package DesignPatterns.BehaviouralDP.ChainOfResponsibilityDP;

import java.util.HashMap;
import java.util.Map;

public class DB3 implements  IDB{

    private  IDB idb;
    private static Map<String,String> map = new HashMap<>();




    static  {
        map.put("kiran", "kiran's data");
        map.put("ram", "ram's data");
        map.put("ravi", "ravi's data");

    }

    @Override
    public void searchUserData(Data data) {
        if(map.containsKey(data.getUsername()))
        {
            System.out.println("Data found : "+map.get(data.getUsername()));
        }
        else {
            System.out.println("Sorry data for " + map.get(data.getUsername())+ " not found in db.");
        }
    }

    @Override
    public void searchNextDb(IDB idb) {
this.idb = idb;
    }
}
