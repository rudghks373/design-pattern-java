package me.kyunghwan.designpatternjava.ex08_decorator;

public abstract class IceCream {

    protected String description = "";

    public String getDescription(){
        return this.description;
    }

    public abstract int price();

}
