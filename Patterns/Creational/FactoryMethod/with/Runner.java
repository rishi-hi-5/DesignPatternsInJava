package Creational.FactoryMethod.with;

// Phone Interface
interface Phone {
    void assemble();
}

// Concrete Classes
class BasicPhone implements Phone {
    public void assemble() {
        System.out.println("Assembling a Basic Phone");
    }
}

class GamingPhone implements Phone {
    public void assemble() {
        System.out.println("Assembling a Gaming Phone");
    }
}

class CameraPhone implements Phone {
    public void assemble() {
        System.out.println("Assembling a Camera Phone");
    }
}

// Factory Class
class PhoneFactory {
    public static Phone createPhone(String type) {
        switch (type) {
            case "Basic":
                return new BasicPhone();
            case "Gaming":
                return new GamingPhone();
            case "Camera":
                return new CameraPhone();
            default:
                return null;
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        // Client code

        Phone phone = PhoneFactory.createPhone("Basic");
        phone.assemble();  // Changing type in factory, no need to rewrite classes!

        phone = PhoneFactory.createPhone("Gaming");
        phone.assemble();  // Changing type in factory, no need to rewrite classes!

        phone = PhoneFactory.createPhone("Camera");
        phone.assemble();  // Changing type in factory, no need to rewrite classes!
    }
}
