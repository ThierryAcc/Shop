package shop.account;

public class Account {
	private String loginName;
	private String password;
	private Customer customer;

	public Account(String loginName, String password, Customer customer) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.customer = customer;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
