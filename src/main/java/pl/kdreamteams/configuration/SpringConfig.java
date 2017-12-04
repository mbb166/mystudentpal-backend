package pl.kdreamteams.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@EnableWebMvc
@Configuration
//@ComponentScan({ "pl.kdreamteams.*" })
//@Import({ SecurityConfig.class })
public class SpringConfig {
    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/MyStudentPal");
        driverManagerDataSource.setUsername("postgres");
        driverManagerDataSource.setPassword("postgre");
        return driverManagerDataSource;
    }
}
