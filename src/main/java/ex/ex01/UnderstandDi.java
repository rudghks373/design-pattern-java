package ex.ex01;

public class UnderstandDi {

    public static void main(String[] args) {

    }

    //강한결합 : 직접생성
    public static void memberUser1(){
        Member m1 = new Member();
    }

    //약한 결합 : 생성된 것을 주입 받음 (의존 주입 : Dependency Injection)
    public static void memberUser2(Member m){
        Member m2 = m;
    }

}

//Member을 사용한다 -> Member의 기능에 의존한다
class Member {

    String name;
    String nickName;
    public Member(){}

}
