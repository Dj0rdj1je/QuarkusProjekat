package repository;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import model.Product;

@Dependent
public class ProductRepository {

	@Inject
	private EntityManager em;

	@Transactional
	public Product createProduct(Product p) {
		return em.merge(p);
	}
	
	
}
