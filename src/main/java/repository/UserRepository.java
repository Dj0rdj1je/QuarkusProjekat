package repository;

import java.util.HashSet;
import java.util.List;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import model.AppUser;
import model.Review;

@Dependent
public class UserRepository {

	@Inject
	private EntityManager em;
	
	@Transactional
	public AppUser createUser(AppUser u) {
		return em.merge(u);
	}
	
	@Transactional
	public List<AppUser> getAllUsers() {
		List<AppUser> users = em.createNamedQuery(AppUser.GET_ALL_USERS, AppUser.class).getResultList();

		for (AppUser user : users) {
			List<Review> reviews = em.createNamedQuery(Review.GET_REVIEWS_FOR_USER, Review.class)
					.setParameter("id", user.getId()).getResultList();

			user.setReviews(new HashSet<>(reviews));
		}

		return users;	

	}
}
