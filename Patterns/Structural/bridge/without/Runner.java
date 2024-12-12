package Structural.bridge.without;


class TV {
    public void on() {
        System.out.println("TV is On");
    }
    public void off() {
        System.out.println("TV is Off");
    }
}

class Radio {
    public void on() {
        System.out.println("Radio is On");
    }
    public void off() {
        System.out.println("Radio is Off");
    }
}

class RemoteControl {
    private TV tv;
    private Radio radio;

    public RemoteControl(){
        tv=new TV();
        radio=new Radio();
    }

    public void turnOnTV() {
        tv.on();
    }

    public void turnOnRadio() {
        radio.on();
    }

    public void turnOffTV() {
        tv.off();
    }

    public void turnOffRadio() {
        radio.off();
    }
}
public class Runner {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.turnOnTV();
        remoteControl.turnOffTV();

        remoteControl.turnOnRadio();
        remoteControl.turnOffRadio();
    }
}
