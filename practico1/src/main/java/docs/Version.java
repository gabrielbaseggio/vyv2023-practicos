package docs;


/*
 * This class defines versions of an artifact, 
 * using the classical version notation. examples 1.0.0, 1.1.0, 2.0.0
 * */

public class Version {

	/*
	 * parts that make up a version

	 */
	private int minor; 
	private int intermediate; 
	private int major;
	
	/*
	 * Reference to the document to which this version belongs
	 * */
	private Document owner; 
	
	
	Version(Document owner) {
		 this.minor = 0;
		 this.intermediate = 0;
		 this.major = 1;
		 this.owner = owner;
	}

	
	private Version (Document owner, int major, int intermediate, int minor) {
		 this.minor = minor;
		 this.intermediate = intermediate;
		 this.major = major;
		 this.owner = owner;
	}
	
	public int getMinor() {
		return minor;
	}

	public int getIntermediate() {
		return intermediate;
	}

	public int getMajor() {
		return major;
	}
	
	public enum modifier {
	    MAJOR, INTERMEDIATE, MINOR;
	}
	
	/**
	 * @param modVersion modifier that indicates if the version to be 
	 * created is a version with minor, intermediate or major 
	 * changes, with respect to the current version.
	 * @return the created new version.
	 */
    public Version createNewVersion (modifier modVersion) {
    	Version newVersion = null;
    
    	switch (modVersion) {
        case MINOR:
        	newVersion = new Version(this.owner, this.getMajor(), this.getIntermediate(), this.getMinor() + 1);
            break;
                
        case INTERMEDIATE:
        	newVersion = new Version(this.owner, this.getMajor(), this.getIntermediate() + 1, 0);
            break;
                     
        case MAJOR:
        	newVersion = new Version(this.owner, this.getMajor() + 1, 0, 0);
            break;
    	
        
    	}
    	return newVersion;
    }	
    
    
    

}
