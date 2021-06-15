package beans;

import java.util.Arrays;
import java.util.UUID;

import enums.ProductType;

public class Product {
	
	private UUID id;
	private String name;
	private double price;
	private ProductType productType;
	private UUID restorantId;
	private String amount;
	private String description;
	private byte[] picture;
	public Product(String name, double price, ProductType productType, UUID restorantId, String amount,
			String description, byte[] picture) {
		super();
		this.id  =UUID.randomUUID();
		this.name = name;
		this.price = price;
		this.productType = productType;
		this.restorantId = restorantId;
		this.amount = amount;
		this.description = description;
		this.picture = picture;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public UUID getRestorantId() {
		return restorantId;
	}
	public void setRestorantId(UUID restorantId) {
		this.restorantId = restorantId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", productType=" + productType
				+ ", restorantId=" + restorantId + ", amount=" + amount + ", description=" + description + ", picture="
				+ Arrays.toString(picture) + "]";
	}
	

}
