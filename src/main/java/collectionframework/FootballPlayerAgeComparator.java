package collectionframework;

import java.util.Comparator;

public class FootballPlayerAgeComparator implements Comparator<FootballPlayersPojo> {
    /*
     * Comparing Football players in ascending order based on age
     */
    @Override
    public int compare(FootballPlayersPojo player1, FootballPlayersPojo player2) {
        return player1.getAge() - player2.getAge();
    }
}
