
package tweets;

import database.tweetHandler;
import model.LMDrillModel;

/**
 *
 * @author Nancy
 */
public class DDTweetCleaner {
    public LMDrillModel cleanByKeyword(String keyword, LMDrillModel currentlmDM){
        LMDrillModel DDlmDrillModel = tweetHandler.drillDownByLM(keyword, currentlmDM);
//        writeTweets(tweets);
        
        return DDlmDrillModel;
    }
}
