package me.kyunghwan.designpatternjava.ex08_decorator;

public class IcePop extends IceCream{

    public IcePop() {
        this.description = "아이스크림(바)";
    }

    @Override
    public int price() {
        return 1000;
    }

}
