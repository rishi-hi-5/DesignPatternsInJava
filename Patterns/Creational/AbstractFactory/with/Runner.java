package Creational.AbstractFactory.with;


interface Sofa {
    void display();
}

interface Chair {
    void display();
}

//abstract factory
interface FurnitureFactory {
    Sofa createSofa();
    Chair createChair();
}

class ModernSofa implements Sofa{

    @Override
    public void display() {
        System.out.println("Display Modern Sofa");
    }
}


class ModernChair implements Chair{

    @Override
    public void display() {
        System.out.println("Display Modern Chair");
    }
}


class VictorianSofa implements Sofa{

    @Override
    public void display() {
        System.out.println("Display Victorian Sofa");
    }
}


class VictorianChair implements Chair{

    @Override
    public void display() {
        System.out.println("Display Victorian Chair");
    }
}

class ModermFurnitureFactory implements FurnitureFactory{

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}


class FurnitureShop {

    private FurnitureFactory factory;

    public FurnitureShop(FurnitureFactory factory){
        this.factory = factory;
    }

    void displayFurniture(){
        Sofa sofa= factory.createSofa();
        Chair chair = factory.createChair();

        sofa.display();
        chair.display();
    }
}

public class Runner {
    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop(new ModermFurnitureFactory());
        furnitureShop.displayFurniture();


        furnitureShop = new FurnitureShop(new VictorianFurnitureFactory());
        furnitureShop.displayFurniture();
    }
}