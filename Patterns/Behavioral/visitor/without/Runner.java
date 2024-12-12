package Behavioral.visitor.without;

class Dog {
    // some code

    public void makeSound(){
        System.out.println("Woof!!");
    }
}

class Cat {
    //some code

    public void makeSound(){
        System.out.println("Meow!!");
    }
}

public class Runner{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // dog

        // cat

        dog.makeSound();
        cat.makeSound();
    }
}