package me.kyunghwan.designpatternjava.ex06_adapter.interfaceuse;

public class TestPattern {

    public static void main(String[] args) {

        APlayer aPlayer = new APlayerImpl();
        aPlayer.play("aaa.mp3");

        //계약기간 만료로 APlaterImpl()을 사용 할 수 없다.
        //BPlayer : 새로 도입한 방식(잘 동작 할 것이다.)

        BPlayer bPlayer = new BPlayerImpl();
        bPlayer.playFile("bbb.mp3");

        // APlayer obj = (어댑터) = new BPlayerImpl();
        // 기존의 잘 동작하던 코드와 새로 도입된 코드를
        // 변경 없이 사용하고 싶은 것이다.
        // 어댑터 적용 후 에러가 난다면 어댑터 부분만 보면 될 것이다.
        aPlayer = new BtoA_Adapter(new BPlayerImpl());
        aPlayer.play("ccc.mp3");

        //현재 모든 코드가 APlayer 인터페이스에 맞춰서 코딩되어 있다.
        //그러므로 여기서 APlayer에 대입되는 객체만 수정해주면
        //APlayer 인터페이스가 사용되는 부분에서는 수정할 필요가 없다.
    }

}
