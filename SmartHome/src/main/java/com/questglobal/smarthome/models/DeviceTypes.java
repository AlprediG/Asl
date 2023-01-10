package com.questglobal.smarthome.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Document("DeviceTypes")
public class DeviceTypes {
    @Id
    @Field("_id")
    private ObjectId id;
    @Field("DeviceHexName")
    private String DeviceHexName;
    @Field("Name")
    private String name;
    @Field("mqttTopics")
    private ArrayList<String> mqttTopics;

    public DeviceTypes(String name, String DeviceHexName, ArrayList<String> mqttTopics) {
        this.id = new ObjectId();
        this.name = name;
        this.DeviceHexName = DeviceHexName;
        this.mqttTopics = mqttTopics;
    }

    public ArrayList<String> getMqttTopics() {
        return mqttTopics;
    }

    public void setMqttTopics(ArrayList<String> mqttTopics) {
        this.mqttTopics = mqttTopics;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceHexName() {
        return DeviceHexName;
    }

    public void setDeviceHexName(String deviceHexName) {
        this.DeviceHexName = deviceHexName;
    }

    @Override
    public String toString() {
        return "DeviceType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deviceHexName='" + DeviceHexName + '\'' +
                ", mqttTopics=" + mqttTopics +
                '}';
    }
}

