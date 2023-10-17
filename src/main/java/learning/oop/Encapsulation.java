package learning.oop;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Sai Ram");
        person.setAge(21);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
