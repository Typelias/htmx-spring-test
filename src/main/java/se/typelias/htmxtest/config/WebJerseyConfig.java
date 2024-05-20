package se.typelias.htmxtest.config;

import org.glassfish.jersey.server.ResourceConfig;
import se.typelias.htmxtest.filters.RequestLoggingFilter;
import se.typelias.htmxtest.web.controllers.CounterPageController;
import se.typelias.htmxtest.web.controllers.IndexController;

public class WebJerseyConfig extends ResourceConfig {
    public WebJerseyConfig() {
        register(IndexController.class);
        register(CounterPageController.class);
        register(RequestLoggingFilter.class);
    }
}