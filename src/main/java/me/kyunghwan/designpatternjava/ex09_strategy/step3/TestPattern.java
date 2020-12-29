package me.kyunghwan.designpatternjava.ex09_strategy.step3;

public class TestPattern {

    public static void main(String[] args) {

        DatabaseUse2 myDB = new DatabaseUse2();
        myDB.connect();

        //데이터베이스를 세팅한다.
        myDB.setDatabase(new MySQL());
        myDB.connect();
        myDB.select();

        //데이터베이스 세팅한다
        myDB.setDatabase(new Informix());
        myDB.connect();
        myDB.select();
        
        //추가 요청사항
        //Oracle 클래스를 추가하고 세팅하여 사용하라
        myDB.setDatabase(new Oracle());
        myDB.connect();
        myDB.select();

    }

}
