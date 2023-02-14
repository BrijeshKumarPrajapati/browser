import java.util.ArrayList;

public class MainBrowser {
	public static void main(String[] args) {
	    Browser zoho = new Browser();
	    ArrayList<String> newHistory = new ArrayList<>();
	         
	    newHistory.add("https://www.facebook.com");
	    newHistory.add("https://www.github.com");
	   
	    zoho.setHistory(newHistory);
	    
	    zoho.setHistory_1(newHistory);
	    zoho.setHistory_2(newHistory);
	    zoho.setHistory_3(newHistory);
	   
	   
	    System.out.println("Browser history: " + zoho.getHistory());
	    System.out.println("Browser history_1 is: " + zoho.getHistory_1());
	    System.out.println("Browser history_2 is: " + zoho.getHistory_2());
	    System.out.println("Browser history_3 is: " + zoho.getHistory_3());
	    Browser browser = new Browser(newHistory);
	    System.out.println(browser);
	    System.out.println(zoho);
	}
}

