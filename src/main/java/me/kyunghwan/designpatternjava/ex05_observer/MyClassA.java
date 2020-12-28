package me.kyunghwan.designpatternjava.ex05_observer;


import java.util.Observable;
import java.util.Observer;

public class MyClassA implements Observer {

    Observable observable; // 등록될 observable
    private boolean bPlay; // 실행 여부

    public MyClassA(Observable ob){
        this.observable = ob;
        observable.addObserver(this); //옵저버에 현재 클래스를 등록
    }

    @Override
    public void update(Observable o, Object arg) {
        if( o instanceof PlayController){
            PlayController myController = (PlayController) o;
            this.bPlay = myController.getFlag();
            myActControl();
        }
    }

    private void myActControl() {
        if(bPlay)
            System.out.println("MyClass A : 동작을 시작합니다.");
        else
            System.out.println("MyClass A : 동작을 정지합니다.");

    }

}
