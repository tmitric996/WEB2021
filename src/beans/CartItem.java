package beans;

import java.util.UUID;

public class CartItem {
	
	private UUID id;
	private Product product;
	private int amount;
	public CartItem(Product product, int amount) {
		super();
		this.product = product;
		this.amount = amount;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
