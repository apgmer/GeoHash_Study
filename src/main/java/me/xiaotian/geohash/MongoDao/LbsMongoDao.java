package me.xiaotian.geohash.MongoDao;

import me.xiaotian.geohash.entity.LBSEntity;

/**
 * Created by guoxiaotian on 2016/10/23.
 */
public interface LbsMongoDao {

    LBSEntity findOne(String account);

    boolean saveOne(LBSEntity lbsEntity);
}
