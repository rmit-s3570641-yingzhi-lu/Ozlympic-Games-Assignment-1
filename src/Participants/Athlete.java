package Participants;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Athlete extends Participant{

    private String score;

    public Athlete(String participantID, String participantName, String participantState, String score) {
        super(participantID, participantName, participantState);
        this.score=score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
