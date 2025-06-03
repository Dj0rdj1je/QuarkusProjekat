package resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Cart;
import model.CartProduct;
import repository.CartRepository;

@Path("/cart/")
public class CartResource {

	@Inject
	private CartRepository cartRepository;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("createCart")
	public Response createCart(Cart c) {
		Cart cart = cartRepository.createCart(c);
		return Response.ok().entity(cart).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("createCartProduct")
	public Response getTime(CartProduct c) {

		CartProduct cartProduct = cartRepository.createCartProduct(c);

		return Response.ok().entity(cartProduct).build();
	}

}
