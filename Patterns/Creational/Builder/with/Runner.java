package Creational.Builder.with;


class CarConfig {
    String color;
    String engine;
    String seats;
    String sunroof;
    boolean alloyWheels;

    int airbags;

//    public CarConfig(String color, String engine, String seats, String sunroof, boolean alloyWheels, int airbags) {
//        this.color = color;
//        this.engine = engine;
//        this.seats = seats;
//        this.sunroof = sunroof;
//        this.alloyWheels = alloyWheels;
//        this.airbags = airbags;
//    }

    private CarConfig(String color, String engine, String seats, String sunroof, boolean alloyWheels, int airbags) {
        this.color = color;
        this.engine = engine;
        this.seats = seats;
        this.sunroof = sunroof;
        this.alloyWheels = alloyWheels;
        this.airbags = airbags;
    }

    public static class Builder {
        String color;
        String engine;
        String seats;
        String sunroof;
        boolean alloyWheels;

        int airbags;

        public Builder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSeats(String seats) {
            this.seats = seats;
            return this;
        }

        public Builder setSunroof(String sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Builder setAlloyWheels(boolean alloyWheels) {
            this.alloyWheels = alloyWheels;
            return this;
        }

        public CarConfig build(){
            return new CarConfig(color,engine,seats,sunroof,alloyWheels,airbags);
        }

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
//        CarConfig carConfig = new CarConfig("Red","V8","Leather seats","Panaromic",true,2);

        CarConfig carConfig = new CarConfig.Builder()
                .setColor("Red")
                .setAirbags(2)
                .setAlloyWheels(true)
                .setEngine("V8")
                .setSeats("Leather Seats")
                .setSunroof("Panaromic")
                .build();

        System.out.println(carConfig);
    }
}