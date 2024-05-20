package se.typelias.htmxtest.web.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Controller;
import se.typelias.htmxtest.web.pages.CounterPageKt;

@Controller
@Path("/counter")
public class CounterPageController {
    @Path("/")
    @GET
    public Response counter() {
        return Response.ok(CounterPageKt.createCounterPage()).build();
    }
}
