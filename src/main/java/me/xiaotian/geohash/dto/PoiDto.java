package me.xiaotian.geohash.dto;

import java.io.Serializable;

/**
 * Created by guoxiaotian on 2016/10/21.
 */
public class PoiDto implements Serializable{

    private String address;
    private String name;
    private LocationDto location;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PoiDto{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
