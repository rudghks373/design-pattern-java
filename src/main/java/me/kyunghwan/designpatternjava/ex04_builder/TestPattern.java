package me.kyunghwan.designpatternjava.ex04_builder;

public class TestPattern {

    public static void main(String[] args) {
//        Person p1 = createPersonForTesting();

        Person p1 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .addressOne("Address1")
                .addressTwo("Address2")
                .sex("Man")
                .driverLicence(false)
                .married(false)
                .build();

        System.out.println(p1.getAddressOne());

    }

//    public static Person createPersonForTesting(){
//
//        Person person = new Person();
//        person.setFirstName("FirstName");
//        person.setLastName("LastName");
//        person.setAddressOne("Address1");
//        person.setAddressTwo("Address2");
//        person.setSex("Man");
//        person.setDriverLicence(false);
//        person.setMarried(true);
//
//        // ... 멤버변수가 많다면 변수에 값 세팅이 어려워진다.
//        return  person;
//    }

}
