package collectionframework;

import pojos.FootballPlayers;

import java.util.Comparator;

public class FootballPlayerAgeComparator implements Comparator<FootballPlayers> {
    /*
     * Comparing Football players in ascending order based on age
     */
    @Override
    public int compare(FootballPlayers player1, FootballPlayers player2) {
        return player1.getAge() - player2.getAge();
    }
}
