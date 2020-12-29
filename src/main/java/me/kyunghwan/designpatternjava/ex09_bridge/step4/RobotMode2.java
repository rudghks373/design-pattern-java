package me.kyunghwan.designpatternjava.ex09_bridge.step4;

public class RobotMode2 implements IRobot {


    @Override
    public void powerOn() {
        System.out.println("type2 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type2 : power off");
    }
}
