package Participants;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Athlete extends Participant {

    private double score;

    public Athlete(String participantID, String participantName, String participantState, double score) {
        super(participantID, participantName, participantState);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
