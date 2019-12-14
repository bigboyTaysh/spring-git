package pl.patryk.gitspring;

public class Person {
    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String get(){
        return name + " " + surname + " " + Integer.toString(age);
    }
}
