package collectionframework;

import com.github.javafaker.Faker;
import pojos.FootballPlayers;

import java.util.ArrayList;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<FootballPlayers> footballPlayersList = new ArrayList<>();

        Faker faker = new Faker();
        for(int i = 1; i<= 10; i++) {
            footballPlayersList
                    .add(new FootballPlayers(
                            faker.name().firstName(),
                            faker.number().numberBetween(1, 10),
                            faker.number().numberBetween(21, 40)));
        }

        footballPlayersList.sort(new FootballPlayerNameComparator());
        System.out.println(footballPlayersList);

        footballPlayersList.sort(new FootballPlayerRankingComparator());
        System.out.println(footballPlayersList);

        footballPlayersList.sort(new FootballPlayerAgeComparator());
        System.out.println(footballPlayersList);
    }
}
