package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The type Mood.
 */
public abstract class Mood {

    /**
     * The Date.
     */
    protected Date date;

    /**
     * Instantiates a new Mood when date is provided.
     *
     * @param date the date
     */
    public Mood(Date date){
        this.date=date;
    }

    /**
     * Instantiates a new Mood with no parameter.
     */
    public Mood(){
        this.date = new Date();
    }

    /**
     * Sets date.
     */
    public void setDate() {
        this.date = date;
    }

    /**
     * Get date date.
     *
     * @return the date
     */
    public Date getDate(){
        return this.date;
    }

    /**
     * Show mood string.
     *
     * @return the mood string
     */
    public abstract String showMood();
}
