package me.kyunghwan.designpatternjava.ex09_strategy.step3;

public class DatabaseUse2 {

    private Database db;

    // 데이터베이스 교환 가능하게
    public void setDatabase(Database db) {
        this.db = db;
    }

    // 기능 사용
    public void connect(){
        if (db == null){
            System.out.println("데이터베이스를 먼저 선택해 주세요");
        } else{
            db.connectDatabaes();
        }
    }

    public void select(){
        db.selectData();
    }

}
