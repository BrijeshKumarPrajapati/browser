
import java.util.Arrays;



import java.util.ArrayList;

public class Browser {
    private static  String url;
    private static ArrayList<String> history =new ArrayList<>();
    
    
    
	public Browser() {}
    
    @Override
	public String toString() {
		return "Browser [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static String getUrl() {
		return url;
	}
public static void setUrl(String url) {
		Browser.url = url;
	}

	public static ArrayList<String> getHistory() {
		return history;
	}



	public static void setHistory(ArrayList<String> history) {
		Browser.history = history;
	}

	

	public  Browser(ArrayList<String> history) {
        this.history = history;
        history.add(url);
        System.out.println("new history is "+history);
    }
	
}


