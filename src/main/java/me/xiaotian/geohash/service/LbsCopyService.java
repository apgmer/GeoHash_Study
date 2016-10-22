package me.xiaotian.geohash.service;

import me.xiaotian.geohash.entity.Loc;

import java.util.List;

/**
 * Created by guoxiaotian on 2016/10/22.
 */
public interface LbsCopyService {

    boolean saveLoc2(double lat, double lon);

    List<Loc> listLoc();

    List<Loc> getLocByLen(int len, Double lat, Double lon);

}
