package com.questglobal.smarthome.models.dto;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.questglobal.smarthome.Serializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;

@AllArgsConstructor
@Data
public class RoomDto {
    @JsonSerialize(using = Serializer.class)
    public String name;
    @JsonSerialize(using = Serializer.class)
    public ObjectId houseId;
}
