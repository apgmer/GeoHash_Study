package me.xiaotian.geohash.service.impl;

import me.xiaotian.geohash.entity.Loc;
import me.xiaotian.geohash.service.LbsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by guoxiaotian on 2016/10/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/*.xml"})
public class LbsServiceImplTest {

    @Resource
    private LbsService lbsService;

    @Test
    public void getLocByLen() throws Exception {
        List<Loc> locs = lbsService.getLocByLen(6, 40.226487, 116.204521);
        System.out.println(locs);
    }

}