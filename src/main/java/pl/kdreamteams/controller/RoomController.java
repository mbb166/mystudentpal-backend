package pl.kdreamteams.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.kdreamteams.json.Message;
import pl.kdreamteams.json.TeacherNameRequest;

@RestController
@RequestMapping("/room")
public class RoomController {

    private

    @RequestMapping(value = "/findRoom", method = RequestMethod.POST)
    public Message findEmployeeRoom(@RequestBody TeacherNameRequest teacherName) {
        Message message = new Message();
        message.setMessage(teacherName.getTeacherName());
        return message;
    }
}
