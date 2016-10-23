package me.xiaotian.geohash.service;

import me.xiaotian.geohash.entity.LBSEntity;

/**
 * Created by guoxiaotian on 2016/10/23.
 */
public interface MongoService {

    LBSEntity findOneByAccount(String account);

    boolean saveLBS(Double lat, Double lon);

}
