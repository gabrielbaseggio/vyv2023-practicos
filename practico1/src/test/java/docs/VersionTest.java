package docs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class VersionTest {
	private  Document doc = null;
	
	@BeforeEach
	public  void setUp() {
	    doc = new Document("doc");
		
	}
	
	//TODO
	//write your tests here
	
	@Test
	public void nameDoesNotChange() 
	{
		assertEquals("doc", doc.getName());
	}
	
	@Test
	public void numberOfVersion1() 
	{
		Version version = doc.getLastVersion();
		assertEquals(1, version.getMajor());
		assertEquals(0, version.getIntermediate());
		assertEquals(0, version.getMinor());
	}
	
	@Test
	public void numberOfVersion2() 
	{
		Version version = doc.getLastVersion();
		version = version.createNewVersion(Version.modifier.MAJOR);
		version = version.createNewVersion(Version.modifier.INTERMEDIATE);
		version = version.createNewVersion(Version.modifier.MINOR);
		assertEquals(2, version.getMajor());
		assertEquals(1, version.getIntermediate());
		assertEquals(1, version.getMinor());
	}
	
	@Test
	public void numberOfVersion3() 
	{
		Version version = doc.getLastVersion();
		version = version.createNewVersion(Version.modifier.MAJOR);
		version = version.createNewVersion(Version.modifier.INTERMEDIATE);
		version = version.createNewVersion(Version.modifier.MAJOR);
		assertEquals(3, version.getMajor());
		assertEquals(0, version.getIntermediate());
		assertEquals(0, version.getMinor());
	}
}
