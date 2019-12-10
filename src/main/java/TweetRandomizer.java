import twitter4j.TwitterException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TweetRandomizer {
    public static void main(String[] args) throws TwitterException {
        List<String> tweetList = new ArrayList<>();
        tweetList.add("“I love a good nap. Sometimes it’s the only thing getting me out of bed in the morning.” – George");

        Random random = new Random();
        String stringTweet = tweetList.get(random.nextInt(tweetList.size()));
        TweetSender.sendTweet(stringTweet);
    }
}
