
package tweets;

import database.Writer;
import database.tweetHandler;
import database.tweetModel;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Nancy
 */
public class TweetCleaner {
    ArrayList<tweetModel> tweets;
    
    public ArrayList<tweetModel> cleanByKeyword(String keyword){
        
        tweets = tweetHandler.getAllTweetsByKeyword(keyword);
        writeTweets(tweets);
        
        return tweets;
    }
    
    public ArrayList<tweetModel> cleanByDate(String start, String end){
        tweets = tweetHandler.getAllTweetsByDate(start, end);
        writeTweets(tweets);
        return tweets;
    }
    
    public ArrayList<tweetModel> cleanByKeywordsAndDate(String keywords, String start, String end){
        tweets = tweetHandler.getAllTweetsByKeywordAndDate(keywords, start, end);
        writeTweets(tweets);
        return tweets;
    }
    
    private void writeTweets(ArrayList<tweetModel> tweets){
        String filePath = "src\\tweets.txt";
        
        //Rewrites tweet to text file
        try{
            Writer write = new Writer(filePath, false);
            write.writeToFile(tweets.size()+" TWEETS");
            Writer write2 = new Writer(filePath, true);
            for(tweetModel tm : tweets)
                write2.writeToFile(tm.getMessage());
//            System.out.print("__! Rewrite Successful! __");
        }catch(IOException ex){
            System.out.println("__! Sorry, No Can Do!");
        }
    }
}
