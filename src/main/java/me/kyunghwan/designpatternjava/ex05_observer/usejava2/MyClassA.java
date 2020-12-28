package me.kyunghwan.designpatternjava.ex05_observer.usejava2;


public class MyClassA implements Observer {

    Publisher observable; //등록될 Observable
    private boolean bPlay; //실행여부

    //생성될 때 직접 자기 자신을 옵저버에 등록한다.
    public MyClassA(Publisher ob){
        this.observable = ob;
        observable.addObserver(this);
    }

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
