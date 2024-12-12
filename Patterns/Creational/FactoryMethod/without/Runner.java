package Creational.FactoryMethod.without;

class BasicPhone {
    public void assemble() {
        System.out.println("Assembling a Basic Phone");
    }
}

class GamingPhone {
    public void assemble() {
        System.out.println("Assembling a Gaming Phone");
    }
}

class CameraPhone {
    public void assemble() {
        System.out.println("Assembling a Camera Phone");
    }
}

public class Runner {
    public static void main(String[] args) {
        // Client code
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.assemble();

        GamingPhone gamingPhone = new GamingPhone();
        gamingPhone.assemble();

        CameraPhone cameraPhone = new CameraPhone();
        cameraPhone.assemble();
    }
}