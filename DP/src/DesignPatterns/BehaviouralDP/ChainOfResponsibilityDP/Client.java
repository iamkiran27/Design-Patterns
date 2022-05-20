package DesignPatterns.BehaviouralDP.ChainOfResponsibilityDP;

public class Client {
    public static void main(String[] args) {
        IDB idb = new DB1();
        IDB idb2= new DB2();

        IDB idb3 = new DB3();

        idb.searchNextDb(idb2);
        idb2.searchNextDb(idb3);

Data data = new Data("ram");
idb.searchUserData(data);






    }
}
