package me.xiaotian.geohash.service;

import me.xiaotian.geohash.dto.PoiListDto;

/**
 * Created by guoxiaotian on 2016/10/21.
 */
public interface LbsService {
    boolean saveLoc(PoiListDto poiListDto);
}
