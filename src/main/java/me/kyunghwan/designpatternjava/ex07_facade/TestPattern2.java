package me.kyunghwan.designpatternjava.ex07_facade;

public class TestPattern2 {

    public static void main(String[] args) {


        Computer computer = new Computer();
        Radio radio = new Radio();
        Light light = new Light();

        //이전 사용 방식
        //집에서 나갈 때 동작
        computer.turnOff();
        radio.turnOff();
        light.turnOff();


        //파사트 패턴 적용 후 사용 방식
        //집에 들어올 때 동작
        HomeFacade home = new HomeFacade(computer, radio, light);
        home.homeIn();

    }
}
