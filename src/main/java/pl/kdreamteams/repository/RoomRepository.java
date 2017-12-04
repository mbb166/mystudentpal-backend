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
import java.util.HashSet;
import java.util.Set;

@Repository
public class RoomRepository {

    @Autowired
    private DataSource dataSource;

    private Employee mapResultSetToModel(ResultSet resultSet) throws SQLException {
        resultSet.next();
        Employee employee = new Employee();
        employee.setId(resultSet.getLong(1));
        employee.setName(resultSet.getString(2));
        employee.setSurname(resultSet.getString(3));
        employee.setBirthDate(resultSet.getDate(4));
        employee.setConsultationDate(resultSet.getDate(5));

        Room room = new Room();
        room.setId(resultSet.getLong(6));
        room.setNumber(resultSet.getLong(7));
        room.setBuilding(resultSet.getString(8));
        room.setLevel(resultSet.getLong(9));

        Set<Employee> employeeSet = new HashSet<Employee>();
        employeeSet.add(employee);
        room.setEmployess(employeeSet);

        employee.setRoom(room);

        return employee;
    }

    public Employee getEmployeesWithRooms(String employeeName){
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String sql = "select e.id, e.name, e.surname, e.birth_date, e.consultation_time, r.id, r.number, r.building, r.level " +
                "     from employees e join rooms r on e.id_room = r.id where e.surname like ?";

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employeeName);

            resultSet = preparedStatement.executeQuery();
            return mapResultSetToModel(resultSet);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
