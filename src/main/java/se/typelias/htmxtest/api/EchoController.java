package se.typelias.htmxtest.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Controller;

@Controller
@Path("echo")
public class EchoController {
    @GET
    @Path("{text}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echo(@PathParam("text") String text) {
        return Response.ok(text).build();
    }
}
