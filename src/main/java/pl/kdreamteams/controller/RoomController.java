package pl.kdreamteams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.kdreamteams.json.Message;
import pl.kdreamteams.json.TeacherNameRequest;
import pl.kdreamteams.service.RoomService;

import javax.sql.DataSource;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/findRoom", method = RequestMethod.POST)
    public Message findEmployeeRoom(@RequestBody TeacherNameRequest teacherName) {
        return roomService.getEmployeesWithRoomForSurname(teacherName.getTeacherName());
    }
}
