package citi.fintech.model;

public class Applicant {
	private String firstName;
	private String lastName;
	private Address address;
	private Demographic demographics;
	private Email email;
	private Phone phone;
	public Demographic getDemographics() {
		return demographics;
	}
	public void setDemographics(Demographic demographics) {
		this.demographics = demographics;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public EmploymentDetail getEmploymentDetail() {
		return employmentDetail;
	}
	public void setEmploymentDetail(EmploymentDetail employmentDetail) {
		this.employmentDetail = employmentDetail;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	private EmploymentDetail employmentDetail;
	private Education education;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
