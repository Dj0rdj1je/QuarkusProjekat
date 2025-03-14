package model;

import java.util.List;


public class Cart {
	
	private int cartId;
	private int quantity;
	private List<User> userId;
	private List<Item> itemId;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public List<User> getUserId() {
		return userId;
	}
	public void setUserId(List<User> userId) {
		this.userId = userId;
	}
	public List<Item> getItemId() {
		return itemId;
	}
	public void setItemId(List<Item> itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", itemId=" + itemId + ", quantity=" + quantity + "]";
	}
	
}
