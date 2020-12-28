package me.kyunghwan.designpatternjava.ex06_adapter.classuse;

import me.kyunghwan.designpatternjava.ex06_adapter.interfaceuse.BPlayer;

// class adapter implementation
// extends와 implements를 동시에 사용해 다중 상속을 흉내내었다.
// B -> A
public class BtoA_Adapter extends BPlayerImpl implements APlayer {

    // A의 메소드를 구현
    @Override
    public void play(String fileName) {
        //A의 메소드로 상속받은 BPlayerImpl 추상클래스의 메소드를 호출
        System.out.println("Using Adapter : ");
        playFile(fileName);
    }

    @Override
    public void stop() {

    }

    //기존 코드에서 수정해야 할 노력과 분량을 어댑터 클래스 생성에 사용
    //기존에 잘 사용되던 클래스 이므로
    //버그가 발생하면 어댑터 클래스만 집중적으로 살펴보면 된다.

}
