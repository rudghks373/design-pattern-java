package me.kyunghwan.designpatternjava.ex09_bridge.step3;

//구현의 추가는 계속 할 수 있다.
public class TestPattern {

    public static void main(String[] args) {

        IRobot robot = new RobotMode1();
        Cook work = new Cook(robot);
        work.powerOn();
        work.doCook();
        work.powerOff();

        System.out.println("---------------------------");

        robot = new RobotMode2();
        work = new Cook(robot);
        work.powerOn();
        work.powerOff();

    }
}
