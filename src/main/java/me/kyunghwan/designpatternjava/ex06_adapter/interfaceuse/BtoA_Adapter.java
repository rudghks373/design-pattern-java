package me.kyunghwan.designpatternjava.ex06_adapter.interfaceuse;

// B -> A
public class BtoA_Adapter implements APlayer {

    private BPlayer media;

    public BtoA_Adapter(BPlayer media) {
        this.media = media;
    }


    @Override
    public void play(String fileName) {
        //A의 메소드로 B의 메소드를 호출
        System.out.println("Using Adapter : ");
        media.playFile(fileName);
    }

    @Override
    public void stop() {

    }

    //기존 코드에서 수정해야 할 노력과 분량을 어댑터 클래스 생성에 사용
    //기존에 잘 사용되던 클래스 이므로
    //버그가 발생하면 어댑터 클래스만 집중적으로 살펴보면 된다.

}
