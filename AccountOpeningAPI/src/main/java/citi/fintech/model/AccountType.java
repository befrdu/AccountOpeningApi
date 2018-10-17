package citi.fintech.model;

public class AccountType {
	private String name;
	private int id;
	public AccountType(String name, int id){
		this.name=name;
		this.id=id;
	}
	public AccountType(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
