package me.xiaotian.geohash.entity;

import java.io.Serializable;

/**
 * Created by guoxiaotian on 2016/10/23.
 */
public class LBSEntity implements Serializable{
    private Double[] gps;
    private String geohash;

    public Double[] getGps() {
        return gps;
    }

    public void setGps(Double[] gps) {
        this.gps = gps;
    }

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }
}
