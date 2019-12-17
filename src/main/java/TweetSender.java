import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
import java.io.File;

public class TweetSender {

    public static void sendTweet(String tweetString, String path) throws TwitterException {
        Twitter twitter = TwitterInstantiator.instantiateTwitter();
        StatusUpdate statusUpdate = new StatusUpdate(tweetString); //converts string to statusUpdate object
        File file = new File(path); //converts file path to file object
        statusUpdate.setMedia(file); //set to upload file to statusUpdate
        twitter.updateStatus(statusUpdate); //sends out tweet
        System.out.println("Tweeted status: " + statusUpdate); //prints confirmation that tweet was sent
    }
}
