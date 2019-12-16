import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
import java.io.File;

public class TweetSender {


    final static private String CONSUMER_KEY = System.getenv("CONSUMER_KEY"); //you will need me to send these to you in a zip
    final static private String CONSUMER_SECRET = System.getenv("CONSUMER_SECRET");
    final static private String ACCESS_TOKEN = System.getenv("ACCESS_TOKEN");
    final static private String ACCESS_TOKEN_SECRET = System.getenv("ACCESS_TOKEN_SECRET");


    public static Twitter instantiateTwitter(){ //uses keys from environmental values to link to account for later tweeting
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true);
        configurationBuilder.setOAuthConsumerKey(CONSUMER_KEY);
        configurationBuilder.setOAuthConsumerSecret(CONSUMER_SECRET);
        configurationBuilder.setOAuthAccessToken(ACCESS_TOKEN);
        configurationBuilder.setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
        Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance(); //creates instance of authorized twitter account
        return twitter;
    }

    public static void sendTweet(String tweetString, String path) throws TwitterException {
        Twitter twitter = instantiateTwitter();
        StatusUpdate statusUpdate = new StatusUpdate(tweetString); //converts string to statusUpdate object
        File file = new File(path); //converts file path to file object
        statusUpdate.setMedia(file); //set to upload file to statusUpdate
        twitter.updateStatus(statusUpdate); //sends out tweet
        System.out.println("Tweeted status: " + statusUpdate); //prints confirmation that tweet was sent
    }
}
