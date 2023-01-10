package com.questglobal.smarthome.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@Document("Houses")
public class Houses {
    @Id
    @Field("_id")
    private ObjectId id;
    @Field("Name")
    private String name;
    @Field("Rooms")
    private ArrayList<ObjectId> rooms;
    @Field("Device")
    private ArrayList<ObjectId> device;

    public Houses(String name, ArrayList<ObjectId> rooms, ArrayList<ObjectId> device) {
        this.id = new ObjectId();
        this.name = name;
        this.rooms = rooms;
        this.device = device;
    }

}
