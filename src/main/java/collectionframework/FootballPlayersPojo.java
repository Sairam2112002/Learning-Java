package collectionframework;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FootballPlayersPojo {
    private String name;
    private int ranking;
    private int age;

    public FootballPlayersPojo(String name, int ranking, int age) {
        this.name = name;
        this.ranking = ranking;
        this.age = age;
    }

    @Override
    public String toString() {
        return "FootballPlayersPojo{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                ", age=" + age +
                '}' +
                "\n";
    }
}
