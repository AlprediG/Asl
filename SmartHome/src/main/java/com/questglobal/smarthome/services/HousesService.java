package com.questglobal.smarthome.services;



import com.questglobal.smarthome.models.Houses;
import com.questglobal.smarthome.models.dto.HousesDto;
import com.questglobal.smarthome.repositories.HousesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class HousesService {
    private final HousesRepository housesRepository;
    @Autowired
    HousesService(HousesRepository housesRepository) {
        this.housesRepository = housesRepository;
    }

    public Houses getHousesById(String id) {

        return housesRepository.findHousesById(id);
    }
    
    public Optional<Houses> getHousesByName(String name){
        return housesRepository.findHousesByName(name);
    }
    public String insertNew(HousesDto dto){
        Optional<Houses> dbHouses = housesRepository.findHousesByName(dto.name);
        if (dbHouses.isPresent()) {
            throw new IllegalStateException("Name already exists");
        }
        Houses houses = new Houses(dto.name,dto.rooms,dto.device);
        ArrayList<ObjectId> rooms = new ArrayList<>();
        rooms.add(new ObjectId("637cb085be36767eae89c268"));
        rooms.add(new ObjectId("637cb085be36767eae89c269"));
        rooms.add(new ObjectId("637cb085be36767eae89c26a"));
        houses.setName(dto.name);
        houses.setRooms(dto.rooms);
        housesRepository.save(houses);
        return houses.getId().toHexString();
    }

    public Boolean delete(String id) {
        Houses dbHouses = housesRepository.findHousesById(id);
        if (dbHouses == null) {
            throw new IllegalStateException(" House with id " + id + " does not exist ");
        }
        housesRepository.deleteById(id);
        return true;
    }

    public Boolean update(String id , HousesDto dto) {
        Houses dbHouses = housesRepository.findHousesById(id);
        if (dbHouses == null) {
            insertNew(dto);
        } else {
            if (!dto.name.isBlank()) dbHouses.setName(dto.name);

            housesRepository.save(dbHouses);
        }
        return true;
    }


}

