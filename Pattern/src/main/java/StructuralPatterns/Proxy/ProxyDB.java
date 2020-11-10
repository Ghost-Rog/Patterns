package StructuralPatterns.Proxy;

public class ProxyDB implements DBInterface{

    private DB database;

    public ProxyDB(DB database) {
        this.database = database;
    }

    boolean checkAccess(String request){
        return !request.contains("injection");
    }

    @Override
    public void getFromDB(String request) {
        if(!checkAccess(request)){
            System.out.println("Access denied");
            return;
        }
        database.getFromDB(request);
    }

    @Override
    public void putToDB(String request) {
        if(!checkAccess(request)){
            System.out.println("Access denied");
            return;
        }
        database.putToDB(request);
    }
}
