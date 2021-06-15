package beans;

import java.util.Arrays;
import java.util.UUID;

import enums.RestorantStatus;


public class Resorant {
	
	private UUID id;
	private String name;
	private String restorantType;
	private RestorantStatus activeStatus;
	private Location location;
	private byte[] logo;
	private	User menager;
	
	

	public Resorant(String name, String restorantType, RestorantStatus activeStatus, Location location, byte[] logo,
			User menager) {
		super();
		this.id  =UUID.randomUUID();
		this.name = name;
		this.restorantType = restorantType;
		this.activeStatus = activeStatus;
		this.location = location;
		this.logo = logo;
		this.menager = menager;
	}

	public User getMenager() {
		return menager;
	}

	public void setMenager(User menager) {
		this.menager = menager;
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

	public String getRestorantType() {
		return restorantType;
	}

	public void setRestorantType(String restorantType) {
		this.restorantType = restorantType;
	}

	public RestorantStatus getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(RestorantStatus activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Resorant [id=" + id + ", name=" + name + ", restorantType=" + restorantType + ", activeStatus="
				+ activeStatus + ", location=" + location + ", logo=" + Arrays.toString(logo) + ", menager=" + menager
				+ "]";
	}


	
}
