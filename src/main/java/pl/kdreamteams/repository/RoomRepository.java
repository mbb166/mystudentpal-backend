package pl.kdreamteams.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void getRooms(){

    }

}
