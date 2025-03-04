package constructors_and_access_modifiers.level1.person_attributes;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Rishav", 22);
        Person p2 = new Person(p1);
        p2.display();
    }
}