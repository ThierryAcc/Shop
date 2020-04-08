package shop.order;

import shop.account.CustomerAddress;

public class OrderAddress {
	private String street;
	private String zip;
	private String place;
	private String country;

	public OrderAddress(String street, String zip, String place, String country) {
		super();
		this.street = street;
		this.zip = zip;
		this.place = place;
		this.country = country;
	}
	
	public OrderAddress(CustomerAddress ca) {
		super();
		this.street = ca.getStreet();
		this.zip = ca.getZip();
		this.place = ca.getPlace();
		this.country = ca.getCountry();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
