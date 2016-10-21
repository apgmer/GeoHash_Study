package me.xiaotian.geohash.dto;

import ch.hsr.geohash.GeoHash;

/**
 * Created by guoxiaotian on 2016/10/21.
 */
public class GeoNeighbour {

    private int len;
    private GeoHash o;
    private GeoHash n;
    private GeoHash s;
    private GeoHash w;
    private GeoHash e;
    private GeoHash wn;
    private GeoHash en;
    private GeoHash ws;
    private GeoHash es;

    private String[] con;

    public GeoNeighbour(int len, Double lat, Double lon) {
        this.len = len;
        o = GeoHash.withCharacterPrecision(lat, lon, len);
        n = o.getNorthernNeighbour();
        s = o.getSouthernNeighbour();
        w = o.getWesternNeighbour();
        e = o.getEasternNeighbour();
        wn = w.getNorthernNeighbour();
        en = e.getNorthernNeighbour();
        ws = w.getSouthernNeighbour();
        es = e.getSouthernNeighbour();
    }

    public int getLen() {
        return len;
    }

    public String[] getCon() {
        String[] str = new String[9];
        str[0] = o.toBase32();
        str[1] = n.toBase32();
        str[2] = s.toBase32();
        str[3] = w.toBase32();
        str[4] = e.toBase32();
        str[5] = wn.toBase32();
        str[6] = en.toBase32();
        str[7] = ws.toBase32();
        str[8] = es.toBase32();
        return str;
    }
}
