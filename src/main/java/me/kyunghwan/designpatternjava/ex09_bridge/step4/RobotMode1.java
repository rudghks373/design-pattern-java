package me.kyunghwan.designpatternjava.ex09_bridge.step4;

public class RobotMode1 implements IRobot {


    @Override
    public void powerOn() {
        System.out.println("type1 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type1 : power off");
    }
}
