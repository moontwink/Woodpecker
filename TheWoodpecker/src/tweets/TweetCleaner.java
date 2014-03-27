
package tweets;

import database.Writer;
import database.tweetHandler;
import model.tweetModel;
import java.io.IOException;
import java.util.ArrayList;
import model.LMDrillModel;

/**
 *
 * @author Nancy
 */
public class TweetCleaner {
    ArrayList<tweetModel> tweets;
    
    public LMDrillModel cleanByKeyword(String keyword){
        
        LMDrillModel lmDrillModel = tweetHandler.getAllTweetsByKeyword(keyword);
//        writeTweets(tweets);
        
        return lmDrillModel;
    }
    
    public LMDrillModel cleanByDate(String start, String end){
        LMDrillModel lmDrillModel = tweetHandler.getAllTweetsByDate(start, end);
        writeTweets(tweets);
        return lmDrillModel;
    }
    
    public LMDrillModel cleanByKeywordsAndDate(String keywords, String start, String end){
        LMDrillModel lmDrillModel = tweetHandler.getAllTweetsByKeywordAndDate(keywords, start, end);
//        writeTweets(tweets);
        return lmDrillModel;
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
