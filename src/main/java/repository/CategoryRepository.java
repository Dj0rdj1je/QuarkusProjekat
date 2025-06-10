package repository;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import model.Category;

@Dependent
public class CategoryRepository {

	@Inject
	private EntityManager em;
	
	@Transactional
	public Category createCategory(Category c) {
		return em.merge(c);
	}
	
}
