package me.xiaotian.geohash.service.impl;

import ch.hsr.geohash.GeoHash;
import me.xiaotian.geohash.dao.LbsCopy;
import me.xiaotian.geohash.dto.GeoNeighbour;
import me.xiaotian.geohash.entity.Loc;
import me.xiaotian.geohash.service.LbsCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guoxiaotian on 2016/10/22.
 */
@Service
public class LbsCpoyServiceImpl implements LbsCopyService {

    @Autowired
    private LbsCopy lbsCopy;

    @Override
    public boolean saveLoc2(double lat, double lon) {
        Loc loc = new Loc();
        GeoHash geoHash = GeoHash.withCharacterPrecision(lat, lon, 12);
        loc.setLat(lat);
        loc.setLon(lon);
        loc.setGeohash(geoHash.toBase32());
        try {
            lbsCopy.addLoc(loc);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Loc> listLoc() {
        return lbsCopy.getAllLoc();
    }

    @Override
    public List<Loc> getLocByLen(int len, Double lat, Double lon) {
        GeoNeighbour locs = new GeoNeighbour(len, lat, lon);
        List<Loc> locList = lbsCopy.queryLoc(locs);
        return locList;
    }
}
