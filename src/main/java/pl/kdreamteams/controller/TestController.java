package pl.kdreamteams.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.kdreamteams.json.Message;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    public Message test() {
        Message message = new Message();
        message.setMessage("das");
        return message;
    }
}
