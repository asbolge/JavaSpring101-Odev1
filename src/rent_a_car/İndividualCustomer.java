package rent_a_car;

public class İndividualCustomer extends Customer {

	private String firstName;
	private String lastName;
	private String nationalIdentity;

	public İndividualCustomer(String firstName, String lastName, long id,String phoneNumber,String nationalIdentity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		setName(firstName + " "+ lastName);
		setId(id);
		setPhoneNumber(phoneNumber);
	}
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
