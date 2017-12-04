package pl.kdreamteams.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.kdreamteams.model.Employee;
import pl.kdreamteams.model.Room;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ConsultationRepository {
    @Autowired
    private DataSource dataSource;

    public Employee getConsultation(String employeeName){
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String sql = "select e.start_consultation_time, e.end_consultation_time, consultation_day, r.number " +
                "     from employees e join rooms r on e.id_room = r.id where e.surname = ?";

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employeeName);

            resultSet = preparedStatement.executeQuery();
            resultSet.next();

            Employee employee = new Employee();
            employee.setStartConsultationDate(resultSet.getTime(1));
            employee.setEndConsultationDate(resultSet.getTime(2));
            employee.setConsultationDay(resultSet.getString(3));
            Room room = new Room();
            room.setNumber(resultSet.getLong(4));
            employee.setRoom(room);
            return employee;//mapRowsetToModel(resultSet);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
