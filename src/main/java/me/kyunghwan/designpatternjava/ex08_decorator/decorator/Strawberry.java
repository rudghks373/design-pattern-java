package me.kyunghwan.designpatternjava.ex08_decorator.decorator;

import me.kyunghwan.designpatternjava.ex08_decorator.IceCream;

// Strawberry Decorator이기 때문에 Decorator을 상속한다.
public class Strawberry extends Decorator{

    // Wrapping 하고자 하는 음료를 저장하기 위한 Instance 변수
    IceCream iceCream;

    public Strawberry(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int price() {
        return 500 + iceCream.price();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + 딸기";
    }
}
