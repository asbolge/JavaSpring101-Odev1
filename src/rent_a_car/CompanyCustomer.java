package rent_a_car;

public class CompanyCustomer extends Customer {

	private String companyName;
	private String taxNumber;
	
	public CompanyCustomer(String companyName,String taxNumber, long id,String phoneNumber) {
		super();
		this.companyName = companyName;
		this.taxNumber = taxNumber;
		setName(companyName);
		setId(id);
		setPhoneNumber(phoneNumber);
	}
	
	
	public String getName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}
