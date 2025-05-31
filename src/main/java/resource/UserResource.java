package resource;

import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.AppUser;
import repository.UserRepository;

@Path("/user/")
public class UserResource {

	@Inject
	private UserRepository userRepository;
	
	
	@ConfigProperty(name = "greeting.message") 
	String message;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addUser")
	public Response createUser(AppUser user) {
		AppUser u = userRepository.createUser(user);
		return Response.ok().entity(u).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAllUsers")
	public Response getAllStudents() {
		List<AppUser> users = userRepository.getAllUsers();

		return Response.ok().entity(users).build();
	}
}
