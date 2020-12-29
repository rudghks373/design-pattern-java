package me.kyunghwan.designpatternjava.ex09_bridge.step4;

//구현의 추가는 계속 할 수 있다.
public class TestPattern {

    public static void main(String[] args) {

        IRobot robot = new RobotMode1();
        Cook work = new Cook(robot);
        work.powerOn();
        work.doCook();
        work.powerOff();

        System.out.println("---------------------------");

        IRobot robot2 = new RobotMode1();
        Clean work2 = new Clean(robot2);
        work2.powerOn();
        work2.doClean();
        work2.powerOff();


    }
}
