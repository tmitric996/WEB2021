package beans;

import java.util.Date;

import java.util.UUID;

import enums.Gender;
import enums.Role;
public class User {
	
	private UUID id;
	private String username;
	private String password;
	private String name;
	private String surName;
	private Gender gender;
	private Date dateOfBirth;
	private Role role;
	private UUID restorantId; //id restorana ako je user menager
	private int points; //broj bodova ako je user kupac
	private CustomerType customerType; //tip kupca ako je kupac
	
	public User( String username, String password, String name, String surName, Gender gender, Date dateOfBirth, Role role,
			UUID restorantId, int points, CustomerType customerType) {
		super();
		this.id  =UUID.randomUUID();
		this.username = username;
		this.name = name;
		this.password = password;
		this.surName = surName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.restorantId = restorantId;
		this.points = points;
		this.customerType = customerType;
	}
	public User() {
		super();
		this.id = UUID.randomUUID();
		this.username = "";
		this.password = "";
		this.name = "";
		this.surName = "";
		this.gender = null;
		this.dateOfBirth = null;
		this.role = null;
		this.restorantId = null;
		this.points = 0;
		this.customerType = null;

	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public UUID getRestorantId() {
		return restorantId;
	}
	public void setRestorantId(UUID restorantId) {
		this.restorantId = restorantId;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", surName="
				+ surName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", role=" + role + ", restorantId="
				+ restorantId + ", points=" + points + ", customerType=" + customerType + "]";
	}
	
	
}
