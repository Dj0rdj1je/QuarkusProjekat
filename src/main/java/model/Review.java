package model;

import java.util.List;

public class Review {

	private int reviewId;
	private String reviewText;
	private List<User> userId;
	private List<Item> itemId;
	
	public String getReviewText() {
		return reviewText;
	}
	
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
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
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewText=" + reviewText + ", userId=" + userId + ", itemId="
				+ itemId + "]";
	}
	
}
