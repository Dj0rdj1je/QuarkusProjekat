package repository;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import model.Cart;
import model.CartProduct;

@Dependent
public class CartRepository {

	@Inject
	private EntityManager em;

	@Transactional
	public Cart createCart(Cart c) {

		return em.merge(c);
	}
	
	@Transactional
	public CartProduct createCartProduct(CartProduct c) {

		return em.merge(c);
	}
	
}
