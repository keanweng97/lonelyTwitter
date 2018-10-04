package ca.ualberta.cs.lonelytwitter;

/**
 * The type Too long tweet exception.
 */
public class TooLongTweetException extends Exception {
    /**
     * Instantiates a new Too long tweet exception. Pass error message to Exception.
     */
    TooLongTweetException(){
        super("This message is too long! Please enter a tweet with less than 140 character!");
    }
}
