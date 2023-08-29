package shop;

public class OrderLine {
	private int id;
	private int quantity;
	private Order owner;

	public OrderLine(Order owner, int id, int q) {
		if (owner == null)
            throw new IllegalArgumentException("owner");
		this.owner = owner;
		this.quantity = q;
		this.id = id;
	} 

	public double getTotal() {
		double unitPrice = 
				owner.getDataAccess().getProductPrice(id);
		double total = unitPrice * quantity;
		return total;    	
	}
}
