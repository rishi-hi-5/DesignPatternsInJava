package Behavioral.state.without;

class Fan{
    String speed;

    Fan(){
        speed="OFF";
    }

    void toggleSpeed(){
        if(speed.equals("OFF")){
            speed="LOW";
        } else if(speed.equals("LOW")){
            speed="MEDIUM";
        } else if(speed.equals("MEDIUM")){
            speed="HIGH";
        } else if(speed.equals("HIGH")){
            speed="OFF";
        }
    }

    void displaySpeed() {
        System.out.println("Current speed of fan is "+speed);
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
