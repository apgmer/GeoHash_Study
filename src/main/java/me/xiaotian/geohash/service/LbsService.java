package me.xiaotian.geohash.service;

import me.xiaotian.geohash.dto.PoiListDto;
import me.xiaotian.geohash.entity.Loc;

import java.util.List;

/**
 * Created by guoxiaotian on 2016/10/21.
 */
public interface LbsService {

    boolean saveLoc(PoiListDto poiListDto);

    List<Loc> getLocByLen(int len, Double lat, Double lon);


}
