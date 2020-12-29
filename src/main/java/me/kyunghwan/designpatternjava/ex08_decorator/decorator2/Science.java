package me.kyunghwan.designpatternjava.ex08_decorator.decorator2;

import me.kyunghwan.designpatternjava.ex08_decorator.Student;

public class Science extends StudentDecorator{

    private Student student;

    public Science(Student student) {
        this.student = student;
    }

    @Override
    public String getDescription() {
        return student.getDescription() + " Like Science";
    }

    public void caltulateStuff(){
        System.out.println("scientific calculation!");
    }
}
