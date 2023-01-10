package com.questglobal.smarthome.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@Data
@Document("Rooms")
public class Room {
    @Id
    @Field("_id")
    private ObjectId id;
    @Field("HouseId")
    private ObjectId houseId;
    @Field("Name")
    private String name;

    public Room(ObjectId houseId, String name) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
    }
}
