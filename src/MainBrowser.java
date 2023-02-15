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
	    GoogleChrome googleChrome = new GoogleChrome(newHistory); 
	    googleChrome.whoAmI();
	    System.out.println("The version of google is: "+googleChrome.getVersionNumber());
	    System.out.println(googleChrome.getHistory());
	    
	    Firefox firefox = new Firefox(newHistory);
	       firefox.addContainer();
	     firefox.whoAmI();
	     zoho.whoAmI();
	    browser.whoAmI();
	    
	    
	    Browser tabOne = new GoogleChrome(newHistory);
	    Browser tabTwo = new Firefox(newHistory);
	    Browser tabThree = new Firefox(newHistory);
	    Browser tabFour = new GoogleChrome(newHistory);
	    Browser tabFive = new GoogleChrome(newHistory);
	    Browser tabSix = new GoogleChrome(newHistory);
	    Browser tabSeven = new Firefox(newHistory);
	    Browser[] allBrowsers = new Browser[] {tabOne, tabTwo, tabThree, tabFour, tabFive, tabSix, tabSeven};

	    int countGoogle = 0;
	    int countFirefox =0;

	    for (int i = 0; i < allBrowsers.length; i++) {
	        if (allBrowsers[i] instanceof GoogleChrome) {
	            countGoogle++;
	        } else {
	        	countFirefox++;
	        }
	    }

	    System.out.println("Number of GoogleChrome browser instances: " + countGoogle);
	    System.out.println("Number of Firefox browser instances: " + countFirefox);
	    
	    
	    
	    Integer numTabs = zoho.numberOfTabs;	   
	    System.out.println("the premitive to object 'autoboxing' "+ numTabs);
	    int numTabsOpened = zoho.numberOfTabsOpened;
	    System.out.println("the object to primitive 'unboxing' "+numTabsOpened);
	   
	}
}

