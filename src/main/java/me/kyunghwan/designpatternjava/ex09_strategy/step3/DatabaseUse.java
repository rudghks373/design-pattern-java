package me.kyunghwan.designpatternjava.ex09_strategy.step3;

enum DBTYPE { MySQL , Informix, Oracle}

public class DatabaseUse {

    private Database db;

    public void connect(DBTYPE dbtype){
        switch (dbtype){
            case MySQL:
                db = new MySQL();
                break;
            case Informix:
                db = new Informix();
                break;
            case Oracle:
                db = new Oracle();
                break;
        }

        if(db == null){
            System.out.println("데이터베이스를 먼저 선택하요");
        }else{
            // Fuction Delegate : 구체적인 데이터베이스의 종류는 몰라도 기능 사용 가능
            db.connectDatabaes();
        }
    }
    public void select(){
        db.selectData();
    }

}
