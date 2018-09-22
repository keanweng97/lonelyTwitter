package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {

    protected Date date;

    public Mood(Date date){
        this.date=date;
    }

    public Mood(){
        this.date = new Date();
    }

    public void setDate() {
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract String showMood();
}
