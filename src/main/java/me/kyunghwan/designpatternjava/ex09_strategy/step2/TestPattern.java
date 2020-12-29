package me.kyunghwan.designpatternjava.ex09_strategy.step2;

public class TestPattern {

    public static void main(String[] args) {

        //테스트
        BInterface bInterface = new BImplement();
        bInterface.funcA();

        System.out.println("------------------------");

        AObj obj = new AObj();
        obj.SomeFunc();

    }
}
