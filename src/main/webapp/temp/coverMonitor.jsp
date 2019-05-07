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
    var map = new AMap.Map('container', {
        zoom: 4,
        center: [102.342785, 35.312316]
    });

    var style = [{
        url: 'https://a.amap.com/jsapi_demos/static/images/mass0.png',
        anchor: new AMap.Pixel(6, 6),
        size: new AMap.Size(11, 11)
    }, {
        url: 'https://a.amap.com/jsapi_demos/static/images/mass1.png',
        anchor: new AMap.Pixel(4, 4),
        size: new AMap.Size(7, 7)
    }, {
        url: 'https://a.amap.com/jsapi_demos/static/images/mass2.png',
        anchor: new AMap.Pixel(3, 3),
        size: new AMap.Size(5, 5)
    }
    ];

    var mass = new AMap.MassMarks(citys, {
        opacity: 0.8,
        zIndex: 111,
        cursor: 'pointer',
        style: style
    });

    var marker = new AMap.Marker({content: ' ', map: map});

    mass.on('mouseover', function (e) {

        marker.setPosition(e.data.lnglat);
        marker.setLabel({content: e.data.name})
    });

    mass.setMap(map);

    function setStyle(multiIcon) {
        if (multiIcon) {
            mass.setStyle(style);
        } else {
            mass.setStyle(style[2]);
        }
    }
</script>
