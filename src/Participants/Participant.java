package Participants;

import Game.Cycling;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Participant {
    private String participantID;
    private String participantName;
    private String participantState;

    public Participant(String participantID, String participantName, String participantState) {
        this.participantID = participantID;
        this.participantName = participantName;
        this.participantState = participantState;
    }

    ArrayList<Participant> participants = new ArrayList<Participant>();

    public HashMap<String, Participant> getParticipantHashMap() {
        return participantHashMap;
    }

    public static HashMap<String,Participant> participantHashMap = new HashMap<String, Participant>();

    public void add(){
        participantHashMap.put("123",new Cyclist("123","jack","abc", 0));

        Participant par = participantHashMap.get("123");
        if(par instanceof Cyclist){
            ;
        }
    }

    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantState() {
        return participantState;
    }

    public void setParticipantState(String participantState) {
        this.participantState = participantState;
    }

    public ArrayList<Participants.Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Participants.Participant> participants) {
        this.participants = participants;
    }

    public static void setParticipantHashMap(HashMap<String, Participants.Participant> participantHashMap) {
        Participant.participantHashMap = participantHashMap;
    }
}

