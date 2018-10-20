package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

import static android.media.CamcorderProfile.get;

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){
        try{
            tweets.add(tweet);
        } catch (IllegalArgumentException e) {
            //illegal argument for tweet
        }
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }
	
	public ArrayList<Tweet> getTweets() {
        return tweets;
    }
	
	public int getCount (){
        return tweets.size();
    }
}
