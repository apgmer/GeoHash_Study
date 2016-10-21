package me.xiaotian.geohash.controller;

import me.xiaotian.geohash.dto.PoiListDto;
import me.xiaotian.geohash.service.LbsService;
import me.xiaotian.geohash.util.WebResultUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by guoxiaotian on 2016/10/21.
 */

@Controller
@RequestMapping("/")
public class LbsController {

    @Resource
    private LbsService lbsService;

    @RequestMapping(value = "/saveLoc",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String ,String> saveLoc(@RequestBody PoiListDto poiList){
        boolean t = lbsService.saveLoc(poiList);
        if (t){
            return WebResultUtil.SUCCESSACT();
        }else{
            return WebResultUtil.ERRORACT();
        }

    }

}
