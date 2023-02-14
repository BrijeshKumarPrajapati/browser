import java.util.ArrayList;

public class Firefox extends Browser implements MultipleAccountContainers{
	private boolean isLocationAccessible;
    private boolean isCameraAccessible;
    private boolean isMicrophoneAccessible;
    
    
       public Firefox(ArrayList<String> history) {
    	   super(history);
       }
       
       public void whoAmI(){
   		System.out.println("I am firefox");
   	}
       
     
       public void addContainer() {
           
           System.out.println("This is add container:");
       }

       public void leaveContainer() {
          
           System.out.println("This is leave container ");
       }
}

 interface MultipleAccountContainers{
	 
	 public void addContainer();
	 public void leaveContainer();
}