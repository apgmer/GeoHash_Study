/**
 * Created by guoxiaotian on 2016/10/21.
 */
var map = new AMap.Map('container', {
    zoom: 13,
    center: [116.204521, 40.226487]
});

// var circle = new AMap.Circle({
//     center: new AMap.LngLat("116.204521", "40.226487"),// 圆心位置
//     radius: 1000, //半径
//     strokeColor: "#6495ED", //线颜色
//     strokeOpacity: 1, //线透明度
//     strokeWeight: 1, //线粗细度
//     fillColor: "#87CEFA", //填充颜色
//     fillOpacity: 0.35//填充透明度
// });
// circle.setMap(map);

var place = "";

// marker = new AMap.Marker({
//     position: ["116.204521", "40.226487"],
//     map: map
// });

var markers = [];
function removePoints() {
    if (markers.length != 0){
        map.remove(markers)
    }
}
function sub() {
    $.ajax({
        method: 'POST',
        url: '/show',
        data: {lev: $('#l').val(), lat: 40.226487, lon: 116.204521},
        success: function (res) {
            showPoint(res)
        }
    })
}

function showPoint(points) {
    removePoints()
    $.each(points, function (index, item) {
        var marker = new AMap.Marker({
            title: item.name + item.address,
            position: [item.lon, item.lat],
            map: map
        });
        markers.push(marker)
    })
    map.setFitView();
}
