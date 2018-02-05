package co.uk.cirquare.test.webapi.routes;

import io.swagger.annotations.*;
import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.uk.cirquare.test.webapi.pojos.*;

/**
 * Root resource (exposed at "resource" path)
 */
@Path("user")
@Api(value = "/user", description = "Resource")
@Produces(MediaType.APPLICATION_JSON)
public class UserService {
	// logger
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "application/json" media type.
	 *
	 * @return Response that will be returned as a application/json response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Retrieves user given its username", notes = "Retrieves user object from db, given unique user name", response = Response.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Got it"),
			@ApiResponse(code = 500, message = "Server is down!") })

	public Response get() {

		return Response.status(Response.Status.OK).entity("Hello World").build();
	}

}
