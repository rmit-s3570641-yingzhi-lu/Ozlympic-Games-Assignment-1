package Participant;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Athlete{
    private int ID;
    private String name;
    private String State;

    public Athlete(int ID, String name, String state) {
        this.ID = ID;
        this.name = name;
        this.State = state;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
