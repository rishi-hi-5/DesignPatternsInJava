package Behavioral.visitor.with;


interface AnimalBehaviour {
    void execute(Dog dog);
    void execute(Cat cat);
}

class SoundBehaviour implements AnimalBehaviour{

    @Override
    public void execute(Dog dog) {
        System.out.println("Woof!!!");
    }

    @Override
    public void execute(Cat cat) {
        System.out.println("Meow!!!");
    }
}

class EatingBehaviour implements AnimalBehaviour {

    @Override
    public void execute(Dog dog) {
        System.out.println("dododo!!");
    }

    @Override
    public void execute(Cat cat) {
        System.out.println("namananam");
    }
}


interface Animal {
    void accept(AnimalBehaviour behaviour);
}

class Dog implements Animal{

    @Override
    public void accept(AnimalBehaviour behaviour) {
        behaviour.execute(this);
    }
}

class Cat implements Animal {

    @Override
    public void accept(AnimalBehaviour behaviour) {
        behaviour.execute(this);
    }
}


public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        SoundBehaviour soundBehaviour = new SoundBehaviour();

        cat.accept(soundBehaviour);
        dog.accept(soundBehaviour);

        EatingBehaviour eatingBehaviour = new EatingBehaviour();


        cat.accept(eatingBehaviour);
        dog.accept(eatingBehaviour);
    }
}