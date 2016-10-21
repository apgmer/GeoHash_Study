/**
 * Created by guoxiaotian on 2016/10/20.
 */

var map = new AMap.Map('container',{
    zoom: 13,
    center: [116.204521, 40.226487]
});

AMap.service(["AMap.PlaceSearch"], function() {
    var placeSearch = new AMap.PlaceSearch({ //构造地点查询类
        pageSize: 50,
        count:10000,
        pageIndex: 1,
        city: "010", //城市
        map: map,
        panel: "panel"
    });
    placeSearch.searchNearBy("", [116.204521, 40.226487], 5000, function(status, result) {
        if (status === 'complete' && result.info === 'OK') {
            console.log(result.poiList)
            // savePoi(result.poiList);
        }
    });

});

var savePoi = function (poiList) {
    $.ajax({
        url:'/saveLoc',
        method:'POST',
        contentType:'application/json',
        data:JSON.stringify(poiList),
        dataType:'json',
        success:function (res) {
            console.log(res)
        },
        error:function (error) {
            console.log(error)
        }
    })
}