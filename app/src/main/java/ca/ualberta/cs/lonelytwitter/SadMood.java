package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends Mood {

    public SadMood(){
        super();
    }

    @Override
    public String showMood(){
        String mood = "Sad Mood :(";
        return mood;
    }
}
