package collectionframework;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter @Setter
public class ComparableInterface implements Comparable<ComparableInterface> {
    private String name;
    private int age;

    public ComparableInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(ComparableInterface person) {
        return this.age - person.age;
    }

    @Override
    public String toString() {
        return "ComparableInterface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' +
                "\n";
    }

    public static void main(String[] args) {
        Faker faker = new Faker();

        List<ComparableInterface> personList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            personList.add(new ComparableInterface(faker.name().firstName(), faker.number().numberBetween(1, 100)));
        }

        Collections.sort(personList);
        System.out.println(personList);
    }
}
