package Structural.bridge.with;

interface Device {
    void on();
    void off();
}

class TV implements Device{
    public void on() {
        System.out.println("TV is On");
    }
    public void off() {
        System.out.println("TV is Off");
    }
}

class Radio implements Device{
    public void on() {
        System.out.println("Radio is On");
    }
    public void off() {
        System.out.println("Radio is Off");
    }
}

class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.on();
    }

    public void turnOff() {
        device.off();
    }
}


public class Runner {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(new TV());

        remote.turnOn();
        remote.turnOff();

        remote = new RemoteControl(new Radio());

        remote.turnOn();
        remote.turnOff();

    }
}
