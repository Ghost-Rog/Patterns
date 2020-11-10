package StructuralPatterns.Proxy;

public interface DBInterface {

    void getFromDB(String request);
    void putToDB(String request);

}
