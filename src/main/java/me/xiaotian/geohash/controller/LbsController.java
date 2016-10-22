package me.xiaotian.geohash.controller;

import me.xiaotian.geohash.dto.PoiListDto;
import me.xiaotian.geohash.entity.Loc;
import me.xiaotian.geohash.service.LbsCopyService;
import me.xiaotian.geohash.service.LbsService;
import me.xiaotian.geohash.util.WebResultUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by guoxiaotian on 2016/10/21.
 */

@Controller
@RequestMapping("/")
public class LbsController {

    @Resource
    private LbsService lbsService;

    @Resource
    private LbsCopyService lbsCopyService;

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

    @RequestMapping(value = "/show")
    public String sohwView(){
        return "show";
    }

    @RequestMapping(value = "/show",method = RequestMethod.POST)
    @ResponseBody
    public List<Loc> showView2(@RequestParam(value = "lev", required = false) Integer lev,
                          @RequestParam(value = "lat", required = false) Double lat,
                          @RequestParam(value = "lon", required = false) Double lon){
        return lbsService.getLocByLen(lev,lat,lon);
    }


    @RequestMapping(value = "/showAll")
    public String showAllView(){
        return "showAll";
    }

    @RequestMapping(value = "/showAll",method = RequestMethod.POST)
    @ResponseBody
    public List<Loc> showAllView2(@RequestParam(value = "lev", required = false) Integer lev,
                               @RequestParam(value = "lat", required = false) Double lat,
                               @RequestParam(value = "lon", required = false) Double lon){
//        return lbsService.getLocByLen(lev,lat,lon);
        return lbsCopyService.getLocByLen(lev,lat,lon);
    }

}
