package me.xiaotian.geohash.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guoxiaotian on 2016/10/10.
 */
public final class WebResultUtil {

    public static Map<String, String> SUCCESSACT() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("status","ok");
        return map;
    }

    public static Map<String, String> ERRORACT() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("status","error");
        return map;
    }

}
