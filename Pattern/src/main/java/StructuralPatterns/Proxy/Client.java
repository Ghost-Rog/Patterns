package StructuralPatterns.Proxy;

public class Client {

    private final DBInterface dbInterface;

    public Client(DBInterface dbInterface) {
        this.dbInterface = dbInterface;
    }

    public void getFromDB(String request) {
        dbInterface.getFromDB(request);
    }


    public void putToDB(String request) {
        dbInterface.putToDB(request);
    }
}
