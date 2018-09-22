package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends Mood {

    public HappyMood(){
        super();
    }

    @Override
    public String showMood(){
        String mood = "Happy Mood!";
        return mood;
    }
}
