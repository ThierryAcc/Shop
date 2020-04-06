package shop.product;

import java.util.Arrays;

public class ProductManager {
	Product[] products = new Product[0];

	private static ProductManager instance;

	public static ProductManager getInstance() {
		if (instance == null) {
			instance = new ProductManager();
		}
		return instance;
	}

	public void addProduct(Product product) {
		products = Arrays.copyOf(products, products.length + 1);
		products[products.length - 1] = product;
	}

	public int resolveProductId(Product product) {
		for (int i = 0; i < products.length; i++) {
			if (products[i].equals(product)) {
				return i;
			}
		}
		return -1;
	}

	public Product resolveProduct(int productId) {
		return products[productId];
	}

	public Product[] getProducts() {
		return products;
	}

}
