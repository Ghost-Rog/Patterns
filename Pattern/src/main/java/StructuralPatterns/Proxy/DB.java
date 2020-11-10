package StructuralPatterns.Proxy;

public class DB implements DBInterface {


    @Override
    public void getFromDB(String request) {
        System.out.println(request);
    }

    @Override
    public void putToDB(String request) {
        System.out.println(request);
    }
}
