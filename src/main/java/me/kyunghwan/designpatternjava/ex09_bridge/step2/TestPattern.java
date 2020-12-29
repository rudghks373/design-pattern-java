package me.kyunghwan.designpatternjava.ex09_bridge.step2;

//구현의 추가는 계속 할 수 있다.
public class TestPattern {

    public static void main(String[] args) {

        IRobot robot1 = new RobotMode1();
        robot1.powerOn();
        robot1.powerOff();
        robot1.doCook();

        System.out.println("----------------------");

        IRobot robot2 = new RobotMode2();
        robot2.powerOn();
        robot2.powerOff();
        robot1.doCook();
    }
}
