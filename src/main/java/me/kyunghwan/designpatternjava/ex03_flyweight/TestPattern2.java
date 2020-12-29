package me.kyunghwan.designpatternjava.ex03_flyweight;

public class TestPattern2 {

    public static void main(String[] args) {
        MyData md1 = new MyData();
        md1.xpos = 10;
        md1.ypos = 11;
        md1.name = "테스트";

        MyData md2 = new MyData();

        //md2 와 md1가 인스턴스를 공유하고 있음
        md2 = md1;

        MyData md3 = new MyData();
        md3.xpos = 20;
        md3.ypos = 21;
        md3.name = "홍길동";


        //md1,md2와 인스턴스 필드 값이 둘다 변한다.
        md2.name = "전우치";
        md2.xpos = 5;


    }

}

class MyData {
    int xpos;
    int ypos;
    String name;
}