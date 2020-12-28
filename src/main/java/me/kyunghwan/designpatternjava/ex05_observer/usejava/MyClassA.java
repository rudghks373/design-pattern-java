package me.kyunghwan.designpatternjava.ex05_observer.usejava;


public class MyClassA implements Observer {

    private boolean bPlay; //실행여부

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    private void myActControl() {
        if(bPlay)
            System.out.println("MyClass A : 동작을 시작합니다.");
        else
            System.out.println("MyClass A : 동작을 정지합니다.");

    }


}
