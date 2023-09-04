package logAnalyzer;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

public class LogAnalyzerNegTest {
	@Test
	void
	testIsValidLogFileName1() 
	{
		IExtensionManager manager = EasyMock.createMock(IExtensionManager.class);
		LogAnalyzer logAnalyzer   = new LogAnalyzer(manager);
		assertThrows(IllegalArgumentException.class, 
				() -> logAnalyzer.IsValidLogFileName(null));
	}
	
	@Test
	void
	testIsValidLogFileName2() 
	{
		IExtensionManager manager = EasyMock.createMock(IExtensionManager.class);
		LogAnalyzer logAnalyzer   = new LogAnalyzer(manager);
		assertThrows(IllegalArgumentException.class, 
				() -> logAnalyzer.IsValidLogFileName(new String()));
	}
	
	@Test
	void
	testIsValidLogFileName3() 
	{
		IExtensionManager manager = EasyMock.createMock(IExtensionManager.class);
		LogAnalyzer logAnalyzer   = new LogAnalyzer(manager);
		assertThrows(IllegalArgumentException.class, 
				() -> logAnalyzer.IsValidLogFileName("mytxt"));
	}
}
