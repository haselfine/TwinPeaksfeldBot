import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterInstantiator {

    final static private String CONSUMER_KEY = System.getenv("CONSUMER_KEY"); //you will need me to send these to you in a zip
    final static private String CONSUMER_SECRET = System.getenv("CONSUMER_SECRET");
    final static private String ACCESS_TOKEN = System.getenv("ACCESS_TOKEN");
    final static private String ACCESS_TOKEN_SECRET = System.getenv("ACCESS_TOKEN_SECRET");

    public static ConfigurationBuilder createConfiguration(){ //as name implies...
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true);
        configurationBuilder.setOAuthConsumerKey(CONSUMER_KEY);
        configurationBuilder.setOAuthConsumerSecret(CONSUMER_SECRET);
        configurationBuilder.setOAuthAccessToken(ACCESS_TOKEN);
        configurationBuilder.setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
        return configurationBuilder; //I use this method to clean up my code so I only have to write this once.
    }

    public static Twitter instantiateTwitter(){
        ConfigurationBuilder configurationBuilder = createConfiguration();
        Twitter twitter = new TwitterFactory(configurationBuilder.build()).getInstance(); //creates instance of authorized twitter account
        return twitter;
    }

    public static TwitterStream instantiateTwitterStream(){
        ConfigurationBuilder configurationBuilder = createConfiguration();
        TwitterStream twitterStream = new TwitterStreamFactory(configurationBuilder.build()).getInstance(); //creates instance of authorized twitter stream
        return twitterStream;
    }
}
