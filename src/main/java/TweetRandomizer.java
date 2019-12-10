import twitter4j.TwitterException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TweetRandomizer {
    public static void main(String[] args) throws TwitterException {
        List<String> tweetList = new ArrayList<>();
        tweetList.add("“I love a good nap. Sometimes it’s the only thing getting me out of bed in the morning.”");
        tweetList.add("“Why is nice bad? What kind of a sick society are we living in when nice is bad?”");
        tweetList.add("“Breaking up is like knocking over a Coke machine. You can’t do it in one push; you got to rock it back and forth a few times, and then it goes over.”");
        tweetList.add("“You know, I got a great idea for a cologne. ‘The Beach’. You spray it on and you smell like you just came home from the beach.”");
        tweetList.add("“People on dates shouldn’t even be allowed out in public.”");
        tweetList.add("“My life is the opposite of everything I want it to be. Every instinct I have, in every walk of life, be it something to wear, something to eat… it’s all been wrong.”");
        tweetList.add("“Do you think it’s effeminate for a man to put clothes in a gentle cycle?”");
        tweetList.add("“See, here, you’re just another apple, but in Japan, you’re an exotic fruit. Like an orange. Which is rare there.”");
        tweetList.add("“Why does everything have to be ‘us’? Is there no ‘me’ left? Why can’t there be some things just for me? Is that so selfish?”");
        tweetList.add("“How long do you have to wait for a guy to come out of a coma before you ask his ex-girlfriend out?”");
        tweetList.add("“You’re giving me the ‘it’s not you, it’s me’ routine? I invented ‘it’s not you, it’s me.’ Nobody tells me it’s them not me; if it’s anybody, it’s me.”");
        tweetList.add("“You know what would make a great coffee table book? A coffee table book about coffee tables!”");
        tweetList.add("“All of a sudden it hit me, I realised what the problem is: I can’t be with someone like me. I hate myself! If anything, I need to get the exact opposite of me. It’s too much. It’s too much, I can’t take it. I can’t take it…”");
        tweetList.add("“What is it about sleep that makes you so thirsty? Do dreams require liquid? It’s not like I’m running a marathon, I’m just lying there.”");
        tweetList.add("“Yeah, I’m a great quitter. It’s one of the few things I do well. I come from a long line of quitters. My father was a quitter, my grandfather was a quitter. I was raised to give up.”");
        tweetList.add("“Boxers! How do you wear these things!! They’re baggin’ up, they’re rising in! And there’s nothing holding me in place! I’m flippin’! I’m floppin’!”");
        tweetList.add("“She dumped me! She rolled right over me! Said I was a hipster doofus. Am I a hipster doofus?”");
        tweetList.add("“I can’t die with dignity. I have no dignity. I want to be the one person who doesn’t die with dignity. I live my whole life in shame. Why should I die with dignity?”");
        tweetList.add("“Tuesday has no feel. Monday has a feel, Friday has a feel, Sunday has a feel…”");
        tweetList.add("“Hey! So what’s the deal with brunch? I mean that if it’s a combination of breakfast and lunch, how comes there’s no ‘lupper’ or no ‘linner’?”");
        tweetList.add("“You dipped the chip. You took a bite. And you dipped again. That’s like putting your whole mouth right in the dip! From now on, when you take a chip — just take one dip and end it.”");
        tweetList.add("“Pity is very underrated. I like it, it’s good.”");
        tweetList.add("“I don’t even care about cops. I wanna see more garbage men. It’s much more important. All I wanna see are garbage trucks, garbage cans and garbage men. You’re never gonna stop crime, we should at least be clean.”");
        tweetList.add("“I can’t stand kids. Adults think it’s so wonderful how honest kids are. I don’t need that kind of honesty. I’ll take a deceptive adult over an honest kid any day.”");
        tweetList.add("“Are you the master of your domain?”");
        tweetList.add("“The jerk store called; they're running out of you!”");
        tweetList.add("“No soup for you!”");
        tweetList.add("“Serenity now!”");
        tweetList.add("“When you look annoyed all the time, people think that you're busy”");
        tweetList.add("“Did you know that the original title for War and Peace was War, What Is It Good For?”");
        tweetList.add("“Who's gonna turn down a Junior Mint? It's chocolate; it's peppermint; it's delicious!”");
        tweetList.add("“He took IT out”");
        tweetList.add("“It's not a lie if you believe it”");
        tweetList.add("“Maybe the dingos ate your baby!”");
        tweetList.add("“These pretzels... are making me thirsty!”");


        Random random = new Random();
        String stringTweet = tweetList.get(random.nextInt(tweetList.size()));
        File file = getRandomPicture();
        if(stringTweet != null && file != null){
            TweetSender.sendTweet(stringTweet, file);
        }
    }

    private static File getRandomPicture() {


        Random random = new Random();
        File sourceFolder = new File("TwinPeaks");
        String[] fileList = sourceFolder.list();
        if(fileList != null){
            String randomPhotoPath = fileList[random.nextInt(fileList.length)];
            File randomPhoto = new File(randomPhotoPath);
            return randomPhoto;
        }
        return null;

    }
}
