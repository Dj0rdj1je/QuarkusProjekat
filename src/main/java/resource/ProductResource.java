package resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Product;
import repository.ProductRepository;



@Path("/Product/")
public class ProductResource {

	
	@Inject
	private ProductRepository productRepository;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("createProduct")
	public Response createCart(Product p) {
		Product Product = productRepository.createProduct(p);
		return Response.ok().entity(Product).build();
	}
	
}
