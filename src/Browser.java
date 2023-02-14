
import java.util.Arrays;
import java.util.ArrayList;

public class Browser {
    private static ArrayList<String> history =new ArrayList<>();
    static ArrayList<String> history_1 =new ArrayList<>();
    private ArrayList<String> history_2 =new ArrayList<>();
    ArrayList<String> history_3 =new ArrayList<>();
    
    
	public static ArrayList<String> getHistory_1() {
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
	
	

	public Browser() {}
    
	

    @Override
	public String toString() {
		return "Browser [history_2=" + history_2 + ", history_3=" + history_3 + ", history_1=" + history_1 + ", history=" + history +"]";
	}
    

	public ArrayList<String> getHistory() {
		return history;
	}


	public static void setHistory(ArrayList<String> history) {
		Browser.history = history;
	}
	

	public Browser(ArrayList<String> history) {
        this.history = history; 
    }
	
	
	
	public void whoAmI(){
		System.out.println("I am a browser");
	}
	
}


