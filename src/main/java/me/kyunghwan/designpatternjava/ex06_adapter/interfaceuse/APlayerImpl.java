package me.kyunghwan.designpatternjava.ex06_adapter.interfaceuse;

public class APlayerImpl implements APlayer {
    @Override
    public void play(String fileName) {
        System.out.println("(A) " + fileName);
    }

    @Override
    public void stop() {
    }
}
