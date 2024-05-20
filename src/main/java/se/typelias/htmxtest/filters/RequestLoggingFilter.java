package se.typelias.htmxtest.filters;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class RequestLoggingFilter implements ContainerRequestFilter, ContainerResponseFilter {

    private static final Logger LOG = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void filter(ContainerRequestContext requestContext) {
        String method = requestContext.getMethod();
        String path = requestContext.getUriInfo().getPath();
        if (path.isEmpty()) {
            path = "/";
        }
        LOG.info("Request: {} {}", method, path);
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        String method = requestContext.getMethod();
        String path = requestContext.getUriInfo().getPath();
        if (path.isEmpty()) {
            path = "/";
        }
        String body = "";
        if (responseContext.getEntity() != null && responseContext.getMediaType().equals(MediaType.APPLICATION_JSON_TYPE))
            body = responseContext.getEntity().toString();
        int status = responseContext.getStatus();
        LOG.info("Response: {} {} -> {} {}", method, path, status, body);
    }

}
