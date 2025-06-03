package resource;

import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.AppUser;
import model.client.CountryClient;
import model.client.HolidayClient;
import repository.UserRepository;
import restClient.DateClient;

@Path("/user/")
public class UserResource {

	@Inject
	private UserRepository userRepository;
	
	@RestClient
	private DateClient dateClient;
	
	@ConfigProperty(name = "greeting.message") 
	String message;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("addUser")
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
	
	@GET
	@Path("getCountries")
	public Response getCountries() {
		List<CountryClient> country = dateClient.getAvailableCountries();
		return Response.ok().entity(country).build();
	}
	
	@GET
	@Path("NextPublicHolidays/{countryCode}")
	public Response getHolidaysById(@QueryParam(value = "countryCode")String countryCode) {
		List<HolidayClient> holidays = dateClient.getNextPublicHolidays(countryCode);
		return Response.ok().entity(holidays).build();
	}
	
}
