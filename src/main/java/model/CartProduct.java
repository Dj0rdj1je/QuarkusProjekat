package model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart_product")
public class CartProduct {
		@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_product_seq")
	    private Long id;

		@ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "cart_id", nullable = false)
	    private Cart cart;

		@ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "product_id", nullable = false)
	    private Product product;
		
	    @Column(name = "quantity")
	    private int quantity;

	    @Column(name = "price_at_purchase")
	    private double priceAtPurchase;
	    
	    
	    
		public CartProduct() {
			super();
		}
		
		public CartProduct(Cart cart, Product product, int quantity, double priceAtPurchase) {
			super();
			this.cart = cart;
			this.product = product;
			this.quantity = quantity;
			this.priceAtPurchase = priceAtPurchase;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getPriceAtPurchase() {
			return priceAtPurchase;
		}

		public void setPriceAtPurchase(double priceAtPurchase) {
			this.priceAtPurchase = priceAtPurchase;
		}

}
