import java.util.Arrays;

/* when running this file in the command line do 
 * javac Newsfeed2.java 
 * java Newsfeed2 Robot
 */

public class Newsfeed2 {
  
  String[] topics;
  
  public Newsfeed2(String[] initialTopics) {
		topics = initialTopics;
  }
  
  public static void main(String[] args) {
		Newsfeed2 feed;
    if (args[0].equals("Human")) {
      
      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new Newsfeed2(humanTopics);
      
    } else if( args[0].equals("Robot") ) { 
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Newsfeed2(robotTopics);
      
    } else {
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Newsfeed2(genericTopics);
    } 
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}
