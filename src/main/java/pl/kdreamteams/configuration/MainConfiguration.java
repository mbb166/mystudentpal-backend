package pl.kdreamteams.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MainConfiguration extends WebMvcConfigurerAdapter{

    public SessionFactory getSessionFactory() {
        return new org.hibernate.cfg.Configuration().buildSessionFactory();
    }
}
