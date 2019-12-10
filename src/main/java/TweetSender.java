import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TweetSender {

    private static Twitter twitter;

    public TweetSender(){
        twitter = TwitterFactory.getSingleton();
    }

    public static void sendTweet(String tweetString) throws TwitterException {
        Status status = twitter.updateStatus(tweetString);
        System.out.println("Tweeted status: " + status);
    }
}
