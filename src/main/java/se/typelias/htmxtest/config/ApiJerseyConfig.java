package se.typelias.htmxtest.config;

import org.glassfish.jersey.server.ResourceConfig;
import se.typelias.htmxtest.api.CounterController;
import se.typelias.htmxtest.api.EchoController;
import se.typelias.htmxtest.filters.RequestLoggingFilter;

public class ApiJerseyConfig extends ResourceConfig {
    public ApiJerseyConfig() {
        register(EchoController.class);
        register(CounterController.class);
        register(RequestLoggingFilter.class);
    }
}
