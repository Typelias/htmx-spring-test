package se.typelias.htmxtest.config;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfiguration {

    @Bean
    public ServletRegistrationBean apiServletRegistration() {
        ServletRegistrationBean<ServletContainer> registrationBean = new ServletRegistrationBean<>(
                new ServletContainer(new ApiJerseyConfig()), "/api/*"
        );
        registrationBean.setName("ApiServlet");
        return registrationBean;
    }

    @Bean
    public ServletRegistrationBean webServletRegistration() {
        ServletRegistrationBean<ServletContainer> registrationBean = new ServletRegistrationBean<>(
                new ServletContainer(new WebJerseyConfig()), "/*"
        );
        registrationBean.setName("WebServlet");
        return registrationBean;
    }
}
