package Ashish_4th2025;


class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}


public class Experiment_1 {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        Animal cat = new Cat();

        
        dog.makeSound();  
        cat.makeSound();  
    }
}
