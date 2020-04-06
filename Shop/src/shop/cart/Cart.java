package shop.cart;

import java.time.LocalDateTime;
import java.util.Arrays;

import shop.account.Account;
import shop.product.Product;

public class Cart {
	private LocalDateTime created;
	private Account createdBy;
	private CartItem[] cartItems = new CartItem[0];

	public Cart(LocalDateTime created, Account createdBy) {
		super();
		this.created = created;
		this.createdBy = createdBy;
	}
	
	public void addCartItem(int quantity, Product product) {
		cartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
		cartItems[cartItems.length - 1] = new CartItem(quantity, product);
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public Account getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy;
	}

	public CartItem[] getCartItems() {
		return cartItems;
	}

	public void setCartItems(CartItem[] cartItems) {
		this.cartItems = cartItems;
	}

}
