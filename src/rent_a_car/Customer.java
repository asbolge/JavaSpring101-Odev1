package rent_a_car;

public abstract class Customer {
	
	private String name;
	private long id;
	private String phoneNumber;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	
	
}
