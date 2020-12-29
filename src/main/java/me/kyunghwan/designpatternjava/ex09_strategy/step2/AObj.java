package me.kyunghwan.designpatternjava.ex09_strategy.step2;

public class AObj {

    BInterface bInterface;

    public AObj() {
        bInterface = new BImplement();
    }

    public void SomeFunc(){
//        //다음 기능을 수행합니다.
//        System.out.println("AAA");
//        System.out.println("BBB");

        //위의 기능이 필요합니다. B에서 만들어주세요
        //기능 구현을 위임. Delegate
        bInterface.funcA();
        bInterface.funcA();
    }

}
