package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The type Tweet.
 */
public abstract class Tweet {

    /**
     * The Message.
     */
    protected String message;
    /**
     * The Date.
     */
    protected Date date;

    /**
     * Instantiates a new Tweet when no parameter is provided.
     */
    public Tweet(){
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet when message is provided.
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Sets message. Throws exception if message is longer than 140 characters.
     *
     * @param message the message
     * @throws TooLongTweetException the too long tweet exception
     */
    public void setMessage(String message) throws TooLongTweetException {
        if (message.length()>140){
            throw new TooLongTweetException();
        }
        this.message = message;
    }

    /**
     * Sets date.
     */
    public void setDate() {
        this.date = date;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return this.message;
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
     * Is important boolean. Returns true if important, false if not important.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    public String toString() {
        return this.date.toString()+" | "+this.message;
    }
}
