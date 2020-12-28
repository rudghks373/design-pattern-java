package me.kyunghwan.designpatternjava.ex05_observer.usejava2;

public interface Publisher {

    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();

}
