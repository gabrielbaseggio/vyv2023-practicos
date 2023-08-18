package docs;

import java.util.ArrayList;
import java.util.List;

/**
 *This class represents document objects with their version history.
 */
public class Document {

	/**
	 * Documents name
	 */
	private String name;
	
	/**
	 * All versions of the current document
	 */
	private List<Version> versions; 
	
	/*
	 * Reference to the last version of current document
	 */
	private Version lastVersion;
	
	
	public Document(String name) {
        this.name = name;
        this.versions = new ArrayList<Version>();
        lastVersion = new Version(this);
        this.versions.add(lastVersion);
	}    
	
	/**
	 * 
	 * @param mod  modifier that indicates if the version to be 
	 * created is a version with minor, intermediate or major 
	 * changes with respect to the last version of current document.
	 * @return created new version
	 */
	public Version createNewVersion (Version.modifier mod) {
        Version newVersion = lastVersion.createNewVersion(mod);  
        this.versions.add(newVersion);  
        this.lastVersion = newVersion;
        return newVersion;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return number of version of this Document
	 */
	public int getNumberOfVersion() {
		return versions.size();
	}

    /**
     * 	
     * @return last version of this Document
     */
	public Version getLastVersion() {
		return lastVersion;
	}

	
	   
    
}
