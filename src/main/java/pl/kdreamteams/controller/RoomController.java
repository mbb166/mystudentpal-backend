package pl.kdreamteams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pl.kdreamteams.json.Message;
import pl.kdreamteams.json.TeacherNameRequest;
import pl.kdreamteams.service.RoomService;

@RestController
@CrossOrigin
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/findRoom", method = RequestMethod.POST)
    public Message findEmployeeRoom(@RequestBody TeacherNameRequest teacherName) {
        return roomService.getEmployeesWithRoomForSurname(teacherName.getTeacherName());
    }
}
