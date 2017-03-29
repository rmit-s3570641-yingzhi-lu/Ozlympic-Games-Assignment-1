package Participants;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Cyclist extends Athlete{

    public Cyclist(String participantID, String participantName, String participantState, double score) {
        super(participantID, participantName, participantState, score);
    }

    private void set(){
        getScore();
        setScore(30);
    }


    //Athlete athlete = new Athlete();
}
