package pl.patryk.gitspring.models;

public class Person {
    public String name;
    public String surname;
    public int age;
    private Address addres;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String get(){
        return name + " " + surname + " " + Integer.toString(age);
    }

    public String getName() {
        return name;
    }
}
