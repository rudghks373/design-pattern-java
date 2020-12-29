package me.kyunghwan.designpatternjava.ex07_facade;

public class HomeFacade {

    private Computer computer;
    private Radio radio;
    private Light light;

    public HomeFacade(Computer computer, Radio radio, Light light) {
        this.computer = computer;
        this.radio = radio;
        this.light = light;
    }

    public void homeIn(){
        System.out.println("집에오면 Computer 켜고, Radio 켜고, Light 켜기");
        if(!computer.isTurnedOn()){
            computer.turnOn();
        }
        if(!radio.isTurnedOn()){
            radio.turnOn();
        }
        if(!light.isTurnedOn()) {
            light.turnOn();
        }
    }

    public void homeOut(){
        System.out.println("외출하면 Computer 끄고, Radio 끄고, Light 끄기");
        if(computer.isTurnedOn()){
            computer.turnOff();
        }
        if(radio.isTurnedOn()){
            radio.turnOff();
        }
        if(light.isTurnedOn()) {
            light.turnOff();
        }
    }

}
