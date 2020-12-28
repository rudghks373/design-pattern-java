package me.kyunghwan.designpatternjava.ex05_observer.usejava;

import java.util.ArrayList;
import java.util.List;

public class PlayController implements Publisher{

    private List<Observer> observers = new ArrayList<>();
    private boolean play;

    @Override
    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void deleteObserver(Observer ob) {
        int index = observers.indexOf(ob);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(play);
        }
    }

    public void setFlag(boolean play){
        this.play = play;
        notifyObservers();
    }

    public boolean getFlag(){
        return play;
    }
}
