package model;

public class Supplier {
	
	String name;
	String address;
	String email;
	String pnumber;
	String products ;
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(String name, String address, String email, String pnumber, String products) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.pnumber = pnumber;
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}
	
	
	

}
