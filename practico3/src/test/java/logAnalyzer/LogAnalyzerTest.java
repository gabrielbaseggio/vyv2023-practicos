package logAnalyzer;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

public class LogAnalyzerTest {
	
	@Test
	void
	testIsValidLogFileName1() 
	{
		String fileName = "my.txt";
		IExtensionManager manager = EasyMock.createMock(IExtensionManager.class);
		expect(manager.IsValid(fileName)).andReturn(true);
		manager.SendLogError("too short name");
		replay(manager);
		LogAnalyzer logAnalyzer = new LogAnalyzer(manager);
		assertFalse(logAnalyzer.IsValidLogFileName(fileName));
		verify(manager);
	}
	
	@Test
	void
	testIsValidLogFileName2() 
	{
		String fileName = "mytxt.txt";
		IExtensionManager manager = EasyMock.createMock(IExtensionManager.class);
		expect(manager.IsValid(fileName)).andReturn(true);
		replay(manager);
		LogAnalyzer logAnalyzer = new LogAnalyzer(manager);
		assertTrue(logAnalyzer.IsValidLogFileName(fileName));
		verify(manager);
	}
	
	@Test
	void
	testIsValidLogFileName3() 
	{
		String fileName = "mytxt.exe";
		IExtensionManager manager = EasyMock.createMock(IExtensionManager.class);
		expect(manager.IsValid(fileName)).andReturn(false);
		replay(manager);
		LogAnalyzer logAnalyzer = new LogAnalyzer(manager);
		assertFalse(logAnalyzer.IsValidLogFileName(fileName));
		verify(manager);
	}
}
