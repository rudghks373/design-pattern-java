package me.kyunghwan.designpatternjava.ex09_strategy.step3;

public class Oracle extends Database{

    public Oracle() {
        name = "Oracle";
        rows = 10;
    }

    @Override
    public void connectDatabaes() {
        System.out.println(name + " 에 접속했습니다..");
    }
}
