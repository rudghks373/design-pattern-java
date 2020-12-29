package me.kyunghwan.designpatternjava.ex09_bridge.step4;

public class Clean extends IAction{

    public Clean(IRobot robot) {
        super(robot);
    }

    public void doClean(){
        System.out.println("청소를 합니다.");
    }

}
