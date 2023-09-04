package logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;


public class IPBlacklistTest {
	
    private IPBlacklist ipblacklist;
    private LoginService service;

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
    	String ip       = "192.186.0.236";
    	String user     = "sirgabriel";
    	String password = "12345";
    	String passwordHash = Utils.getPasswordHashMD5(password);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
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
    	String ip       = "192.186.0.236";
    	String user     = "sirgabriel";
    	String password = "12345";
    	String passwordHash = Utils.getPasswordHashMD5(password);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
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
    	String ip       = "192.186.0.236";
    	String user     = "sirgabriel";
    	String password = "12345";
    	String passwordHash = Utils.getPasswordHashMD5(password);
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
    	String ip       = "192.186.0.236";
    	String user     = "sirgabriel";
    	String password = "12345";
    	String passwordHash = Utils.getPasswordHashMD5(password);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
    	expect(service.login(ip, user, passwordHash)).andReturn(false);
    	replay(service);
    	ipblacklist.login(ip, user, password);
    	ipblacklist.login(ip, user, password);
    	ipblacklist.login(ip, user, password);
    	
    	assertTrue(ipblacklist.blacklisted(ip));
    	assertFalse(ipblacklist.login(ip, user, password));
    }
}
