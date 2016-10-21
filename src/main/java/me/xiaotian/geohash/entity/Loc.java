package me.xiaotian.geohash.entity;

import java.io.Serializable;

public class Loc implements Serializable{
    private Long id;
    private String name;
    private String place;
    private Double lat;
    private Double lon;
    private String geohash;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

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

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    @Override
    public String toString() {
        return "Loc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", geohash='" + geohash + '\'' +
                '}';
    }
}
