package resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.EntityExample;
import repository.EnityRepository;

@Path("/Entity/")
public class EntityResource {

	@Inject
	private EnityRepository enityRepository;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("createEntity")
	public Response createEntity(EntityExample e) {
		EntityExample example = enityRepository.createEntity(e);
		return Response.ok().entity(example).build();
	}
	
}
