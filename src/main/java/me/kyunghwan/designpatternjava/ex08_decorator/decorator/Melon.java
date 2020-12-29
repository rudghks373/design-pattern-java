package me.kyunghwan.designpatternjava.ex08_decorator.decorator;

import me.kyunghwan.designpatternjava.ex08_decorator.IceCream;

public class Melon extends Decorator{

    // Wrapping 하고자 하는 음료를 저장하기 위한 Instance 변수
    IceCream iceCream;

    public Melon(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int price() {
        return 1000 + iceCream.price();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + 멜론";
    }
}
