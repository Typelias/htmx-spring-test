package se.typelias.htmxtest.web.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Controller;
import se.typelias.htmxtest.web.pages.IndexKt;

@Controller
@Path("/")
public class IndexController {
    @Path("/")
    @GET
    public Response index() {
        return Response.ok(IndexKt.createIndexPage()).build();
    }
}
