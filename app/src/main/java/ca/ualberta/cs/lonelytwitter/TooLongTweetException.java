package ca.ualberta.cs.lonelytwitter;

public class TooLongTweetException extends Exception {
    TooLongTweetException(){
        super("This message is too long! Please enter a tweet with less than 140 character!");
    }
}
