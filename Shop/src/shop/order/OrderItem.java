package shop.order;

import java.math.BigDecimal;

import shop.cart.CartItem;
import shop.product.Product;
import shop.product.ProductManager;

public class OrderItem {
	private int productId;
	private String name;
	private int quantity;
	private BigDecimal price;
	private int vat;

	public OrderItem(int productId, String name, int quantity, BigDecimal price, int vat) {
		super();
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.vat = vat;
	}
	
	public OrderItem(Product product, CartItem cartItem) {
		super();
		this.productId = ProductManager.getInstance().resolveProductId(product);
		this.name = product.getName();
		this.quantity = cartItem.getQuantity();
		this.price = product.getPrice();
		this.vat = product.getVat();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

}
