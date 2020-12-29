package me.kyunghwan.designpatternjava.ex09_strategy.step3;

public class MySQL extends Database {

    public MySQL() {
        name = "MySQL";
        rows = 20;
    }

    @Override
    public void connectDatabaes() {
        System.out.println(name + " 에 접속했습니다");
    }
}
