package ca.ualberta.cs.lonelytwitter;

/**
 * The type Happy mood.
 */
public class HappyMood extends Mood {

    /**
     * Instantiates a new Happy mood.
     */
    public HappyMood(){
        super();
    }

    @Override
    public String showMood(){
        String mood = "Happy Mood!";
        return mood;
    }
}
