package Creational.Builder.without;


class CarConfig {
    String color;
    String engine;
    String seats;
    String sunroof;
    boolean alloyWheels;

    int airbags;

    public CarConfig(String color, String engine, String seats, String sunroof, boolean alloyWheels, int airbags) {
        this.color = color;
        this.engine = engine;
        this.seats = seats;
        this.sunroof = sunroof;
        this.alloyWheels = alloyWheels;
        this.airbags = airbags;
    }

    @Override
    public String toString() {
        return "CarConfig{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", seats='" + seats + '\'' +
                ", sunroof='" + sunroof + '\'' +
                ", alloyWheels=" + alloyWheels +
                ", airbags=" + airbags +
                '}';
    }
}
public class Runner {

    public static void main(String[] args) {
        CarConfig carConfig = new CarConfig("Red","V8","Leather seats","Panaromic",true,2);
        System.out.println(carConfig);
    }
}
