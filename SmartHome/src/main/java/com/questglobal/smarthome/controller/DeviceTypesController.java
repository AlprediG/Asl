package com.questglobal.smarthome.controller;

import com.questglobal.smarthome.models.DeviceTypes;
import com.questglobal.smarthome.models.dto.DeviceTypeDto;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;
import com.questglobal.smarthome.services.DeviceTypesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/devicetypes")
public class DeviceTypesController {
    public final DeviceTypesService deviceTypesService;

    public DeviceTypesController(DeviceTypesService deviceTypesService) {
        this.deviceTypesService = deviceTypesService;
    }


    @GetMapping
    public DeviceTypes getById(String id){

        return deviceTypesService.getById(new ObjectId(id));
    }

    @PostMapping
    public String RegisterNewDeviceType(@RequestBody DeviceTypeDto dto){

        return deviceTypesService.InsertNew(dto);
    }

    @DeleteMapping(path = "{id}")
    public Boolean DeleteDeviceType(@PathVariable("id") String id) {
        return deviceTypesService.Delete(new ObjectId(id));
    }
    @PutMapping(path = "{id}")
    public Boolean UpdateDeviceType(@PathVariable("id") String id, @RequestBody DeviceTypeDto request) {
        return deviceTypesService.Update(new ObjectId(id), request);
    }

}
