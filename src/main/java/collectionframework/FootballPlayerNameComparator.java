package collectionframework;

import java.util.Comparator;

public class FootballPlayerNameComparator implements Comparator<FootballPlayersPojo> {
    /*
     * Comparing Football players in ascending order based on name
     */
    @Override
    public int compare(FootballPlayersPojo player1, FootballPlayersPojo player2) {
        return player1.getName().compareTo(player2.getName());
    }
}
