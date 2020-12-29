package me.kyunghwan.designpatternjava.ex09_strategy.step3;

public class Informix extends Database {

    public Informix() {
        name = "Informix";
        rows = 40;
    }

    @Override
    public void connectDatabaes() {
        System.out.println(name + " 에 접속했습니다");
    }
}
