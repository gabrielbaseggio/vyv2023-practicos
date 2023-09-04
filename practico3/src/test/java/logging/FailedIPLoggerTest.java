package logging;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FailedIPLoggerTest {
	private FailedIPLogger logger;
    private LoginService service;
    private String ip       = "192.186.0.236";
	private String user     = "sirgabriel";
	private String password = "12345";
	private String passwordHash = Utils.getPasswordHashMD5(password);

    @BeforeEach
    public  void setUp() {
         logger = new FailedIPLogger();
         service = createMock(LoginService.class);
         logger.setService(service);
    }
    
    private static Stream<Arguments>
    provider() 
    {
    	return Stream.of(
    			 Arguments.of("192.186.0.236", "sirgabriel", "12345", true, false)
    			,Arguments.of("192.186.0.236", "sirgabriel", "12345", false, true)
    			);
    }
    
    @ParameterizedTest
    @MethodSource("provider")
    void
    testLogin(String ip, String user, String password, boolean expForMock, boolean expForAssert) 
    {
    	String passwordHash = Utils.getPasswordHashMD5(password);
    	expect(service.login(ip, user, passwordHash)).andReturn(expForMock);
    	replay(service);
    	
    	logger.login(ip, user, password);
    	assertEquals(expForAssert, logger.loginFailed(ip));
    	
    	verify(service);
    }
}
