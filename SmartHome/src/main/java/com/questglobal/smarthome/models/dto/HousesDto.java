package com.questglobal.smarthome.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class HousesDto {
    public String name;
    public ArrayList<ObjectId> rooms;
    public ArrayList<ObjectId> device;

}
