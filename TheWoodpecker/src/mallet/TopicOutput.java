

package mallet;

import java.util.ArrayList;

/**
 *
 * @author Nancy
 */
public class TopicOutput {
    private int topicnum;
    private double relevance;
    private ArrayList<String> keywords;

    public TopicOutput() {
    }
    
    public TopicOutput(int topicnum, double relevance, ArrayList<String> keywords) {
        this.topicnum = topicnum;
        this.relevance = relevance;
        this.keywords = keywords;
    }
    
}
