package pl.kdreamteams.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Repository
public class RoomRepository {

    @Autowired
    private DataSource dataSource;

   

    public void getEmployeesWithRooms(){
        Connection connection;

        try {
            connection = dataSource.getConnection();
        } catch (SQLException ex) {

        }
    }

}
