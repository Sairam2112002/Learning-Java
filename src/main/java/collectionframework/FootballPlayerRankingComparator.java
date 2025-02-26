package collectionframework;

import pojos.FootballPlayers;

import java.util.Comparator;

public class FootballPlayerRankingComparator implements Comparator<FootballPlayers> {
    /*
     * Comparing Football players in ascending order based on ranking
     */
    @Override
    public int compare(FootballPlayers player1, FootballPlayers player2) {
        return player1.getRanking() - player2.getRanking();
    }
}
