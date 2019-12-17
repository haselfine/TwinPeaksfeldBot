import twitter4j.*;

public class NotificationChecker {
    private static final String username = "@TwinPeaksfeld";
    private static final String replyStatus = "The giant told me in a dream: “What's the deal with ";

    public static void main(String[] args) throws TwitterException {
        TwitterStream twitterStream = TwitterInstantiator.instantiateTwitterStream();
        StatusListener listener = getListener();
        twitterStream.addListener(listener);

        FilterQuery filterQuery = new FilterQuery();
        filterQuery.track(username);

        twitterStream.filter(filterQuery);
    }

    private static StatusListener getListener() {
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

    private static void reply(Status status){
        String tweetedAtMe = "@" + status.getUser().getScreenName();
        String completeReply = replyStatus + tweetedAtMe + "?”";
        long inReply = status.getId();
        StatusUpdate statusUpdate = new StatusUpdate(completeReply);
        statusUpdate.setInReplyToStatusId(inReply);

        Twitter twitter = TwitterInstantiator.instantiateTwitter();

        try{
            twitter.updateStatus(statusUpdate);
        } catch (TwitterException te) {
            System.out.println("Ran into twitter exception: " + te);
        }
    }
}

