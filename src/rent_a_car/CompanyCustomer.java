package rent_a_car;

public class CompanyCustomer extends Customer {

	private String companyName;
	private String taxNumber;
		
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
