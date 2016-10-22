package me.xiaotian.geohash.service.impl;

import ch.hsr.geohash.BoundingBox;
import ch.hsr.geohash.GeoHash;
import me.xiaotian.geohash.entity.Loc;
import me.xiaotian.geohash.service.LbsCopyService;
import me.xiaotian.geohash.service.LbsService;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by guoxiaotian on 2016/10/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/*.xml"})
public class LbsServiceImplTest {

    @Resource
    private LbsService lbsService;

    @Resource
    private LbsCopyService lbsCopyService;

    @Test
    public void getLocByLen() throws Exception {
        List<Loc> locs = lbsService.getLocByLen(6, 40.226487, 116.204521);
        System.out.println(locs);
    }

    @Test
    public void geoHashTest() throws Exception {
        GeoHash geoHash = GeoHash.withCharacterPrecision(40.226487, 116.204521, 5);
        geoHash.getPoint();
        BoundingBox b = geoHash.getBoundingBox();
        System.out.println(b.getMaxLon());
        System.out.println(b.getMinLon());
        System.out.println(b.getMaxLat());
        System.out.println(b.getMinLat());
    }

    @Test
    public void getNumRandom() throws Exception {
        double d = RandomUtils.nextDouble(77.073544, 121.018856);
        double d2 = RandomUtils.nextDouble(18.276294, 42.265108);
        System.out.println(d);
        System.out.println(d2);
    }

    @Test
    public void saveLoc2() throws Exception {
        for (int i = 0; i < 1000000; i++) {
            double lon = RandomUtils.nextDouble(102.073544, 121.018856);
            double lat = RandomUtils.nextDouble(29.276294, 42.265108);
            lbsCopyService.saveLoc2(lat, lon);
        }
    }
}