package me.xiaotian.geohash.service.impl;

import me.xiaotian.geohash.dao.LbsDao;
import me.xiaotian.geohash.dto.PoiListDto;
import me.xiaotian.geohash.entity.Loc;
import me.xiaotian.geohash.service.LbsService;
import me.xiaotian.geohash.util.LbsDtoToEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by guoxiaotian on 2016/10/21.
 */
@Service
public class LbsServiceImpl implements LbsService {

    @Autowired
    private LbsDao lbsDao;

    @Override
    public boolean saveLoc(PoiListDto poiListDto) {
        try {
            LbsDtoToEntity l = new LbsDtoToEntity(poiListDto);
            List<Loc> locs = l.getLocs();
            lbsDao.saveLbs(locs);
//            lbsDao.saveLbs1(locs.get(0));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
