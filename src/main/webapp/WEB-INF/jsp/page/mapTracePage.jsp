<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<%@ include file="/WEB-INF/jsp/common/tags.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>轨迹回放</title>
    <link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css"/>
    <style>
        html, body, #container {
            height: 100%;
            width: 100%;
        }

        .input-card .btn{
            margin-right: 1.2rem;
            width: 9rem;
        }

        .input-card .btn:last-child{
            margin-right: 0;
        }
    </style>
</head>
<body>
<div id="container"></div>
<div class="input-card">
    <h4>轨迹回放控制</h4>
    <div class="input-item">
        <input type="button" class="btn" value="开始动画" id="start" onclick="startAnimation()"/>
        <input type="button" class="btn" value="暂停动画" id="pause" onclick="pauseAnimation()"/>
    </div>
    <div class="input-item">
        <input type="button" class="btn" value="继续动画" id="resume" onclick="resumeAnimation()"/>
        <input type="button" class="btn" value="停止动画" id="stop" onclick="stopAnimation()"/>
    </div>
</div>
<script type="text/javascript" src="https://webapi.amap.com/maps?v=1.4.15&key=250d476776c4989fe0eaf69d434886fd"></script>
<script>
    var marker,lineArr = eval('(' + '${traces}' + ')');
    console.log("lineArr："+lineArr);
    var center = eval('(' + '${center}' + ')');
    console.log("center："+center);
    var lineArr1;
    AMap.convertFrom(lineArr, 'gps', function (status, result) {
        if (result.info === 'ok') {
            lineArr1= result.locations; // Array.<LngLat>
            var map = new AMap.Map("container", {
                resizeEnable: true,
                center:lineArr1[0],
                zoom: 17
            });
            marker = new AMap.Marker({
                map: map,
                position: lineArr1[0],
                icon: "${contextPath}/images/icon_coverR.png",
                offset: new AMap.Pixel(-26, -13),
                autoRotation: true,
                angle:-90,
            });

            // 绘制轨迹
            var polyline = new AMap.Polyline({
                map: map,
                path: lineArr1,
                showDir:true,
                strokeColor: "#28F",  //线颜色
                // strokeOpacity: 1,     //线透明度
                strokeWeight: 6,      //线宽
                // strokeStyle: "solid"  //线样式
            });

            var passedPolyline = new AMap.Polyline({
                map: map,
                // path: lineArr,
                strokeColor: "#AF5",  //线颜色
                // strokeOpacity: 1,     //线透明度
                strokeWeight: 6,      //线宽
                // strokeStyle: "solid"  //线样式
            });


            marker.on('moving', function (e) {
                passedPolyline.setPath(e.passedPath);
            });

            map.setFitView();
        }
    });



    function startAnimation () {
        marker.moveAlong(lineArr1, 200);
    }

    function pauseAnimation () {
        marker.pauseMove();
    }

    function resumeAnimation () {
        marker.resumeMove();
    }

    function stopAnimation () {
        marker.stopMove();
    }
</script>
</body>
</html>