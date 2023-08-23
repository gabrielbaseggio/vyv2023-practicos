package docs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class VersionTest {
	private  Document doc1 = null;
	
	@BeforeEach
	public  void setUp() {
	
		//It Always creates version 1.0.0
	    doc1 = new Document("doc1");
				
		Version firstVersion = doc1.getLastVersion();
		//Create 2.1.1 version
		Version newVersion1 = doc1.createNewVersion(Version.modifier.MAJOR);
		Version newVersion2 = doc1.createNewVersion(Version.modifier.INTERMEDIATE);
		Version newVersion3 = doc1.createNewVersion(Version.modifier.MINOR);
		
	}
	
	//TODO
	//write your tests here
	
	@Test
	public void nameDoesNotChange() 
	{
		assertEquals("doc1", doc1.getName());
	}
}
