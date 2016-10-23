package me.xiaotian.geohash.entity;

import java.io.Serializable;

/**
 * Created by guoxiaotian on 2016/10/23.
 */
public class GPS implements Serializable {
    private Double lat;
    private Double lon;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
