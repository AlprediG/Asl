package com.questglobal.smarthome.repositories;

import com.questglobal.smarthome.models.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DeviceRepository extends MongoRepository<Device, String> {
    Device findDeviceById(String id);
    Optional<Device> findDeviceByName(String Name);
}