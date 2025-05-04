package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_seq")
	private Long id;
	@Column(nullable = false)
	private String review;
	@ManyToOne
	private AppUser user;
	@ManyToOne
	private Product product;
	
	public Review() {
		super();
	}

	public Review(String review, AppUser user, Product product) {
		super();
		this.review = review;
		this.user = user;
		this.product = product;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", review=" + review + ", user=" + user + ", product=" + product + "]";
	}
}
