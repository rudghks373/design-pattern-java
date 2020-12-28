package me.kyunghwan.designpatternjava.ex02_singleton;

public class TestPattern1 {

    public static void main(String[] args) {
        Database database;

        database = Database.getInstance("one");
        System.out.println("This is the "+ database.getName());

        database = Database.getInstance("two");
        System.out.println("This is the "+ database.getName());


    }
}
