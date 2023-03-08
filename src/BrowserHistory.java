import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Collections;
import com.sun.javafx.collections.MappingChange.Map;


//$Id$

public class BrowserHistory {
	private String currentUrl; 
	 private List <String> historyArrayList = new ArrayList<> ();
	 private List <String> historyLinkedList = new LinkedList();  
	 private List <String> historyVector = new Vector();  
	 private List <String> historyStack = new Stack();  
	 
	 private List <String> indexHistory_1 = new ArrayList<> ();
	 private List <String> indexHistory_2 = new ArrayList<> ();
	 private List <String> indexHistory_3 = new ArrayList<> ();
	 private List <String> indexHistory_4 = new ArrayList<> ();
	 
	 private List <String> urlHistory_1 = new ArrayList<> ();
	 private List <String> urlHistory_2 = new ArrayList<> ();
	 private List <String> urlHistory_3 = new ArrayList<> ();
	 private List <String> urlHistory_4 = new ArrayList<> ();
	 
	 
	 private Set<String>  historyHashSet = new HashSet<String> ();
	 private Set<String> historyLinkedHashSet = new LinkedHashSet<String>();  		
	 private SortedSet<String> historySortedSet = new  TreeSet<String> ();
	 
	 
	 /*
	 private List<String> extentionUrlCom = new ArrayList <String> ();
	 private List<String> extentionUrlIn = new ArrayList <String> (); 
	 private List<String> extentionUrlOrg = new ArrayList <String> ();
	 
	 
	 private HashMap<String, List<String> > historyHashMap = new HashMap<String, List<String>> ();
	 private  TreeMap<String, List> historyTreeMap = new TreeMap<String,List>();    
	 private  LinkedHashMap<String, List> historyLinkedHashMap = new LinkedHashMap<String, List>();
	 
	 
	*/
	 
	 /*
	 private String keyCom;
	 private String keyIn;
	 private String keyOrg;*/

	 int j=0;
	        
	        
	       public void visit(String url) {
	        	currentUrl = url;
	        	//<-------------------Part-1------------->S
				historyArrayList.add(url);
				historyArrayList.add("facebook.com");
				historyArrayList.add("www.abcd.com");
				historyArrayList.add("www.bcdef.in");
				System.out.println("The ArrayList is: "+historyArrayList);
				historyLinkedList.add(url);
				historyLinkedList.add("facebook.com");
				historyLinkedList.add("www.abcd.com");
				historyLinkedList.add("www.bcdef.in");
				System.out.println("The LinkedList is: "+historyLinkedList);
				historyVector.add(url);
				historyVector.add("facebook.com");
				historyVector.add("www.abcd.com");
				historyVector.add("www.bcdef.in");
				System.out.println("The Vector is: "+historyVector);
				historyStack.add(url);
				historyStack.add("facebook.com");
				historyStack.add("www.abcd.com");
				historyStack.add("www.bcdef.in");
				System.out.println("The Stack is: "+historyStack);
				
				
				
				System.out.println("<--------------------------------------->");
				
				
				historyHashSet.add(url);
				historyHashSet.add("facebook.com");
				historyHashSet.add("www.abcd.com");
				historyHashSet.add("www.bcdef.in");
				System.out.println("The Hash Set is: "+historyHashSet);
				historyLinkedHashSet.add(url);
				historyLinkedHashSet.add("facebook.com");
				historyLinkedHashSet.add("www.abcd.com");
				historyLinkedHashSet.add("www.bcdef.in");
				System.out.println("The Linked Hash Set is: "+historyLinkedHashSet);
				historySortedSet.add(url);
				historySortedSet.add("facebook.com");
				historySortedSet.add("www.abcd.com");
				historySortedSet.add("www.bcdef.in");
				System.out.println("The Sorted Set is: "+historySortedSet);   
	        	
	        	}
	        	
	        	
	 
				   public void sort() {
			 	
			 	Collections.sort(this.historyArrayList);
			 	Collections.sort(this.historyLinkedList);
			 	Collections.sort(this.historyVector);
			 	Collections.sort(this.historyStack);
			 	System.out.println("<--------------------------------------->");
			     System.out.println("The sorted array list is: "+ this.historyArrayList);
			     System.out.println("The sorted linked list is: "+ this.historyLinkedList);
			     System.out.println("The sorted vector is: "+ this.historyVector);
			     System.out.println("The sorted stack is: "+ this.historyStack);
			     
			     
			  // To sort a set you must first convert the set to a list 
			  // and then sort the list.
			  }
			
	 
	 
					   public void deleteHistory(int index) {
						   if(index>=0 && index<historyArrayList.size()) {
					     historyArrayList.remove(index);
					     historyLinkedList.remove(index);
					     historyVector.remove(index);
					     historyStack.remove(index);
					     System.out.println("After index deletion the array list is: "+ historyArrayList);
				         System.out.println("After index deletion the linked list is: "+ historyLinkedList);
				         System.out.println("After index deletion the vector is: "+ historyVector);
				         System.out.println("After index deletion the stack is: "+ historyStack);
						   } else {
							   System.out.println("Trying the delete the history using index: index out of bond");
						   }
					   
					   
					   System.out.println("<------------------------------->");
					   
					   // To remove an element from a set at a specific index, you must first convert the set to a list 
					   // and then remove the element at the specified index from the list or array.
					   
				  } 
	 
	 
				        
	 
	 
	  
			      public void deleteHistory(String url) {
			    	  
			    	  
			    	  for (int m=0;m<historyArrayList.size();m++) {
			    		  if (url.equals(historyArrayList.get(m))){
			    			  historyArrayList.remove(url);
			    		  }
			    	  }
			    	  
			    	  for (int m=0;m< historyLinkedList.size();m++) {
			    		  if (url.equals( historyLinkedList.get(m))){
			    			  historyLinkedList.remove(url);
			    		  }
			    	  }
			    	  
			    	  for (int m=0;m< historyVector.size();m++) {
			    		  if (url.equals( historyVector.get(m))){
			    			  historyVector.remove(url);
			    		  }
			    	  }
			    	  
			    	  for (int m=0;m<historyStack.size();m++) {
			    		  if (url.equals(historyStack.get(m))){
			    			  historyStack.remove(url);
			    		  }
			    	  }
			    	 
			      	   System.out.println("After url deletion the array list is: "+ historyArrayList);
				           System.out.println("After url deletion the linked list is: "+ historyLinkedList);
				           System.out.println("After url deletion the vector is: "+ historyVector);
				           System.out.println("After url deletion the stack is: "+ historyStack);
				            
				           System.out.println("<------------------------------->");
				        	   historyHashSet.remove(url);
				        	   historyLinkedHashSet.remove(url);
				        	   historySortedSet.remove(url);
				        	   System.out.println("After url deletion the hash set is: "+ historyHashSet);
					           System.out.println("After url deletion the linked hash set is: "+ historyLinkedHashSet);
					           System.out.println("After url deletion the sorted set is: "+ historySortedSet);
					           } 
			        
	
			 
			  public void fetchHistory() {
		      	System.out.println("<------------------------------->");
		         System.out.println("The current history is: "+ historyArrayList);
		         System.out.println("<------------------------------->");
		          
		      }
	
			  
			  
		        public void size() {
		        	    
		        	    System.out.println("The size of history array list: "  +historyArrayList.size());
		        	
		         }
		        
	  
		      public void search(String extension) {
		      	System.out.print("The history having desired extention: ");
		          for (String url : historyArrayList) {
		              if (url.endsWith(extension)) {
		                  System.out.println(url);
		              }
		          }
		      }
      
	 
	 
		     public void updateHistory(int index, String newUrl) {
		          historyArrayList.set(index, newUrl);
		          System.out.println("The updated history is: "+historyArrayList);
		   
		     } 
     
     
   
	 
	 
	 
	 
	 /*
	 
	       public void visit(String url) {
            	currentUrl = url;   		
            	 extentionUrlCom.add("www.facebook.com");
            	 extentionUrlCom.add("www.zoho.com");
            	 
            	 extentionUrlIn.add("www.inbuilt.in");
		    	 extentionUrlIn.add("www.farmer.in");
		    	 
		    	 extentionUrlOrg.add("www.family.org");
		    	 extentionUrlOrg.add("www.instabul.org");
		    	 
            	 
			     if (url.endsWith(".com")){
			    	 extentionUrlCom.add(url);
			    	 
			     } else if(url.endsWith(".in")) {
			    	 extentionUrlIn.add(url);
			    	 
			     } else if(url.endsWith(".org")) {
			    	 extentionUrlOrg.add(url);
			    	 
			     } 
	     
	     
	     
	     
	        	historyHashMap.put(".com", extentionUrlCom);
	        	historyHashMap.put(".in",extentionUrlIn);
	        	historyHashMap.put(".org", extentionUrlOrg);
	        	
	        	System.out.println("The complete history is: "+historyHashMap);
	        	
				}
	        
	        
	        	
	       public void deleteHistory(String url) {
	        	 if (url.endsWith(".com")){
			    	 extentionUrlCom.remove(url);
			    	
			     } else if(url.endsWith(".in")) {
			    	 extentionUrlIn.remove(url);
			    	
			     } else if(url.endsWith(".org")) {
			    	 extentionUrlOrg.remove(url);
			    	
			     } 
	        	 
	        	 
	        	    historyHashMap.put(".com", extentionUrlCom);
		        	historyHashMap.put(".in",extentionUrlIn);
		        	historyHashMap.put(".org", extentionUrlOrg);
		        	
		        	System.out.println("After deletion the current history is: "+ historyHashMap);
	        }
	        
	        
	        
	         
	        public void fetchHistory() {
	        	System.out.println("<------------------------------->");
	            System.out.println("The current map history is: "+historyHashMap);
	            
	        }
	        
	        
	      
	        
	        
	        
	        public void size() {
	        	    
	        	
	        	
	        	Iterator<Entry<String, List<String>>> iterator = historyHashMap.entrySet().iterator();
	        	
	        	while (iterator.hasNext()) {
	        		
	        	    Entry<String, List<String>> entry = iterator.next();
	        	    String key = entry.getKey();
	        	    List<String> value = entry.getValue();
	        	    System.out.println("The size of search history with " + key + " extension is: " + value.size());
	        	}
	        	
	         }
	        
	        
	        
	        
	        public void search(String searchWord) {
	        	
	        	System.out.print("The history of which have given word desired: ");
	        	Iterator<Entry<String, List<String>>> iterator = historyHashMap.entrySet().iterator();
	        	
	        	while (iterator.hasNext()) {
	        		
	        	    Entry<String, List<String>> entry = iterator.next();
	        	    String key = entry.getKey();
	        	    List<String> value = entry.getValue();
	        	  
	        	for (int i = 0; i < value.size(); i++) {
	        		
	        		if (value.get(i).contains(searchWord)){
	        	    System.out.println(value.get(i));
	        	    
	        	    j++;
	        		} 
	        	
	        	}
	        }
	        	if (j==0) {
	        		System.out.println("No such url is present in history map" + j);
	        	}
	       }
	          
	       */
	        
	    public static void main(String [] args) {
	    	String url;
	    	
	    	System.out.print("Enter Homepage url: ");
	    	Scanner input = new Scanner(System.in);
	    	url = input.nextLine();
	    	
	    	System.out.print("enter the index to delete: ");
	    	int index = Integer.parseInt(input.nextLine());
	    	
	    	
	    	System.out.print("enter the url to delete: ");
	    	String urlDelete = input.nextLine();
	    	
	    	System.out.print("enter the extention to search: ");
	    	String extention = input.nextLine();
	    	
	    	System.out.print("enter the index at update: ");
	    	int indexUpdate = Integer.parseInt(input.nextLine());
	    	
	    	System.out.print("enter the new url to update: ");
	    	String newUrl = input.nextLine();
	    	
	    	BrowserHistory browserHistory = new BrowserHistory();
	    	browserHistory.visit(url);
	    	browserHistory.sort();
	    	
	    	browserHistory.deleteHistory(index);
	    	browserHistory.deleteHistory(urlDelete);
	    	browserHistory.fetchHistory();
            browserHistory.search(extention);
            browserHistory.size();
            browserHistory.updateHistory(indexUpdate, newUrl);
	    	
	    	
	    	/*
	    	BrowserHistory browserHistory = new BrowserHistory ();
	    	
	    	System.out.print("enter url to visit: ");
	    	Scanner input = new Scanner(System.in);
	    	url = input.nextLine();
	    	
	    	browserHistory.visit(url);
	    	
	    	System.out.print("enter the url to delete: ");
	    	String urlDelete = input.nextLine();
	    	
	    	System.out.print("enter the word to search in url: ");
	    	String searchWord = input.nextLine();
	    	
	    	
	    	
	    	
	    	browserHistory.deleteHistory(urlDelete);
	    	browserHistory.fetchHistory();
	    	browserHistory.size();
	    	browserHistory.search(searchWord);
	    	*/
	    }

}
