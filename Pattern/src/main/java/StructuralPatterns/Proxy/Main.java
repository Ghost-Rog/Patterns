package StructuralPatterns.Proxy;

public class Main {
    public static void main(String[] args) {


        DB db = new DB();
        DBInterface proxyDB = new ProxyDB(db);



        Client client = new Client(db);
        Client client1 = new Client(proxyDB);


        client.getFromDB("injection");
        client.getFromDB("test");
        client.putToDB("injection");
        client.putToDB("test");
        System.out.println("----------------------");
        client1.getFromDB("injection");
        client1.getFromDB("test");
        client1.putToDB("injection");
        client1.putToDB("test");
    }
}
