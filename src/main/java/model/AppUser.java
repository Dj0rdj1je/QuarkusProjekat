package model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user")
@NamedQueries({
	@NamedQuery(name = AppUser.GET_ALL_USERS, query = "Select u from AppUser u"),
	
})
public class AppUser {

	public static final String GET_ALL_USERS = "AppUser.getAllUsers";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	private Long id;

	@Column(nullable = false)
	private String username;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "social_number", nullable = false)
	private String socialNumber;
	
	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;
	
	@ManyToOne
	private Role role;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private Set<Review> reviews;
	
	public AppUser() {
		super();
	}

	public AppUser(String username, String firstName, String lastName, String socialNumber, String email,
			String password, Role role, Set<Review> reviews) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialNumber = socialNumber;
		this.email = email;
		this.password = password;
		this.role = role;
		this.reviews = reviews;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	public String getSocialNumber() {
		return socialNumber;
	}

	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AppUser [id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", socialNumber=" + socialNumber + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", orderProduct=" +", reviews=" + reviews + "]";
	}
}
