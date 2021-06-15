package beans;

import java.util.UUID;

public class Comment {
	
	private UUID id;
	private User customer;
	private Resorant restorant;
	private String text;
	private int mark;
	public Comment(User customer, Resorant restorant, String text, int mark) {
		super();
		this.customer = customer;
		this.restorant = restorant;
		this.text = text;
		this.mark = mark;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Resorant getRestorant() {
		return restorant;
	}
	public void setRestorant(Resorant restorant) {
		this.restorant = restorant;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", customer=" + customer + ", restorant=" + restorant + ", text=" + text
				+ ", mark=" + mark + "]";
	}
	
	
	

}
