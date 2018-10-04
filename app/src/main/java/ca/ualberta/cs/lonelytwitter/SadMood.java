package ca.ualberta.cs.lonelytwitter;

/**
 * The type Sad mood.
 */
public class SadMood extends Mood {

    /**
     * Instantiates a new Sad mood.
     */
    public SadMood(){
        super();
    }

    @Override
    public String showMood(){
        String mood = "Sad Mood :(";
        return mood;
    }
}
