import twitter4j.TwitterException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class TweetRandomizer {


    public static void main(String[] args) throws TwitterException {
        List<String> tweetList = getQuotes();
        String stringTweet = null;
        if(tweetList != null){
            stringTweet = getRandomQuote(tweetList);
        }
        String randomPhotoPath = getRandomPicture();
        if(stringTweet != null && randomPhotoPath != null){ //make sure no nulls are passed
            System.out.println("Sending tweet: " + stringTweet + ". And file: " + randomPhotoPath); //prints which quote/picture are being sent to tweet
            TweetSender.sendTweet(stringTweet, randomPhotoPath);
        }
    }

    private static List<String> getQuotes(){ //retrieves list of quotes from text file
        String fileName = "seinfeldQuotes.txt";
        List<String> seinfeldQuoteList = new ArrayList<>();
        try(FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader)){
            String line = bufferedReader.readLine();

            while(line != null){
                seinfeldQuoteList.add(line);
                line = bufferedReader.readLine();
            }
            return seinfeldQuoteList;
        } catch (IOException ioe){
            System.out.println("The following went wrong in the reading process: " + ioe);
        }
        return null;
    }

    private static String getRandomQuote(List<String> tweetList) {
        Random random = new Random();
        return tweetList.get(random.nextInt(tweetList.size()));
    }

    private static String getRandomPicture() {


        Random random = new Random();
        File sourceFolder = new File("src/TwinPeaks"); //folder of pictures is located under this path
        String[] fileList = sourceFolder.list(); //lists all files in folder
        if(fileList != null){ //as long as the folder has files...
            String randomPhotoFile = fileList[random.nextInt(fileList.length)]; //choose a random number between 0 and the size of the file list, choose that number file
            String completePath = "src/TwinPeaks/" + randomPhotoFile; //add file name to end of path
            return completePath; //send back to main
        }
        return null; //if it fails, return null

    }
}
