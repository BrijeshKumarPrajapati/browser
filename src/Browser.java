
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Browser {
    private static ArrayList<String> history =new ArrayList<>();
    /*static ArrayList<String> history_1 =new ArrayList<>();
    private ArrayList<String> history_2 =new ArrayList<>();
    ArrayList<String> history_3 =new ArrayList<>();*/
    
    
    private Map<String, Integer> repeatedUrlsAndCount = new HashMap<String, Integer>(); 
    
   /* int numberOfTabs =0; 
    Integer numberOfTabsOpened =30;
    
    */
   
    
	/*public static ArrayList<String> getHistory_1() {
		return history_1;
	}

	public static void setHistory_1(ArrayList<String> history_1) {
		Browser.history_1 = history_1;
	}

	public ArrayList<String> getHistory_2() {
		return history_2;
	}

	public void setHistory_2(ArrayList<String> history_2) {
		this.history_2 = history_2;
	}

	public ArrayList<String> getHistory_3() {
		return history_3;
	}

	public void setHistory_3(ArrayList<String> history_3) {
		this.history_3 = history_3;
	}
	*/
	
   //<----------------Excercise 5---------->
    
    class Bookmarks{  
    	  void messsageBookmarks(){System.out.println("message from member inner class is: "+ history);}  
    	 }  
    
   // <---------------see line no. 113----------->
    
    
    static class History{
    	void messageHistory () {
    		System.out.println("message from static nested class is: "+ history);
    	}
    }
    
   // <------------------------------>
    
    

	public Browser() {}
    
	

    @Override
	public String toString() {
		return "Browser [history=" + history +"]";
	}
    

	public ArrayList<String> getHistory() {
		return history;
	}


	public void setHistory(ArrayList<String> history) {
		this.history.addAll(history);
	}
	
	public Browser(ArrayList<String> history) {
        this.history = history; 
    }
	
	
	
	public void whoAmI(){
		System.out.println("I am a browser");
	}
	
	//<---------Exercise 4----------->
	
	/*public void print() {

		for (int i = 0; i < history.size(); i++) {
			String dummy = history.get(i);

			if (repeatedUrlsAndCount.containsKey(dummy)) {
				repeatedUrlsAndCount.put(dummy, repeatedUrlsAndCount.get(dummy) + 1);
			} else {
				repeatedUrlsAndCount.put(dummy, 1);
			}

	  	}
		for (Map.Entry<String, Integer> entry : repeatedUrlsAndCount.entrySet()) {
			System.out.println(entry.getKey() + " ## " + entry.getValue());
		}
	}*/
	
	//<--------------------------------------------->
	
	
	
	
	
}

interface Shortcuts{
	void messageShortcuts();
}

