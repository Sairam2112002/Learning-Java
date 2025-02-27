package collectionframework;

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
        List<ComparableInterface> personList = new ArrayList<>();
        personList.add(new ComparableInterface("John Doe", 30));
        personList.add(new ComparableInterface("Jane Smith", 25));
        personList.add(new ComparableInterface("Alice Johnson", 45));
        personList.add(new ComparableInterface("Bob Brown", 20));
        personList.add(new ComparableInterface("Michael Davis", 35));
        personList.add(new ComparableInterface("Linda Wilson", 28));
        personList.add(new ComparableInterface("Chris Moore", 38));
        personList.add(new ComparableInterface("Patricia Taylor", 42));
        personList.add(new ComparableInterface("Helen White", 32));
        personList.add(new ComparableInterface("Rachel Green", 29));

        Collections.sort(personList);
        System.out.println(personList);
    }
}
