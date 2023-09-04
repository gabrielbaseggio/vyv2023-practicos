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
}
