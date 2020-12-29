package me.kyunghwan.designpatternjava.ex08_decorator.decorator2;

import me.kyunghwan.designpatternjava.ex08_decorator.AmericanStudent;
import me.kyunghwan.designpatternjava.ex08_decorator.Student;

public class TestPattern {

    public static void main(String[] args) {
        Student g1 = new AmericanStudent();
        System.out.println(g1.getDescription());

        Student g2 = new Science(g1);
        System.out.println(g2.getDescription());

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());
    }

}
