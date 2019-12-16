import twitter4j.TwitterException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class TweetRandomizer {


    public static void main(String[] args) throws TwitterException {
        List<String> tweetList = setQuotes();


        Random random = new Random();
        String stringTweet = tweetList.get(random.nextInt(tweetList.size()));
        String randomPhotoPath = getRandomPicture();
        if(stringTweet != null && randomPhotoPath != null){
            System.out.println("Sending tweet: " + stringTweet + ". And file: " + randomPhotoPath);
            TweetSender.sendTweet(stringTweet, randomPhotoPath);
        }
    }

    private static List<String> setQuotes() {
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
        tweetList.add("“I want to make a good entrance. I never makes good entrances.”");
        tweetList.add("“I lie every second of the day. My whole life is a sham.”");
        tweetList.add("“I have a bad feeling that whenever a lesbian looks at me they think \"That's why I'm not a heterosexual.\"”");
        tweetList.add("“See, this is what the holidays are all about. Three buddies sitting around chewing gum.”");
        tweetList.add("“Here's to feeling good all the time.”");
        tweetList.add("“I’ve driven women to lesbianism before, but never a mental institution”");
        tweetList.add("“You know I always wanted to pretend I was an architect”");
        tweetList.add("“You ever dream in 3-D? It’s like the bogeyman is coming RIGHT AT YOU.”");
        tweetList.add("“If you can’t say something bad about a relationship you shouldn’t say anything at all”");
        tweetList.add("“Hey believe me, baldness will catch on. When the aliens come, who do you think they’re gonna relate to? Who do you think is going to be the first ones getting a tour of the ship?”");
        tweetList.add("“Articulate—me? I’ve never articulated anything, I’m completely incoherent.”");
        tweetList.add("“It’s the best part. It’s crunchy, it’s explosive, it’s where the muffin breaks free of the pan and sort of does its own thing. I’ll tell you. That’s a million-dollar idea right there. Just sell the tops.”");
        tweetList.add("“You, my friend, have crossed the line between man and bum.”");
        tweetList.add("“You should've seen her face. It was the exact same look my father gave me when I told him I wanted to be a ventriloquist.”");
        tweetList.add("“Sex, that’s meaningless, I can understand that, but dinner; that’s heavy. That’s like an hour.”");
        tweetList.add("“I heard a weatherman say that 75% of your body heat is actually lost through the top of the top of the head. Which sounds like you could go skiing naked if you got a good hat.”");
        tweetList.add("“People love cinnamon. It should be on tables at restaurants along with salt and pepper. Anytime anyone says, ‘Oh This is so good. What's in it?’ The answer invariably comes back: cinnamon. Cinnamon. Again and again.”");
        tweetList.add("“We never should have landed a man on the moon. It's a mistake. Now everything is compared to that one accomplishment. I can't believe they could land a man on the moon…and taste my coffee! I think we all would have been a lot happier if they hadn't landed a man on the moon. Then we'd go, ‘They can't make a prescription bottle top that's easy to open?’”");
        tweetList.add("“Why did it all turn out like this for me? I had so much promise. I was personable, I was bright. Oh, maybe not academically speaking, but...I was perceptive. I always know when someone's uncomfortable at a party.”");
        tweetList.add("“There is no bigger loser than me!”");
        tweetList.add("“Well, maybe I don’t use my exclamation points as haphazardly as you do.”");
        tweetList.add("“Well, you’re just as pretty as any of them. You just need a nose job.”");
        tweetList.add("“You can't believe this woman. She's one of those low-talkers. You can't hear a word she's saying! You're always going 'excuse me?', 'what was that?'”");
        tweetList.add("“You know your whole life you go through painstaking efforts to hide your nipple and then BOOM, suddenly hundreds of people get their own personal shot of it.”");
        tweetList.add("“Oh, it is wonderful dating in Miami. All the single men under 80 are cocaine smugglers.”");
        tweetList.add("“See, the great thing about robbing a fat guy is it's an easy getaway. You know? They can't really chase ya!”");
        tweetList.add("“I like Christian rock. It's very positive. It's not like those real musicians who think they're so cool and hip.”");
        tweetList.add("“I think I could be a philanthropist. A kick-ass philanthropist! I would have all this money and people would love me. Then they would come to me and beg! And if I felt like it, I would help them out. And then they would owe me big time!”");
        tweetList.add("“Well, the female body is a...work of art. The male body is utilitarian, it's for gettin' around, like a Jeep.”");
        tweetList.add("“I've seen moles so big they have their own moles. Freckles that cover two men.”");
        tweetList.add("“Well, I just stomped some pigeons in the park. They—they didn't move.”");
        tweetList.add("“You've got ‘shiksappeal.’ Jewish men love the idea of meeting a woman that's not like their mother.”");
        tweetList.add("“What's the deal with airplane peanuts?”");
        tweetList.add("“The last thing this guy's qualified to give a tour of is reality.”");
        tweetList.add("“So you want to go out in a final blaze of incompetence?”");
        tweetList.add("“Speaking of exes, my old boyfriend came over late last night, and, yada yada yada, anyway. I'm really tired today.”");
        tweetList.add("“Because I'm REFRESHED. I finally found a way to sleep in my office. Under the desk. I lie on my back. I tuck in the chair. I'm invisible.”");
        tweetList.add("“I had a dream last night that a hamburger was eating me!”");
        tweetList.add("“I can't eat, I can't sleep, all I can see is that giant red sun in the shape of a chicken.”");

        return tweetList;
    }

    private static String getRandomPicture() {


        Random random = new Random();
        File sourceFolder = new File("src/TwinPeaks");
        String[] fileList = sourceFolder.list();
        if(fileList != null){
            String randomPhotoPath = fileList[random.nextInt(fileList.length)];

            return randomPhotoPath;
        }
        return null;

    }
}
