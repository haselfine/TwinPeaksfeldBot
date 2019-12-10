import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.File;

public class TweetSender {

    private static final String CONSUMER_KEY = "";
    private static final String CONSUMER_SECRET = "";
    private static final String ACCESS_TOKEN = "";
    private static final String ACCESS_TOKEN_SECRET = "";

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

    public static void sendTweet(String tweetString, File file) throws TwitterException {
        Twitter twitter = instantiateTwitter();
        StatusUpdate statusUpdate = new StatusUpdate(tweetString);
        statusUpdate.setMedia(file);
        twitter.updateStatus(statusUpdate);
        System.out.println("Tweeted status: " + statusUpdate);
    }
}
