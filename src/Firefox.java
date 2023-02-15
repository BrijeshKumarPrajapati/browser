import java.util.ArrayList;

public class Firefox extends Browser implements MultipleAccountContainers{
	private boolean isLocationAccessible;
    private boolean isCameraAccessible;
    private boolean isMicrophoneAccessible;
    

       public Firefox(ArrayList<String> history) {
    	   super(history);
       }
       
       @Override
  	 public void whoAmI(){
  		 	System.out.println("I am firefox");
  		}
       
     @Override
       public void addContainer() {
           
           System.out.println("This is add container:");
       }
     
    @Override
       public void leaveContainer() {
          
           System.out.println("This is leave container ");
       }
}

 interface MultipleAccountContainers{
	 
	 public abstract void addContainer();
	 public abstract void leaveContainer();
}