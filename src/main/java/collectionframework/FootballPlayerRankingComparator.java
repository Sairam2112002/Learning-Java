package collectionframework;

import java.util.Comparator;

public class FootballPlayerRankingComparator implements Comparator<FootballPlayersPojo> {
    /*
     * Comparing Football players in ascending order based on ranking
     */
    @Override
    public int compare(FootballPlayersPojo player1, FootballPlayersPojo player2) {
        return player1.getRanking() - player2.getRanking();
    }
}
