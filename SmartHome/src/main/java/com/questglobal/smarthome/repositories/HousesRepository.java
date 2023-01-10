package com.questglobal.smarthome.repositories;


import com.questglobal.smarthome.models.Houses;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HousesRepository extends MongoRepository<Houses,String> {
    Optional<Houses> findHousesByName(String Name);

    Houses findHousesById(String id);

}

