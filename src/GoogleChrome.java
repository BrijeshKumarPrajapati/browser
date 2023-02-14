import java.util.ArrayList;

public class GoogleChrome extends Browser{
	 final float versionNumber;
	private boolean isLocationAccessible;
    private boolean isCameraAccessible;
    private boolean isMicroponeAccessible;
       
	public GoogleChrome (ArrayList<String> history, float versionNumber){
			
		super(history);
		this.versionNumber = versionNumber;
		
	}
	
	
	
	@Override
	 public void whoAmI(){
		 	System.out.println("I am a google chrome");
		}
	
	
	   public void setLocationAccessible(boolean access) {
	        this.isLocationAccessible = access;
	    }

	    public void setCameraAccessible(boolean access) {
	        this.isCameraAccessible = access;
	    }

	    public void setMicroponeAccessible(boolean access) {
	        this.isMicroponeAccessible = access;
	    }
	
	    
	    /*
	    public void setAllPermissions(boolean location, boolean camera, boolean microphone) {
        this.isLocationAccessible = location;
        this.isCameraAccessible = camera;
        this.isMicrophoneAccessible = microphone;
    }
	     */
	
	    public float getVersionNumber() {
	        return versionNumber;
	    }
	
}
