import java.util.ArrayList;

public class GoogleChrome extends Browser{
	final String versionNumber="1.0" ;
	private boolean isLocationAccessible;
    private boolean isCameraAccessible;
    private boolean isMicroponeAccessible;
       
	public GoogleChrome (ArrayList<String> history){
			
		super(history);
		//this.versionNumber = "4.0";
	}
	
	
	
	@Override
	 public void whoAmI(){
		 	System.out.println("I am a google chrome");
		}
	
	    
	    
	 	public void setPermission(boolean location) {
	 		this.isLocationAccessible = location;
	     }
	
	
	    public void setPermission(boolean location, boolean camera, boolean micropone) {
	    	this.isLocationAccessible = location;
	    	this.isCameraAccessible = camera;
	    	this.isMicroponeAccessible = micropone;
           }
	   
	
	    public String getVersionNumber() {
	        return versionNumber;
	    }
	
}
