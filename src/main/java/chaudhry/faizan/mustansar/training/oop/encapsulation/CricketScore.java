package chaudhry.faizan.mustansar.training.oop.encapsulation;

import chaudhry.faizan.mustansar.training.oop.encapsulation.score.MatchScore;

public class CricketScore {
    public static void main(String[] args) {

        /*

        FM: Here you can see that the Cricket Score class does not know how the score is being calculated
            and how it is being shown by the statistics method.

            THIS IS ENCAPSULATION FOR YOU.

        */

        MatchScore scorer = new MatchScore();
        scorer.xRuns(1);
        scorer.xRuns(1);
        scorer.xRuns(2);
        scorer.fourRuns();
        scorer.xRuns(3);
        scorer.xRuns(1);
        scorer.sixRuns();
        scorer.sixRuns();
        scorer.sixRuns();
        scorer.xRuns(0);
        scorer.xRuns(0);
        scorer.xRuns(0);
        scorer.fourRuns();

        scorer.showScoreStatistics();
    }
}
