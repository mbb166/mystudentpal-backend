package pl.kdreamteams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kdreamteams.json.SchedulePosition;
import pl.kdreamteams.model.DayName;
import pl.kdreamteams.model.Schedule;
import pl.kdreamteams.repository.PlanForDayRepository;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ScheduleService {
    @Autowired
    private PlanForDayRepository planForDayRepository;

    private void incrementDate(Date date) {
        date.setDate(date.getDate()+1);
    }

    private void decrementDate(Date date) {
        date.setDate(date.getDate() -1);
    }

    private void setDateIncrement(Date date, int val) {
        date.setDate(date.getDate() + val);
    }

    private Timestamp getTimestampFromDate(DateFormat dateFormat, Date date) {
        return  Timestamp.valueOf(dateFormat.format(date));
    }

    private Map<String,List<SchedulePosition>> checkDayNameFromDate(String groupName) {
        Date actualDate = new Date();

        DateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);

        Map<String, List<SchedulePosition>> days = new HashMap<String, List<SchedulePosition>>();

        String dayName = dateFormat.format(actualDate);
        if (dayName.equals(DayName.MONDAY.getDayName())) {
            //Monday
            List<Schedule> mondaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);

            days.put("Monday", mapScheduleToSchedulePosition(mondaySchedule));
            //Tuesday
            incrementDate(actualDate);
            List<Schedule> thuesdatSchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);

            days.put("Tuesday", mapScheduleToSchedulePosition(thuesdatSchedule));
            //Wednesday
            incrementDate(actualDate);

            List<Schedule> wednesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);

            days.put("Wednesday",  mapScheduleToSchedulePosition(wednesdaySchedule));

            //Thursday
            incrementDate(actualDate);

            List<Schedule> thursdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);

            days.put("Thursday",  mapScheduleToSchedulePosition(thursdaySchedule));
            //Friday
            incrementDate(actualDate);

            List<Schedule> fridaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);

        } else if (dayName.equals(DayName.TUESDAY.getDayName())) {
            //Tuesday

            List<Schedule> tuesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Tuesday",  mapScheduleToSchedulePosition(tuesdaySchedule));

            //Monday
            decrementDate(actualDate);

            List<Schedule> mondaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Monday",  mapScheduleToSchedulePosition(mondaySchedule));
            //Wednesday
            setDateIncrement(actualDate, 2);

            List<Schedule> wednesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Wednesday",  mapScheduleToSchedulePosition(wednesdaySchedule));
            //Thursday
            incrementDate(actualDate);

            List<Schedule> thursdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Thursday",  mapScheduleToSchedulePosition(thursdaySchedule));
            //Friday
            incrementDate(actualDate);

            List<Schedule> fridaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Friday",  mapScheduleToSchedulePosition(fridaySchedule));
        } else if (dayName.equals(DayName.WEDNESDAY.getDayName())) {
            //Wednesday

            List<Schedule> wednesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Wednesday",  mapScheduleToSchedulePosition(wednesdaySchedule));
            //Monday
            setDateIncrement(actualDate, -2);

            List<Schedule> mondaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Monday",  mapScheduleToSchedulePosition(mondaySchedule));
            //Tuesday
            incrementDate(actualDate);

            List<Schedule> tuesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Tuesday",  mapScheduleToSchedulePosition(tuesdaySchedule));
            //Thursday
            setDateIncrement(actualDate, 2);

            List<Schedule> thursdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Thursday",  mapScheduleToSchedulePosition(thursdaySchedule));
            //Friday
            incrementDate(actualDate);

            List<Schedule> fridaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Friday",  mapScheduleToSchedulePosition(fridaySchedule));
        } else if (dayName.equals(DayName.THURSDAY.getDayName())) {
            //Thursday

            List<Schedule> thursdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Thursday",  mapScheduleToSchedulePosition(thursdaySchedule));
            //Monday
            setDateIncrement(actualDate, -3);

            List<Schedule> mondaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Monday",  mapScheduleToSchedulePosition(mondaySchedule));
            //Tuesday
            incrementDate(actualDate);

            List<Schedule> tuesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Tuesday",  mapScheduleToSchedulePosition(tuesdaySchedule));
            //Wednesday
            incrementDate(actualDate);

            List<Schedule> wednesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Wednesday",  mapScheduleToSchedulePosition(wednesdaySchedule));
            //Friday
            setDateIncrement(actualDate, 2);

            List<Schedule> fridaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Friday",  mapScheduleToSchedulePosition(fridaySchedule));
        } else if (dayName.equals(DayName.FRIDAY.getDayName())) {
            //Friday

            List<Schedule> fridaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Friday",  mapScheduleToSchedulePosition(fridaySchedule));
            //Monday
            setDateIncrement(actualDate, -4);

            List<Schedule> mondaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Monday",  mapScheduleToSchedulePosition(mondaySchedule));
            //Tuesday
            incrementDate(actualDate);

            List<Schedule> tuesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Tuesday",  mapScheduleToSchedulePosition(tuesdaySchedule));
            //Wednesday
            incrementDate(actualDate);

            List<Schedule> wednesdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Wednesday",  mapScheduleToSchedulePosition(wednesdaySchedule));
            //Thursday
            incrementDate(actualDate);

            List<Schedule> thursdaySchedule = planForDayRepository
                    .getScheduleForDay(actualDate, groupName);
            days.put("Thursday",  mapScheduleToSchedulePosition(thursdaySchedule));
        }

        return days;
    }

    private List<SchedulePosition> mapScheduleToSchedulePosition(List<Schedule> schedule) {
        ListIterator<Schedule> scheduleListIterator = schedule.listIterator();
        List<SchedulePosition> schedulePositions = new LinkedList<SchedulePosition>();
        DateFormat dateFormat = new SimpleDateFormat("hh:MM");

        while(scheduleListIterator.hasNext()) {
            Schedule schedule1 = scheduleListIterator.next();
            SchedulePosition schedulePosition = new SchedulePosition();
            schedulePosition.setName(schedule1.getSubject().getName());
            schedulePosition.setDataStart(dateFormat.format(schedule1.getDateStart()));
            schedulePosition.setDataEnd(dateFormat.format(schedule1.getDateEnd()));
            schedulePosition.setDescription(schedule1.getSubject().getDescription());
            schedulePositions.add(schedulePosition);
        }
        return schedulePositions;
    }

    public pl.kdreamteams.json.Schedule findScheduleByGroupName(String groupName) {
        pl.kdreamteams.json.Schedule schedulee = new pl.kdreamteams.json.Schedule();
        schedulee.setMessage("here is your awesome schedule, ");
        schedulee.setSchedule(checkDayNameFromDate(groupName));

        return schedulee;
    }
}
