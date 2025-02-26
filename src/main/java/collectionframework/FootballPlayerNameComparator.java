package collectionframework;

import pojos.FootballPlayers;

import java.util.Comparator;

public class FootballPlayerNameComparator implements Comparator<FootballPlayers> {
    /*
     * Comparing Football players in ascending order based on name
     */
    @Override
    public int compare(FootballPlayers player1, FootballPlayers player2) {
        return player1.getName().compareTo(player2.getName());
    }
}
