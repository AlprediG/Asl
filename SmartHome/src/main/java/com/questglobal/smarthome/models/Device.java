package com.questglobal.smarthome.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@Document("Devices")
public class Device {
        @Id
        @Field("_id")
        private ObjectId id;
        @Field("Name")
        private String name;
        @Field("HexId")
        private String HexId;
        @Field("Power")
        private int power;
        @Field("Device")
        private String device;
        @Field("CT")
        private Integer ct;
        @Field("Dimmer")
        private Integer dimmer;
        @Field("ModelId")
        private String modelId;
        @Field("Manufacturer")
        private String manufacturer;
        @Field("Reachable")
        private boolean reachable;
        @Field("LastSeen")
        private Integer lastSeen;
        @Field("LastSeenEpoch")
        private Integer lastSeenEpoch;
        @Field("LinkQuality")
        private Integer linkQuality;
        @Field("Endpoints")
        private ArrayList<Integer> endpoints;
        private String _class;
        @Field("Hue")
        private int hue;
        @Field("Sat")
        private int sat;
        @Field("Topic")
        private String topic;
        @Field("RestartReason")
        private String restartReason;
        @Field("Uptime")
        private String uptime;
        @Field("StartupUTC")
        private LocalDateTime startupUTC;
        @Field("WifiSSId")
        private ArrayList<String> wifiSSId;
        @Field("TelePeriod")
        private int telePeriod;
        @Field("HostName")
        private String hostName;
        @Field("IpAddress")
        private String ipAddress;
        @Field("Gateway")
        private String gateway;
        @Field("SubnetMask")
        private String subnetMask;
        @Field("Temperature")
        private String temperature;
        @Field("TemperatureUnit")
        private String temperatureUnit;
        @Field("Power1")
        private String power1;
        @Field("Power2")
        private String power2;
        @Field("LedState")
        private int ledState;
        @Field("BatteryPercentage")
        private int batteryPercentage;
        @Field("ZoneStatus")
        private int zoneStatus;
        @Field("Occupancy")
        private int occupancy;

        public Device(String name) {
            this.id = new ObjectId();
            this.name = name;
            this.HexId = HexId;
            this.power = power;
            this.device = device;
            this.ct = ct;
            this.dimmer = dimmer;
            this.modelId = modelId;
            this.manufacturer = manufacturer;
            this.reachable = reachable;
            this.lastSeen = lastSeen;
            this.lastSeenEpoch = lastSeenEpoch;
            this.linkQuality = linkQuality;
            this.endpoints = endpoints;
            this._class = _class;
            this.hue = hue;
            this.sat = sat;
            this.topic = topic;
            this.restartReason = restartReason;
            this.uptime = uptime;
            this.startupUTC = startupUTC;
            this.wifiSSId = wifiSSId;
            this.telePeriod = telePeriod;
            this.hostName = hostName;
            this.ipAddress = ipAddress;
            this.gateway = gateway;
            this.subnetMask = subnetMask;
            this.temperature = temperature;
            this.temperatureUnit = temperatureUnit;
            this.power1 = power1;
            this.power2 = power2;
            this.ledState = ledState;
            this.batteryPercentage = batteryPercentage;
            this.zoneStatus = zoneStatus;
            this.occupancy = occupancy;
        }

        @Override
        public String toString() {
            return "Device{" + "id=" + id + ", name='" + name + '\'' + ", HexId='" + HexId + '\'' + ", power=" + power + ", device='" + device + '\'' + ", ct=" + ct + ", dimmer=" + dimmer + ", modelId='" + modelId + '\'' + ", manufacturer='" + manufacturer + '\'' + ", reachable=" + reachable + ", lastSeen=" + lastSeen + ", lastSeenEpoch=" + lastSeenEpoch + ", LinkQuality=" + linkQuality + ", endpoints=" + endpoints + ", _class='" + _class + '\'' + ", hue=" + hue + ", sat=" + sat + ", topic='" + topic + '\'' + ", restartReason='" + restartReason + '\'' + ", uptime='" + uptime + '\'' + ", startupUTC=" + startupUTC + ", wifiSSId=" + wifiSSId + ", telePeriod=" + telePeriod + ", hostName='" + hostName + '\'' + ", ipAddress='" + ipAddress + '\'' + ", gateway='" + gateway + '\'' + ", subnetMask='" + subnetMask + '\'' + ", temperature='" + temperature + '\'' + ", temperatureUnit='" + temperatureUnit + '\'' + ", power1='" + power1 + '\'' + ", power2='" + power2 + '\'' + ", ledState=" + ledState + ", batteryPercentage=" + batteryPercentage + ", zoneStatus=" + zoneStatus + ", occupancy=" + occupancy + '}';
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

        public String getHexId() {
            return HexId;
        }

        public void setHexId(String HexId) {
            this.HexId = HexId;
        }

        public Integer getPower() {
            return power;
        }

        public void setPower(Integer power) {
            this.power = power;
        }

        public String getDevice() {
            return device;
        }

        public void setDevice(String device) {
            this.device = device;
        }

        public Integer getCt() {
            return ct;
        }

        public void setCt(Integer ct) {
            this.ct = ct;
        }

        public Integer getDimmer() {
            return dimmer;
        }

        public void setDimmer(Integer dimmer) {
            this.dimmer = dimmer;
        }

        public String getModelId() {
            return modelId;
        }

        public void setModelId(String modelId) {
            this.modelId = modelId;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public boolean isReachable() {
            return reachable;
        }

        public void setReachable(boolean reachable) {
            this.reachable = reachable;
        }

        public Integer getLastSeen() {
            return lastSeen;
        }

        public void setLastSeen(Integer lastSeen) {
            this.lastSeen = lastSeen;
        }

        public Integer getLastSeenEpoch() {
            return lastSeenEpoch;
        }

        public void setLastSeenEpoch(Integer lastSeenEpoch) {
            this.lastSeenEpoch = lastSeenEpoch;
        }

        public Integer getLinkQuality() {
            return linkQuality;
        }

        public void setLinkQuality(Integer linkQuality) {
            linkQuality = linkQuality;
        }

        public ArrayList<Integer> getEndpoints() {
            return endpoints;
        }

        public void setEndpoints(ArrayList<Integer> endpoints) {
            this.endpoints = endpoints;
        }

        public String get_class() {
            return _class;
        }

        public void set_class(String _class) {
            this._class = _class;
        }

        public int getHue() {
            return hue;
        }

        public void setHue(int hue) {
            this.hue = hue;
        }

        public int getSat() {
            return sat;
        }

        public void setSat(int sat) {
            this.sat = sat;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getRestartReason() {
            return restartReason;
        }

        public void setRestartReason(String restartReason) {
            this.restartReason = restartReason;
        }

        public String getUptime() {
            return uptime;
        }

        public void setUptime(String uptime) {
            this.uptime = uptime;
        }

        public LocalDateTime getStartupUTC() {
            return startupUTC;
        }

        public void setStartupUTC(LocalDateTime startupUTC) {
            this.startupUTC = startupUTC;
        }

        public ArrayList<String> getWifiSSId() {
            return wifiSSId;
        }

        public void setWifiSSId(ArrayList<String> wifiSSId) {
            this.wifiSSId = wifiSSId;
        }

        public int getTelePeriod() {
            return telePeriod;
        }

        public void setTelePeriod(int telePeriod) {
            this.telePeriod = telePeriod;
        }

        public String getHostName() {
            return hostName;
        }

        public void setHostName(String hostName) {
            this.hostName = hostName;
        }

        public String getIpAddress() {
            return ipAddress;
        }

        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        public String getGateway() {
            return gateway;
        }

        public void setGateway(String gateway) {
            this.gateway = gateway;
        }

        public String getSubnetMask() {
            return subnetMask;
        }

        public void setSubnetMask(String subnetMask) {
            this.subnetMask = subnetMask;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getTemperatureUnit() {
            return temperatureUnit;
        }

        public void setTemperatureUnit(String temperatureUnit) {
            this.temperatureUnit = temperatureUnit;
        }

        public String getPower1() {
            return power1;
        }

        public void setPower1(String power1) {
            this.power1 = power1;
        }

        public String getPower2() {
            return power2;
        }

        public void setPower2(String power2) {
            this.power2 = power2;
        }

        public int getLedState() {
            return ledState;
        }

        public void setLedState(int ledState) {
            this.ledState = ledState;
        }

        public int getBatteryPercentage() {
            return batteryPercentage;
        }

        public void setBatteryPercentage(int batteryPercentage) {
            this.batteryPercentage = batteryPercentage;
        }

        public int getZoneStatus() {
            return zoneStatus;
        }

        public void setZoneStatus(int zoneStatus) {
            this.zoneStatus = zoneStatus;
        }

        public int getOccupancy() {
            return occupancy;
        }

        public void setOccupancy(int occupancy) {
            this.occupancy = occupancy;
        }
}

