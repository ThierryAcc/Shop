package shop.account;

public class Customer {
	private int id;
	private CustomerAddress address;
	private String email;
	private BankPaymentMethod paymentMethod;

	public Customer(int id, CustomerAddress address, String email, BankPaymentMethod paymentMethod) {
		super();
		this.id = id;
		this.address = address;
		this.email = email;
		this.paymentMethod = paymentMethod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BankPaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(BankPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	

}
