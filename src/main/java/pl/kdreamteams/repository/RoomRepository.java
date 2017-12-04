package pl.kdreamteams.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class RoomRepository {

    @Autowired
    private DriverManagerDataSource dataSource;

    public void getRooms(){

    }

}
