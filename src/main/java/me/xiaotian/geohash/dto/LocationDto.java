package me.xiaotian.geohash.dto;

import java.io.Serializable;

/**
 * Created by guoxiaotian on 2016/10/21.
 */
public class LocationDto implements Serializable{
    private Double lat;
    private Double lng;
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "LocationDto{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
