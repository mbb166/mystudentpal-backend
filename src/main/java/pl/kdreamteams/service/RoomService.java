package pl.kdreamteams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kdreamteams.json.Message;
import pl.kdreamteams.model.Employee;
import pl.kdreamteams.repository.RoomRepository;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepsitory;

    public Message getEmployeesWithRoomForSurname(String surname) {
        Message message = new Message();
        Employee employee = roomRepsitory.getEmployeesWithRooms(surname);

        String response = "You can find " + surname + " in " + employee.getRoom().getNumber() + " room";

        message.setMessage(response);

        return message;
    }


}
