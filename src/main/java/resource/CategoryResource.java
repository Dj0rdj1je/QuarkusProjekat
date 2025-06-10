package resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Category;
import repository.CategoryRepository;

@Path("/category/")
public class CategoryResource {

	@Inject
	private CategoryRepository categoryRepository;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("createCategory")
	public Response createCart(Category c) {
		Category category = categoryRepository.createCategory(c);
		return Response.ok().entity(category).build();
	}
	
}
