import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
import java.io.File;

public class TweetSender {


    final static private String CONSUMER_KEY = System.getenv("CONSUMER_KEY");
    final static private String CONSUMER_SECRET = System.getenv("CONSUMER_SECRET");
    final static private String ACCESS_TOKEN = System.getenv("ACCESS_TOKEN");
    final static private String ACCESS_TOKEN_SECRET = System.getenv("ACCESS_TOKEN_SECRET");


    public static Twitter instantiateTwitter(){
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true);
        configurationBuilder.setOAuthConsumerKey(CONSUMER_KEY);
        configurationBuilder.setOAuthConsumerSecret(CONSUMER_SECRET);
        configurationBuilder.setOAuthAccessToken(ACCESS_TOKEN);
        configurationBuilder.setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
        Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance();
        return twitter;
    }

    public static void sendTweet(String tweetString, String path) throws TwitterException {
        Twitter twitter = instantiateTwitter();
        StatusUpdate statusUpdate = new StatusUpdate(tweetString);
        String completePath = "src/TwinPeaks/" + path;
        File file = new File(completePath);
        statusUpdate.setMedia(file);
        twitter.updateStatus(statusUpdate);
        System.out.println("Tweeted status: " + statusUpdate);
    }
}
