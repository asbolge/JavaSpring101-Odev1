package rent_a_car;

public class İndividualCustomer extends Customer {

//	public İndividualCustomer(String firstName, String lastName, String nationalIdentity) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.nationalIdentity = nationalIdentity;
//	}
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	
	public String getName() {
		return firstName +" "+ lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}
