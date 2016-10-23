package me.xiaotian.geohash.MongoDao.impl;

import me.xiaotian.geohash.MongoDao.LbsMongoDao;
import me.xiaotian.geohash.entity.GPS;
import me.xiaotian.geohash.entity.LBSEntity;
import me.xiaotian.geohash.service.MongoService;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by guoxiaotian on 2016/10/23.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/*.xml"})
public class LbsMongoDaoImplTest {

    @Autowired
    private LbsMongoDao lbsMongoDao;

    @Autowired
    private MongoService mongoService;

    @Test
    public void findOne() throws Exception {
        LBSEntity lbsEntity = lbsMongoDao.findOne("apgmer@gmail.com");
        System.out.println(lbsEntity.toString());
    }

    @Test
    public void saveOne() throws Exception {

        for (int i = 0; i < 1000000; i++) {
            double lon = RandomUtils.nextDouble(102.073544, 121.018856);
            double lat = RandomUtils.nextDouble(29.276294, 42.265108);
            mongoService.saveLBS(lat, lon);
        }
    }

}