package Behavioral.state.with;

interface FanState {
    void toggleSpeed(Fan fan);
    void displaySpeed();
}

class OffState implements FanState{

    @Override
    public void toggleSpeed(Fan fan) {
        fan.setState(new LowState());
    }

    @Override
    public void displaySpeed() {
        System.out.println("Fan is currently in off state");
    }
}

class LowState implements FanState{

    @Override
    public void toggleSpeed(Fan fan) {
        fan.setState(new MediumState());
    }

    @Override
    public void displaySpeed() {
        System.out.println("Fan is currently in low state");
    }
}

class MediumState implements FanState{

    @Override
    public void toggleSpeed(Fan fan) {
        fan.setState(new HighState());
    }

    @Override
    public void displaySpeed() {
        System.out.println("Fan is currently in medium state");
    }
}

class HighState implements FanState{

    @Override
    public void toggleSpeed(Fan fan) {
        fan.setState(new OffState());
    }

    @Override
    public void displaySpeed() {
        System.out.println("Fan is currently in high state");
    }
}

class Fan{

    private FanState currentState;
    Fan(){
        currentState=new OffState();
    }

    void setState(FanState state) {
        this.currentState = state;
    }

    void toggleSpeed(){
        currentState.toggleSpeed(this);
    }

    void displaySpeed() {
        currentState.displaySpeed();
    }
}

public class Runner {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.toggleSpeed();
        fan.displaySpeed();

        fan.toggleSpeed();
        fan.displaySpeed();

        fan.toggleSpeed();
        fan.displaySpeed();

        fan.toggleSpeed();
        fan.displaySpeed();
    }
}
