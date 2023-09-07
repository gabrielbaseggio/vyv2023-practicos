package logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;


public class IPBlacklistTest {
	
    private IPBlacklist ipblacklist;
    private LoginService service;
    private String ip       = "192.186.0.236";
	private String user     = "sirgabriel";
	private String password = "12345";
	private String passwordHash = Utils.getPasswordHashMD5(password);

    @BeforeEach
    public  void setUp() {
         ipblacklist = new IPBlacklist();
         service = createMock(LoginService.class);
         ipblacklist.setService(service);
    }
 
    //Write tests here
    @Test
    void
    ipWasAddedToTheBlacklist() 
    {
    	expect(service.login(ip, user, passwordHash)).andReturn(false).times(3);
    	replay(service);
    	
    	assertFalse(ipblacklist.login(ip, user, password));
    	assertFalse(ipblacklist.login(ip, user, password));
    	assertFalse(ipblacklist.login(ip, user, password));
    	assertTrue(ipblacklist.blacklisted(ip));
    	
    	verify(service);
    }
    
    @Test
    void
    ipHasNotBeenAddedToTheBlackListYet() 
    {
    	expect(service.login(ip, user, passwordHash)).andReturn(false).times(2);
    	replay(service);
    	
    	assertFalse(ipblacklist.login(ip, user, password));
    	assertFalse(ipblacklist.login(ip, user, password));
    	assertFalse(ipblacklist.blacklisted(ip));
    	
    	verify(service);
    }
    
    @Test
    void
    testGetLastip() 
    {
    	expect(service.login(ip, user, passwordHash)).andReturn(true);
    	replay(service);
    	ipblacklist.login(ip, user, password);
    	assertEquals(ip, ipblacklist.getLastip());
    	verify(service);
    }
    
    @Test
    void
    loginAfterTheIPWasAddedToTheBlackList() 
    {
    	expect(service.login(ip, user, passwordHash)).andReturn(false).times(3);
    	replay(service);
    	ipblacklist.login(ip, user, password);
    	ipblacklist.login(ip, user, password);
    	ipblacklist.login(ip, user, password);
    	
    	assertTrue(ipblacklist.blacklisted(ip));
    	assertFalse(ipblacklist.login(ip, user, password));
    }
}
