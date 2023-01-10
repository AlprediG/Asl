package com.questglobal.smarthome.controller;


import com.questglobal.smarthome.models.Houses;
import com.questglobal.smarthome.models.dto.HousesDto;
import com.questglobal.smarthome.services.HousesService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/houses")
public class HousesController {
    public final HousesService housesService;
    @Autowired
    public HousesController(HousesService housesService) {

        this.housesService = housesService;
    }
    @GetMapping(produces = {"application/json"})
    public Houses getHouses(String id){

        return housesService.getHousesById(id);
    }
    @PostMapping(produces = {"application/json"})
    public String registerNewHouses(@RequestBody HousesDto dto){

        return housesService.insertNew(dto);
    }
    @DeleteMapping(path = "{id}")
    public Boolean deleteHouses(@PathVariable("id") String id) {
        return housesService.delete(id);
    }
    @PutMapping(path = "{id}")
    public Boolean updateHouse(@PathVariable("id") String id, @RequestBody HousesDto request) {
        return housesService.update(id, request);
    }
}
