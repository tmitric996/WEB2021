package beans;

import java.util.List;
import java.util.UUID;

public class Cart {
	
	private UUID id;
	private List<CartItem> cartItem;
	private UUID customerId;
	private double price;
	public Cart(List<CartItem> cartItem, UUID customerId, double price) {
		super();
		this.id = UUID.randomUUID();
		this.cartItem = cartItem;
		this.customerId = customerId;
		this.price = price;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public List<CartItem> getCartItem() {
		return cartItem;
	}
	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}
	public UUID getCustomerId() {
		return customerId;
	}
	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", cartItem=" + cartItem + ", customerId=" + customerId + ", price=" + price + "]";
	}
	
	
}
