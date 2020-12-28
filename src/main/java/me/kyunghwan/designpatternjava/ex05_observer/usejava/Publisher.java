package me.kyunghwan.designpatternjava.ex05_observer.usejava;

public interface Publisher {

    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();

}
