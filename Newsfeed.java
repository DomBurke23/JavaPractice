import java.util.Arrays;

public class Newsfeed {
  
	int[] views = {0, 0, 0, 0};
	String[] topics = {"Opinion","Tech", "Science", "Health"}; 
	String[] favoriteArticles = new String[10]; 
	
	public Newsfeed(){
  }
  
	public String[] getTopics(){
		return topics;
	}
	
	public String getTopTopic(){
		return topics[0];
	}
  
	public void setFavoriteArticle(int favoriteIndex, String newArticle){
		favoriteArticles [favoriteIndex ] =newArticle;
	}
	
	public int getNumTopics(){
		// gets length of array, how many values it can hold 
		System.out.println(topics.length);
		return topics.length;
	}
  
  public static void main(String[] args){
	
    Newsfeed sampleFeed = new Newsfeed();
	System.out.println("The top topic is "+ sampleFeed.getTopTopic()); 
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);  // prints the memory address 
	System.out.println(Arrays.toString(topics)); // prints the array  
	System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
	sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News"); 
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
	System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
  }
}
