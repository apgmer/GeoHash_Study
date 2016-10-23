package me.xiaotian.geohash.service.impl;

import ch.hsr.geohash.GeoHash;
import me.xiaotian.geohash.MongoDao.LbsMongoDao;
import me.xiaotian.geohash.entity.GPS;
import me.xiaotian.geohash.entity.LBSEntity;
import me.xiaotian.geohash.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by guoxiaotian on 2016/10/23.
 */
@Service
public class MongoServiceImpl implements MongoService {

    @Autowired
    private LbsMongoDao lbsMongoDao;

    @Override
    public boolean saveLBS(Double lat, Double lon) {
        try {
            GeoHash geoHash = GeoHash.withCharacterPrecision(lat,lon,12);
            LBSEntity lbsEntity = new LBSEntity();
            lbsEntity.setGeohash(geoHash.toBase32());
            Double gps[] = new Double[2];
            gps[0] = lon;
            gps[1] = lat;
            lbsEntity.setGps(gps);
            lbsMongoDao.saveOne(lbsEntity);

            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public LBSEntity findOneByAccount(String account) {
        return lbsMongoDao.findOne(account);
    }
}
