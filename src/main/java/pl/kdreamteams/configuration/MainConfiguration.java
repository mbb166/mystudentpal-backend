package pl.kdreamteams.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import pl.kdreamteams.model.*;

@Configuration
public class MainConfiguration extends WebMvcConfigurerAdapter{

    @Bean
    public SessionFactory getSessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .addAnnotatedClass(AssignationEntity.class)
                .addAnnotatedClass(EmployeesEntity.class)
                .addAnnotatedClass(GroupEntity.class)
                .addAnnotatedClass(RoleEntity.class)
                .addAnnotatedClass(RoomsEntity.class)
                .addAnnotatedClass(ScheduleEntity.class)
                .addAnnotatedClass(ScoresEntity.class)
                .addAnnotatedClass(SpecializationEntity.class)
                .addAnnotatedClass(StudentEntity.class)
                .addAnnotatedClass(SubjectsEntity.class)
                .addAnnotatedClass(UsersEntity.class)
                .buildSessionFactory();
    }
}
