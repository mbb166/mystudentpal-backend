package pl.kdreamteams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kdreamteams.repository.RoomRepository;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepsitory;


}
