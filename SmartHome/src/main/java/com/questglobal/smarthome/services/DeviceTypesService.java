package com.questglobal.smarthome.services;

import com.questglobal.smarthome.models.DeviceTypes;
import com.questglobal.smarthome.models.dto.DeviceTypeDto;
import com.questglobal.smarthome.repositories.DeviceTypesRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceTypesService {

    public final DeviceTypesRepository deviceTypesRepository;

    public DeviceTypesService(DeviceTypesRepository deviceTypesRepository) {
        this.deviceTypesRepository = deviceTypesRepository;
    }
    public DeviceTypes getById(ObjectId id){

        return deviceTypesRepository.findDeviceById(id);
    }
    public List<DeviceTypes> getAll(Long id){

        return deviceTypesRepository.findAll();
    }

    public String InsertNew(DeviceTypeDto dto){
        Optional<DeviceTypes> dbDeviceTypes = deviceTypesRepository.findDeviceByName(dto.Name);
        if(dbDeviceTypes.isPresent()){
            throw new IllegalStateException(("Name already exists"));
        }
        DeviceTypes deviceTypes = new DeviceTypes(dto.Name,dto.DeviceHexName,dto.Topics);
        deviceTypesRepository.save(deviceTypes);
        return deviceTypes.getId().toHexString();
    }
    public Boolean Delete(ObjectId id) {
        DeviceTypes dbDeviceTypes = getById(id);
        if (dbDeviceTypes == null) {
            throw new IllegalStateException(" device with id " + id + " does not exist ");
        }
        deviceTypesRepository.delete(dbDeviceTypes);
        return true;
    }

    public Boolean Update(ObjectId id, DeviceTypeDto dto) {
        DeviceTypes dbDeviceTypes = getById(id);
        if (dbDeviceTypes == null) {
            InsertNew(dto);
        } else {
            if (!dto.Name.isBlank()) dbDeviceTypes.setName(dto.Name);
            if (!dto.DeviceHexName.isBlank()) dbDeviceTypes.setDeviceHexName(dto.DeviceHexName);
            if (dto.Topics != null & !dto.Topics.isEmpty()) dbDeviceTypes.setMqttTopics(dto.Topics);

            deviceTypesRepository.save(dbDeviceTypes);
        }
            return true;
        }
    }
