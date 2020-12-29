package me.kyunghwan.designpatternjava.ex09_strategy.step3;

public abstract class Database {

    public String name;
    public double rows;

    //데이터베이스마다 접속 라이브러리가 다르다.
    public abstract void connectDatabaes();

    //표준 SQL문을 사용힌디. (업무처리 방식이 같다.)
    public void insertData(){
        System.out.println(name + " 에 데이터를 추가 했습니다");
    }

    public void selectData() {
        System.out.println(name + " 에서 데이터를 " + rows + " 개 조회했습니다.");
    }

}
