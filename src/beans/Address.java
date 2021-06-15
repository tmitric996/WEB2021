package beans;

import java.util.UUID;

public class Address {

	private UUID id;
	private String street;
	private String number;
	private String city;
	private String zipCode;
	
	public Address(String street, String number, String city, String zipCode) {
		super();
		this.id = UUID.randomUUID();
		this.street = street;
		this.number = number;
		this.city = city;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
		this.id =UUID.randomUUID();
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address: " + street + " " + number + ", " + city + " " + zipCode + "";
	}
	
}
