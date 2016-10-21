package me.xiaotian.geohash.dao;

import me.xiaotian.geohash.dto.GeoNeighbour;
import me.xiaotian.geohash.entity.Loc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by guoxiaotian on 2016/10/21.
 */
public interface LbsDao {

    int saveLbs(@Param("locs") List<Loc> locs);

    int saveLbs1(@Param("loc") Loc loc);

    List<Loc> queryLoc(@Param("geoNeighbour")GeoNeighbour geoNeighbour);

}
