package logging;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FailedIPLoggerTest {
	private FailedIPLogger logger;
    private LoginService service;

    @BeforeEach
    public  void setUp() {
         logger = new FailedIPLogger();
         service = createMock(LoginService.class);
         logger.setService(service);
    }
    
    @Test
    void
    loginFailed() 
    {
    	String ip       = "192.186.0.236";
    	String user     = "sirgabriel";
    	String password = "12345";
    	String passwordHash = Utils.getPasswordHashMD5(password);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
    	replay(service);
    	
    	logger.login(ip, user, password);
    	assertTrue(logger.loginFailed(ip));
    	
    	verify(service);
    }
}
