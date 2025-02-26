package pojos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FootballPlayers {
    private String name;
    private int ranking;
    private int age;

    public FootballPlayers(String name, int ranking, int age) {
        this.name = name;
        this.ranking = ranking;
        this.age = age;
    }

    @Override
    public String toString() {
        return "FootballPlayers{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                ", age=" + age +
                '}' +
                "\n";
    }
}
