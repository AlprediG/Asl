package com.questglobal.smarthome.repositories;


import com.questglobal.smarthome.models.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {
    Room findRoomById(String id);
    Optional<Room> findRoomByName(String Name);
}
