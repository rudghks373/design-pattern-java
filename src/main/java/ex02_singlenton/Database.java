package ex02_singlenton;


public class Database {

    private static Database singhleton;

    private String name;

    //private으로 외부에서 객체 생성 불가
    private Database(String name) {
//        super();
//        this.name = name;
        try {
            Thread.sleep(100);
            this.name = name;
        }catch (Exception e){
            e.printStackTrace();
        }
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
