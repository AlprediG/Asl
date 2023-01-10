package com.questglobal.smarthome.controller;

import com.questglobal.smarthome.models.Device;
import com.questglobal.smarthome.models.dto.DeviceDto;
import com.questglobal.smarthome.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/devices")
public class DeviceController {
    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping(produces = {"application/json"})
    public Device GetDevice(String id) {
        return deviceService.GetById(id);
    }

    @PostMapping(produces = {"application/json"})
    public String RegisterNewDevice(@RequestBody DeviceDto dto) {
        return deviceService.InsertNew(dto);
    }

    @DeleteMapping(path = "{id}")
    public Boolean DeleteDevice(@PathVariable("id") String id) {
        return deviceService.Delete(id);
    }

    @PutMapping(path = "{id}")
    public Boolean UpdateDevice(@PathVariable("id") String id, @RequestBody DeviceDto request) {
        return deviceService.Update(id, request);
    }
}