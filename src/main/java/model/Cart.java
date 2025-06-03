package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_seq")
	private Long id;
	@Column
	private double sum;
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CartProduct> cartProducts;
	
	public Cart() {
		super();
	}

	public Cart(double sum, List<CartProduct> cartProducts) {
		super();
		this.sum = sum;
		this.cartProducts = cartProducts;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	} 
	
	public List<CartProduct> getCartProducts() {
	    return cartProducts;
	}

	public void setCartProducts(List<CartProduct> cartProducts) {
	    this.cartProducts = cartProducts;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", sum=" + sum + ", cartProducts=" + cartProducts + "]";
	}
}
