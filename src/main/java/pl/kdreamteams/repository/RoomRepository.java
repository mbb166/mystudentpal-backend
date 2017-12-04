package pl.kdreamteams.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.kdreamteams.model.Employee;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class RoomRepository {

    @Autowired
    private DataSource dataSource;

    private Employee mapResultSetToModel(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getLong(1));
        employee.setName(resultSet.getString(2));
        employee.setSurname(resultSet.getString(3));
        //employee.


        do {

        } while (resultSet.next());

        return null;
    }

    public Employee getEmployeesWithRooms(String employeeName){
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String sql = "select e.id, e.name, e.surname, e.birth_date, e.consultation_time, r.id, r.number, r.building, r.level " +
                "     from employees e join rooms r on e.id_room = r.id where e.surname = ?";

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employeeName);
            resultSet = preparedStatement.getResultSet();
            return null;//mapRowsetToModel(resultSet);
        } catch (SQLException ex) {

        }
        return null;
    }

}
