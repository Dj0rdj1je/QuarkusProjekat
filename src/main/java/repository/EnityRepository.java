package repository;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import model.EntityExample;

@Dependent
public class EnityRepository {

	@Inject
	private EntityManager em;

	@Transactional
	public EntityExample createEntity(EntityExample e) {

		return em.merge(e);
	}
	
	
}
