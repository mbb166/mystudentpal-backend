package pl.kdreamteams.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MainConfiguration extends WebMvcConfigurerAdapter{

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        super.configureContentNegotiation(configurer);
        configurer.defaultContentType(MediaType.APPLICATION_JSON_UTF8);
    }

    @Bean
    public SessionFactory getSessionFactory() {
        return new org.hibernate.cfg.Configuration().buildSessionFactory();
    }
}
