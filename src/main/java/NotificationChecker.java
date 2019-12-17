import twitter4j.*;

public class NotificationChecker { //this checks for tweets at bot
    private static final String username = "@TwinPeaksfeld"; //made this static so I can easily change this if I change my username
    private static final String replyStatus = "The giant told me in a dream: “What's the deal with "; //since this is hardcoded, Twitter sometimes filters my replies out of others' notifications

    public static void main(String[] args) throws TwitterException {
        TwitterStream twitterStream = TwitterInstantiator.instantiateTwitterStream(); //authorize stream
        StatusListener listener = getListener();
        twitterStream.addListener(listener);

        FilterQuery filterQuery = new FilterQuery();
        filterQuery.track(username);

        twitterStream.filter(filterQuery);
    }

    private static StatusListener getListener() { //it only uses the onStatus method
        StatusListener statusListener = new StatusListener () {
            @Override
            public void onException(Exception e) {
            }

            public void onStatus(Status status) {
                reply(status);
            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
            }

            @Override
            public void onTrackLimitationNotice(int i) {
            }

            @Override
            public void onScrubGeo(long l, long l1) {
            }

            @Override
            public void onStallWarning(StallWarning stallWarning) {
            }

        };
        return statusListener;
    }

    private static void reply(Status status){ //replies back to twitter account
        String tweetedAtMe = "@" + status.getUser().getScreenName(); //retrieve username
        String completeReply = tweetedAtMe + " " + replyStatus + tweetedAtMe + "?”"; //message to tweet
        long inReply = status.getId(); //get id of status for reply
        StatusUpdate statusUpdate = new StatusUpdate(completeReply).inReplyToStatusId(inReply); //Status update is indicated as a reply

        Twitter twitter = TwitterInstantiator.instantiateTwitter(); //authorize to tweet on my behalf

        try{
            twitter.updateStatus(statusUpdate); //send tweet
        } catch (TwitterException te) {
            System.out.println("Ran into twitter exception: " + te); //this tells me if I've sent too many tweets in a short time
        }
    }
}

