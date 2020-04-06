package shop.product;

import java.util.Arrays;
import java.util.UUID;

public class Product {
	private String uuid;
	private String name;
	private double price;
	private int vat;
	private ProductProperty[] properties = new ProductProperty[0];
	
	public Product(String name, double price, int vat) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.name = name;
		this.price = price;
		this.vat = vat;
	}

	public void addProperty(String name, String value) {
		properties = Arrays.copyOf(properties, properties.length + 1);
		properties[properties.length - 1] = new ProductProperty(name, value);
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public ProductProperty[] getProperties() {
		return properties;
	}

	public void setProperties(ProductProperty[] properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Product [uuid=" + uuid + ", name=" + name + ", price=" + price + ", vat=" + vat + ", properties="
				+ Arrays.toString(properties) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}		
	
}
