package com.questglobal.smarthome.repositories;


import com.questglobal.smarthome.models.DeviceTypes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeviceTypesRepository extends MongoRepository<DeviceTypes, String> {
    Optional<DeviceTypes> findDeviceByName(String Name);

    DeviceTypes findDeviceById(ObjectId id);

}
