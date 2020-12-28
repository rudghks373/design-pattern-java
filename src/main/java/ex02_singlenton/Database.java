package ex02_singlenton;


public class Database {

    private static Database singhleton;

    private String name;

    public Database(String name) {
        this.name = name;
    }

    public static Database getInstance(String name){
        if(singhleton == null){
            singhleton = new Database(name);
        }
        return singhleton;
    }

    public String getName() {
        return name;
    }

}
