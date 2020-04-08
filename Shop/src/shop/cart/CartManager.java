package shop.cart;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

import shop.account.Account;
import shop.account.BankPaymentMethod;
import shop.account.Customer;
import shop.account.CustomerAddress;
import shop.order.Order;
import shop.order.OrderAddress;
import shop.order.OrderItem;
import shop.product.Product;
import shop.product.ProductManager;

public class CartManager {
	private Cart cart;

	public void create(Account account) {
		LocalDateTime now = LocalDateTime.now();
		this.cart = new Cart(now, account);
	}

	public void addItem(int quantity, Product product)  {
		  if(this.cart!= null) { 
			  	CartItem[] cartItems = cart.getCartItems(); 
			  	cartItems =	Arrays.copyOf(cart.getCartItems(), cart.getCartItems().length+1);
			  	cartItems[cartItems.length-1] = new CartItem(quantity, product);
			  	cart.setCartItems(cartItems);
		  }
	}

	public void removeItem(Product product) {
		if (cart != null) {
			CartItem[] cartItems = cart.getCartItems();
			for (int i = 0; i < cartItems.length; i++) {
				if (cartItems[i].getProduct().equals(product)) {
					cartItems[i] = cartItems[cartItems.length - 1];
					cartItems = Arrays.copyOf(cart.getCartItems(), cart.getCartItems().length - 1);
					cart.setCartItems(cartItems);
				}
			}
		}
	}

	public Order checkout() {

		String orderNumber = UUID.randomUUID().toString();
		LocalDateTime now = LocalDateTime.now();

		CustomerAddress ca = this.cart.getCreatedBy().getCustomer().getAddress();
		OrderAddress shippedTo = new OrderAddress(ca.getStreet(), ca.getZip(), ca.getPlace(), ca.getCountry());
		Date paid = new Date();
		BankPaymentMethod paidWith = this.cart.getCreatedBy().getCustomer().getPaymentMethod();

		CartItem[] cartItems = this.cart.getCartItems();
		OrderItem[] items = new OrderItem[cartItems.length];
		for (int i = 0; i < cartItems.length; i++) {
			Product product = cartItems[i].getProduct();
			int productId = ProductManager.getInstance().resolveProductId(product);
			String name = cartItems[i].getProduct().getName();
			int quantity = cartItems[i].getQuantity();
			BigDecimal price = product.getPrice();
			int vat = product.getVat();
			items[i] = new OrderItem(productId, name, quantity, price, vat);
		}

		Order order = new Order(orderNumber, now, shippedTo, paid, paidWith, items);

		return order;
	}
	
	// HÖHERER GRAD DER KOPPLUNG
	public Order checkout2() {

		String orderNumber = UUID.randomUUID().toString();
		LocalDateTime shippedTime = LocalDateTime.now();
		Date paid = new Date();

		Customer customer = this.cart.getCreatedBy().getCustomer();
		OrderAddress shippedTo = new OrderAddress(customer.getAddress());
		BankPaymentMethod paidWith = customer.getPaymentMethod();

		CartItem[] cartItems = this.cart.getCartItems();
		OrderItem[] items = new OrderItem[cartItems.length];
		
		// neuer OrderItem-Konstruktor
		for (int i = 0; i < cartItems.length; i++) {
			Product product = cartItems[i].getProduct();
			items[i] = new OrderItem(product, cartItems[i]);
		}

		Order order = new Order(orderNumber, shippedTime, shippedTo, paid, paidWith, items);

		return order;
	}
	
}
