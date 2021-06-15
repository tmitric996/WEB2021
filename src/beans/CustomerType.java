package beans;

import enums.TypeOfCustomer;

public class CustomerType {
	
	private TypeOfCustomer typeName;
	private int discount;
	private int pointsNeeded;
	
	public CustomerType() {
		super();
		this.typeName = null;
		this.discount = 0;
		this.pointsNeeded = 0;
		
	}
	public CustomerType(TypeOfCustomer typeName, int discount, int pointsNeeded) {
		super();
		this.typeName = typeName;
		this.discount = discount;
		this.pointsNeeded = pointsNeeded;
	}
	public TypeOfCustomer getTypeName() {
		return typeName;
	}
	public void setTypeName(TypeOfCustomer typeName) {
		this.typeName = typeName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getPointsNeeded() {
		return pointsNeeded;
	}
	public void setPointsNeeded(int pointsNeeded) {
		this.pointsNeeded = pointsNeeded;
	}
	@Override
	public String toString() {
		return "CustomerType [typeName=" + typeName + ", discount=" + discount + ", pointsNeeded=" + pointsNeeded + "]";
	}
	
}
