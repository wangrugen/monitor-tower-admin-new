<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<%@ include file="/WEB-INF/jsp/common/tags.jsp" %>
<!doctype html>
<html lang="en">
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="copyright" content="All Rights Reserved, Copyright (C) 2013,Wangruguen, Ltd." />
    <title>铁塔监控管理服务平台</title>
    <link rel="stylesheet" type="text/css" href="${contextPath}/easyui/1.3.4/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/wu.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/icon.css" />
    <link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/1.3.4/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/1.3.4/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/layer.js"></script>
    <script src="https://webapi.amap.com/maps?v=1.4.13&key=您申请的key值"></script>
    <script type="text/javascript" src="https://webapi.amap.com/demos/js/liteToolbar.js"></script>
    <script type="text/javascript" src='https://a.amap.com/jsapi_demos/static/citys.js'></script>t>
</head>
<style type="text/css">
    body,html,#container{
        width: 100%;
        height: 100%;
        margin: 0px
    }
    .input-card .btn {
        margin-right: 1.2rem;
        width: 9rem;
    }

    .input-card .btn:last-child {
        margin-right: 0;
    }

</style>
<div class="easyui-layout" data-options="fit:true">
    <div id="container" tabindex="0"></div>
</div>
<script type="text/javascript">
    //初始化地图
    var map = new AMap.Map('container', {
        resizeEnable: true, //是否监控地图容器尺寸变化
        zoom: 17,
        center: [112.443416,38.011058],
        features: ['bg', 'road', 'building', 'point']
    });

    //设置地图显示要素
    function setMapFeatures() {
        var features = [];
        var inputs = document.querySelectorAll("#map-features input");
        inputs.forEach(function(input) {
            if (input.checked) {
                features.push(input.value);
            }
        });
        map.setFeatures(features);
    }

    //绑定checkbox点击事件
    var inputs = document.querySelectorAll("#map-features input");
    inputs.forEach(function(checkbox) {
        checkbox.onclick = setMapFeatures;
    });

    var marker1 = new AMap.Marker({
        position: new AMap.LngLat(112.443416,38.011058),
        offset: new AMap.Pixel(-10, -10),
        icon: '${contextPath}/images/icon_coverR.png', // 添加 Icon 图标 URL
        title: '井盖1'
    });

    var marker2 = new AMap.Marker({
        position: new AMap.LngLat(112.444360,38.013155),
        offset: new AMap.Pixel(-10, -10),
        icon: '${contextPath}/images/icon_coverR.png', // 添加 Icon 图标 URL
        title: '井盖2'
    });

    var marker3 = new AMap.Marker({
        position: new AMap.LngLat(112.445497,38.013002),
        offset: new AMap.Pixel(-10, -10),
        icon: '${contextPath}/images/icon_coverR.png', // 添加 Icon 图标 URL
        title: '井盖3'
    });

    var marker4 = new AMap.Marker({
        position: new AMap.LngLat(112.449381,38.014558),
        offset: new AMap.Pixel(-10, -10),
        icon: '${contextPath}/images/icon_coverR.png', // 添加 Icon 图标 URL
        title: '井盖4'

    });
    var marker5 = new AMap.Marker({
        position: new AMap.LngLat(112.445304,38.011751),
        offset: new AMap.Pixel(-10, -10),
        icon: '${contextPath}/images/icon_coverR.png', // 添加 Icon 图标 URL
        title: '井盖5'
    });

    var marker6 = new AMap.Marker({
        position: new AMap.LngLat(112.442944,38.011684),
        offset: new AMap.Pixel(-10, -10),
        icon: '${contextPath}/images/icon_coverR.png', // 添加 Icon 图标 URL
        title: '井盖6'
    });

    map.add(marker1);
    map.add(marker2);
    map.add(marker3);
    map.add(marker4);
    map.add(marker5);
    map.add(marker6);

    var content = ["<div>","电话 : 010-84107000   邮编 : 100102","地址 : xxx地址</div></div>"];
    var infoWindow = new AMap.InfoWindow({
        content: content.join("<br>")  //传入 dom 对象，或者 html 字符串
    });

    marker1.on('click',function(e){

        infoWindow.open(map,[112.443416,38.011058]);
    });
    marker2.on('click',function(e){

        infoWindow.open(map,[112.444360,38.013155]);
    });

    marker3.on('click',function(e){

        infoWindow.open(map,[112.445497,38.013002]);
    });

    marker4.on('click',function(e){

        infoWindow.open(map,[112.449381,38.014558]);
    });

    marker5.on('click',function(e){

        infoWindow.open(map,[112.445304,38.011751]);
    });

    marker6.on('click',function(e){

        infoWindow.open(map,[112.442944,38.011684]);
    });





</script>
