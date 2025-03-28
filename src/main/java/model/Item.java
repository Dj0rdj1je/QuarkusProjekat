package model;

import java.util.List;

public class Item {

	private int itemId;
	private String name;
	private double price;
	private int stockQuantity;
	private List<Category> categoryId;
	private List<Cart> cartId;
	
	public Item(String name, double price, int stockQuantity) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.categoryId = categoryId;
		this.cartId = cartId;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public List<Category> getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(List<Category> categoryId) {
		this.categoryId = categoryId;
	}
	public List<Cart> getCartId() {
		return cartId;
	}
	public void setCartId(List<Cart> cartId) {
		this.cartId = cartId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + ", stockQuantity=" + stockQuantity
				+ ", categoryId=" + categoryId + ", cartId=" + cartId + "]";
	}
	
	
}