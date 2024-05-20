package se.typelias.htmxtest.api;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Controller;
import se.typelias.htmxtest.web.pages.components.CounterKt;


@Controller
@Path("counter")
public class CounterController {

    @QueryParam("counterValue")
    private int counterValue = 0;

    @POST
    @Path("increment")
    @Produces(MediaType.TEXT_HTML)
    public Response incrementCounter() {
        counterValue++;
        return Response.ok(CounterKt.counter(counterValue).toString()).build();
    }

    @POST
    @Path("decrement")
    @Produces(MediaType.TEXT_HTML)
    public Response decrementCounter() {
        counterValue--;
        return Response.ok(CounterKt.counter(counterValue).toString()).build();
    }
}
