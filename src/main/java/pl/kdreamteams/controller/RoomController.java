package pl.kdreamteams.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.kdreamteams.json.Message;

@RestController
@RequestMapping("/findRoom")
public class RoomController {
    @RequestMapping(method = RequestMethod.POST)
    public Message findEmployeeRoom(@RequestBody String teacherName) {
        Message message = new Message();
        message.setMessage("das");
        return message;
    }
}
