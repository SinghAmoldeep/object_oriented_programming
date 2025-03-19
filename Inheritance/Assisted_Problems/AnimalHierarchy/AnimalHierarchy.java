package Inheritance.Assisted_Problems.AnimalHierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        dog.makeSound();
        bird.makeSound();
    }
}