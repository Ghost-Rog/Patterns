package GenerativePatterns.Singleton;

public class Db {

    private static Db instance;

    public static Db getInstance(){

        if(instance == null){
            instance = new Db();
        }
        return instance;
    }

    private Db() {
        System.out.println("constructor");
    }


}
