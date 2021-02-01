package chaudhry.faizan.mustansar.training.oop.encapsulation.score;

public class MatchScore {
    private int totalScore = 0;
    private int boundaryCount = 0;
    private int foursCount = 0;
    private int sixesCount = 0;

    public void xRuns(int runs) {
        totalScore += runs;
    }

    public void sixRuns() {
        totalScore += 6;
        sixesCount ++;
        boundaryCount ++;
    }
    public void fourRuns() {
        totalScore += 4;
        foursCount ++;
        boundaryCount ++;
    }

    public void showScoreStatistics() {
        System.out.println("------------------------------------------------");
        System.out.println("--- WELCOME TO PAKISTAN VS INDIA Score sheet ---");
        System.out.println("------------------------------------------------");

        System.out.println("Total runs scored -> "+totalScore);
        System.out.println("Total No of boundaries -> "+boundaryCount);
        System.out.println("Total No of Fours -> "+foursCount);
        System.out.println("Total No of Sixes -> "+sixesCount);

    }




}
