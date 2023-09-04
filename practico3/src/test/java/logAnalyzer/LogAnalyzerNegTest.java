package logAnalyzer;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LogAnalyzerNegTest {
	
	private static Stream<String>
	provider() 
	{
		return Stream.of(
				 null
				,new String()
				,"mytxt"
				);
	}
	
	@ParameterizedTest
	@MethodSource("provider")
	void
	testIsValidLogFileName(String fileName) 
	{
		IExtensionManager manager = EasyMock.createMock(IExtensionManager.class);
		LogAnalyzer logAnalyzer   = new LogAnalyzer(manager);
		assertThrows(IllegalArgumentException.class, 
				() -> logAnalyzer.IsValidLogFileName(fileName));
	}
}
