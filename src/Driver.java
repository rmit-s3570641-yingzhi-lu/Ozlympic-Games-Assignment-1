import Game.Cycling;
import Participants.Participant;
import Participants.Cyclist;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Driver {
private void generateScore(){
    double score = new Cycling().complete();
    Cyclist par = (Cyclist)Participant.participantHashMap.get("123");
    par.setScore(score);
}

}
