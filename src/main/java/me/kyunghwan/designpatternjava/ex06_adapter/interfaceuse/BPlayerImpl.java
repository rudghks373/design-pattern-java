package me.kyunghwan.designpatternjava.ex06_adapter.interfaceuse;

public class BPlayerImpl implements BPlayer {
    @Override
    public void playFile(String fileName) {
        System.out.println("(B) " + fileName);
    }

    @Override
    public void stop() {

    }
}
