package me.xiaotian.geohash.util;

import ch.hsr.geohash.GeoHash;
import me.xiaotian.geohash.dto.PoiDto;
import me.xiaotian.geohash.dto.PoiListDto;
import me.xiaotian.geohash.entity.Loc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoxiaotian on 2016/10/21.
 */
public class LbsDtoToEntity {
    private List<Loc> locs;

    public LbsDtoToEntity(PoiListDto pois) {
        locs = new ArrayList<>();
        for (PoiDto poi : pois.getPois()){
            Loc loc = new Loc();
            loc.setName(poi.getName());
            loc.setLat(poi.getLocation().getLat());
            loc.setLon(poi.getLocation().getLng());
            loc.setPlace(poi.getAddress());
            GeoHash geoHash = GeoHash.withCharacterPrecision(loc.getLat(),loc.getLon(),12);
            loc.setGeohash(geoHash.toBase32());
            locs.add(loc);
        }

    }

    public List<Loc> getLocs() {
        return locs;
    }
}
