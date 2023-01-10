package com.questglobal.smarthome.services;

import com.questglobal.smarthome.models.Device;
import com.questglobal.smarthome.models.dto.DeviceDto;
import com.questglobal.smarthome.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    @Autowired
    DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device GetById(String id) {
        return deviceRepository.findDeviceById(id);
    }

    public String InsertNew(DeviceDto dto) {
        Optional<Device> dbDevice = deviceRepository.findDeviceByName(dto.Name);
        if (dbDevice.isPresent()) {
            throw new IllegalStateException("name already exists");
        }
        Device device = new Device(dto.Name);
        deviceRepository.save(device);
        return device.getId().toHexString();
    }

    public Boolean Delete(String id) {
        Device dbDevice = deviceRepository.findDeviceById(id);
        if (dbDevice == null) {
            throw new IllegalStateException(" device with id " + id + " does not exist ");
        }
        deviceRepository.deleteById(id);
        return true;
    }

    public Boolean Update(String id, DeviceDto dto) {
        Device dbDevice = deviceRepository.findDeviceById(id);
        if (dbDevice == null) {
            InsertNew(dto);
        } else {
            if (!dto.Name.isBlank()) dbDevice.setName(dto.Name);
            if (dto.power1 != null & !dto.power1.isEmpty()) dbDevice.setPower1(dto.power1);
            if (dto.power2 != null & !dto.power2.isEmpty()) dbDevice.setPower2(dto.power2);
            if (dto.power == null) {
                dbDevice.setPower(dto.power);
            }
            deviceRepository.save(dbDevice);

        }
        return true;
    }


}
