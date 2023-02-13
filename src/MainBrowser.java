import java.util.ArrayList;
import java.util.List;

public class MainBrowser {
	public static void main(String[] args) {
	    Browser br = new Browser();
	    br.setUrl("https://www.google.com");
	
	    ArrayList<String> newHistory = new ArrayList<>();
	           
	   
	    
	    newHistory.add("https://www.facebook.com");
	    newHistory.add("https://www.github.com");
	    br.setHistory(newHistory);
	    
	    System.out.println("Browser history: " + br.getHistory());
	    Browser brow = new Browser(newHistory);
	}
}

