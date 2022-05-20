package DesignPatterns.BehaviouralDP.ChainOfResponsibilityDP;

public interface IDB {
    void searchUserData(Data data);

    void searchNextDb(IDB idb);

}
