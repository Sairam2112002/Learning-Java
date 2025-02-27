package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<FootballPlayersPojo> footballPlayersList = new ArrayList<>();
        footballPlayersList.add(new FootballPlayersPojo("Lionel Messi", 1, 34));
        footballPlayersList.add(new FootballPlayersPojo("Neymar Jr", 3, 29));
        footballPlayersList.add(new FootballPlayersPojo("Kevin De Bruyne", 5, 30));
        footballPlayersList.add(new FootballPlayersPojo("Robert Lewandowski", 6, 32));
        footballPlayersList.add(new FootballPlayersPojo("Virgil van Dijk", 7, 30));
        footballPlayersList.add(new FootballPlayersPojo("Mohamed Salah", 8, 29));
        footballPlayersList.add(new FootballPlayersPojo("Eden Hazard", 9, 30));
        footballPlayersList.add(new FootballPlayersPojo("Xavi Hernandez", 11, 41));
        footballPlayersList.add(new FootballPlayersPojo("Andres Iniesta", 12, 37));
        footballPlayersList.add(new FootballPlayersPojo("Ronaldinho Gaucho", 13, 41));

        footballPlayersList.sort(new FootballPlayerNameComparator());
        System.out.println(footballPlayersList);

        footballPlayersList.sort(new FootballPlayerRankingComparator());
        System.out.println(footballPlayersList);

        footballPlayersList.sort(new FootballPlayerAgeComparator());
        System.out.println(footballPlayersList);
    }
}
