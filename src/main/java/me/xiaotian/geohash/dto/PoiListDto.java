package me.xiaotian.geohash.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guoxiaotian on 2016/10/21.
 */
public class PoiListDto implements Serializable{
    private long count;
    private int pageIndex;
    private int pageSize;
    private List<PoiDto> pois;

    @Override
    public String toString() {
        return "PoiListDto{" +
                "count=" + count +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", pois=" + pois +
                '}';
    }

    public List<PoiDto> getPois() {
        return pois;
    }

    public void setPois(List<PoiDto> pois) {
        this.pois = pois;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
