package collectionframework;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter @Setter
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' +
                "\n";
    }

    public static void main(String[] args) {
        Faker faker = new Faker();

        List<Person> personList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            personList.add(new Person(faker.name().firstName(), faker.number().numberBetween(1, 100)));
        }

        Collections.sort(personList);
        System.out.println(personList);

    }
}
