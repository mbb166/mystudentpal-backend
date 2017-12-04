package pl.kdreamteams.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.kdreamteams.model.Employee;
import pl.kdreamteams.model.Room;
import pl.kdreamteams.model.Schedule;
import pl.kdreamteams.model.Subject;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class PlanForDayRepository {

    @Autowired
    private DataSource dataSource;

    public List<Schedule> getScheduleForDay(Date date, String groupName){
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String sql = "select s.data_start, s.data_end, su.name" +
                "     from (schedule s join \"group\" g on s.id_group = g.id) join subjects su on s.id_subject = su.id where g.name = ? and s.data_start::DATE = ? ORDER  BY  s.data_start;";

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, groupName);
            preparedStatement.setDate(2,new java.sql.Date(date.getTime()));

            resultSet = preparedStatement.executeQuery();
            List<Schedule> schedules = new ArrayList<Schedule>();
            while(resultSet.next()){
                Schedule schedule = new Schedule();
                schedule.setDateStart(resultSet.getTimestamp(1));
                schedule.setDateEnd(resultSet.getTimestamp(2));
                schedule.setSubject(new Subject());
                schedule.getSubject().setName(resultSet.getString(3));
                schedules.add(schedule);
            }

            return schedules;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
