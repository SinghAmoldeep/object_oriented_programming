package constructors_and_access_modifiers.level1.person_attributes;

public class Person {
    private String name;
    private int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(Person p){
        this(p.name, p.age);
    }
    public void display(){
        System.out.println("Name: " + name + " | Age: " + age);
    }
}