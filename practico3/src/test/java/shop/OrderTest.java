package shop;

import static org.junit.jupiter.api.Assertions.*;
import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;


public class OrderTest {

		
	@Test 
	public void saveOrderAndVerifyExpectationsUsingMock() {
	    IShopDataAccess dataAccess = createMock(IShopDataAccess.class);

	    Order o = new Order(6, dataAccess);
	  
	    // Especificar comportamiento esperado
	    dataAccess.save(6, o);  
	    
	    // Crear mock para el comportamiento anterior 
	    replay(dataAccess);
	    	    
	    o.save();
	    
	    // Verificar que se ejercita el comportamiento esperado 
	    verify(dataAccess);
	}
	

    //Write tests here

	
	
	
}
