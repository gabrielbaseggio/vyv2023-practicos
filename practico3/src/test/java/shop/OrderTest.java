package shop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
	
	@Test
	void
	testAdd() 
	{
		IShopDataAccess dataAccess = createMock(IShopDataAccess.class);
		expect(dataAccess.getProductPrice(0)).andReturn(10.0);
		replay(dataAccess);
		Order order = new Order(0, dataAccess);
		order.add(new OrderLine(order, 0, 2));
		assertEquals(20, order.getLines().get(0).getTotal());
		verify(dataAccess);
	}
	
	@Test
	void
	testRemove() 
	{
		IShopDataAccess dataAccess = createMock(IShopDataAccess.class);
		Order order = new Order(0, dataAccess);
		OrderLine orderLine = new OrderLine(order, 0, 2); 
		order.add(orderLine);
		order.remove(orderLine);
		List<OrderLine> orderLines = order.getLines();
		assertEquals(0, orderLines.size());
	}
}
