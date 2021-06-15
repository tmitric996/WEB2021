package beans;

import java.security.Timestamp;

import enums.OrderStatus;
import enums.RestorantStatus;

public class Order {
	
	private Long id;
	private Cart cart;
	private Resorant restorant;
	private Timestamp dateAndTipe;
	private double price;
	private User customer;
	private OrderStatus status;
	private User deliverer;
	public Order(Cart cart, Resorant restorant, Timestamp dateAndTipe, double price, User customer, OrderStatus status,
			User deliverer) {
		super();
		this.cart = cart;
		this.restorant = restorant;
		this.dateAndTipe = dateAndTipe;
		this.price = price;
		this.customer = customer;
		this.status = status;
		this.deliverer = deliverer;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Resorant getRestorant() {
		return restorant;
	}
	public void setRestorant(Resorant restorant) {
		this.restorant = restorant;
	}
	public Timestamp getDateAndTipe() {
		return dateAndTipe;
	}
	public void setDateAndTipe(Timestamp dateAndTipe) {
		this.dateAndTipe = dateAndTipe;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public User getDeliverer() {
		return deliverer;
	}
	public void setDeliverer(User deliverer) {
		this.deliverer = deliverer;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", cart=" + cart + ", restorant=" + restorant + ", dateAndTipe=" + dateAndTipe
				+ ", price=" + price + ", customer=" + customer + ", status=" + status + ", deliverer=" + deliverer
				+ "]";
	}
	
	
	
}
