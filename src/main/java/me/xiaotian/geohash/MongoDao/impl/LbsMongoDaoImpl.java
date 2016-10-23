package me.xiaotian.geohash.MongoDao.impl;

import me.xiaotian.geohash.MongoDao.LbsMongoDao;
import me.xiaotian.geohash.entity.LBSEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by guoxiaotian on 2016/10/23.
 */
@Repository
public class LbsMongoDaoImpl implements LbsMongoDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public LBSEntity findOne(String account) {
        Query query = new BasicQuery("{account:'" + account + "'}");
        LBSEntity lbsEntity = mongoTemplate.findOne(query, LBSEntity.class);
        return lbsEntity;
    }

    @Override
    public boolean saveOne(LBSEntity lbsEntity) {
        try {
            mongoTemplate.save(lbsEntity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
