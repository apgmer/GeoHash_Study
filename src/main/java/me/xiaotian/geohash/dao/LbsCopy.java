package me.xiaotian.geohash.dao;

import me.xiaotian.geohash.dto.GeoNeighbour;
import me.xiaotian.geohash.entity.Loc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by guoxiaotian on 2016/10/22.
 */
public interface LbsCopy {

    int addLoc(@Param("loc") Loc loc);

    List<Loc> getAllLoc();

    List<Loc> queryLoc(@Param("geoNeighbour")GeoNeighbour geoNeighbour);
}
