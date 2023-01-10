package com.questglobal.smarthome.models.dto;

import java.util.ArrayList;
import java.util.Date;

public class DeviceDto {
        public String Name;
        public String HexId;
        public Integer power;
        public String device;
        public Integer ct;
        public Integer dimmer;
        public String modelId;
        public String manufacturer;
        public boolean reachable;
        public Integer lastSeen;
        public Integer lastSeenEpoch;
        public Integer linkQuality;
        public ArrayList<Integer> endpoints;
        public int hue;
        public int sat;
        public String topic;
        public String restartReason;
        public String uptime;
        public Date startupUTC;
        public ArrayList<String> wifiSSId;
        public int telePeriod;
        public String hostName;
        public String ipAddress;
        public String gateway;
        public String subnetMask;
        public String temperature;
        public String temperatureUnit;
        public String power1;
        public String power2;
        public int ledState;
        public int batteryPercentage;
        public int zoneStatus;
        public int occupancy;
    }