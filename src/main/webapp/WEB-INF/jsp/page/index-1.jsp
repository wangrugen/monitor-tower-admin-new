<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<%@ include file="/WEB-INF/jsp/common/tags.jsp" %>
<!DOCTYPE html>
<html>
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
    <script type="text/javascript" src='https://a.amap.com/jsapi_demos/static/citys.js'></script>
</head>
<body class="easyui-layout">
<!-- begin of header -->
<div class="wu-header" data-options="region:'north',border:false,split:true">
    <div class="wu-header-left">
        <h1>铁塔监控管理服务平台</h1>
    </div>
    <div class="wu-header-right">
        <p><strong class="easyui-tooltip" title="2条未读消息"><shiro:authenticated></shiro:authenticated></strong>，欢迎您！</p>
        <p><a href="#">网站首页</a>|<a href="#">支持论坛</a>|<a href="#">帮助中心</a>|<a href="#">安全退出</a></p>
    </div>
</div>
<!-- end of header -->
<!-- begin of sidebar -->
<div class="wu-sidebar" data-options="region:'west',split:true,border:true,title:'导航菜单'">
    <div class="easyui-accordion" data-options="border:false,fit:true">
        <div title="运行管理" data-options="iconCls:'icon-application-cascade'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <!--样式icon-chart-organisation；icon-book；-->
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/userManage1.jsp" iframe="0">用户管理</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/layout-1.html" iframe="0">权限管理</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-2.html" iframe="0">角色管理</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-2.html" iframe="0">角色权限查询</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-2.html" iframe="0">用户角色管理</a></li>
                <!-- <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="temp/layout-3.html" iframe="0">操作日志</a></li>-->
            </ul>
        </div>
        <div title="铁塔管理" data-options="iconCls:'icon-application-form-edit'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/pic_test.html" iframe="0">图片接收测试</a></li>
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">铁塔管理</a></li>
                <!-- <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="temp/layout-3.html" iframe="0">导航标题</a></li> -->
            </ul>
        </div>
        <div title="报警管理" data-options="iconCls:'icon-creditcards'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">终端报警审核</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/layout-3.html" iframe="0">报警工单管理</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-3.html" iframe="0">报警历史查询</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="temp/layout-3.html" iframe="0">巡检上报管理</a></li>
                <!-- <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="temp/layout-3.html" iframe="0">导航标题</a></li> -->
            </ul>
        </div>
        <div title="铁塔监控" data-options="iconCls:'icon-cart'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">报警实时监控</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/coverMonitor.jsp" iframe="0">铁塔监控</a></li>
                <!-- <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="temp/layout-3.html" iframe="0">导航标题</a></li> -->
            </ul>
        </div>
        <div title="统计报表" data-options="iconCls:'icon-bricks'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">报警类别汇总图表</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/layout-3.html" iframe="0">报警工单月统计</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-3.html" iframe="0">井盖报警多发地统计</a></li>
                <!-- <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="temp/layout-3.html" iframe="0">导航标题</a></li> -->
            </ul>
        </div>
        <div title="终端管理" data-options="iconCls:'icon-chart-curve'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">终端设备管理</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/layout-3.html" iframe="0">终端自动巡检</a></li>
                <!-- <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="temp/layout-3.html" iframe="0">导航标题</a></li> -->
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
            </ul>
        </div>
        <div title="系统管理" data-options="iconCls:'icon-wrench'" style="padding:5px;">
            <ul class="easyui-tree wu-side-tree">
                <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">系统管理</a></li>
                <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
                <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="temp/layout-3.html" iframe="0">导航标题</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- end of sidebar -->
<!-- begin of main -->
<div class="wu-main" data-options="region:'center'">
    <div id="wu-tabs" class="easyui-tabs" data-options="border:false,fit:true">
        <div title="首页" data-options="href:'temp/layout-1.html',closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
    </div>
</div>
<!-- end of main -->
<!-- begin of footer -->
<div class="wu-footer" data-options="region:'south',border:true,split:true">
    &copy; 2013 Wu All Rights Reserved
</div>
<!-- end of footer -->
<script type="text/javascript">
    $(function(){
        $('.wu-side-tree a').bind("click",function(){
            var title = $(this).text();
            var url = $(this).attr('data-link');
            var iconCls = $(this).attr('data-icon');
            var iframe = $(this).attr('iframe')==1?true:false;
            addTab(title,url,iconCls,iframe);
        });
    })

    /**
     * Name 载入树形菜单
     */
    $('#wu-side-tree').tree({
        url:'temp/menu.php',
        cache:false,
        onClick:function(node){
            var url = node.attributes['url'];
            if(url==null || url == ""){
                return false;
            }
            else{
                addTab(node.text, url, '', node.attributes['iframe']);
            }
        }
    });

    /**
     * Name 选项卡初始化
     */
    $('#wu-tabs').tabs({
        tools:[{
            iconCls:'icon-reload',
            border:false,
            handler:function(){
                $('#wu-datagrid').datagrid('reload');
            }
        }]
    });

    /**
     * Name 添加菜单选项
     * Param title 名称
     * Param href 链接
     * Param iconCls 图标样式
     * Param iframe 链接跳转方式（true为iframe，false为href）
     */
    function addTab(title, href, iconCls, iframe){
        var tabPanel = $('#wu-tabs');
        if(!tabPanel.tabs('exists',title)){
            var content = '<iframe scrolling="auto" frameborder="0"  src="'+ href +'" style="width:100%;height:100%;"></iframe>';
            if(iframe){
                tabPanel.tabs('add',{
                    title:title,
                    content:content,
                    iconCls:iconCls,
                    fit:true,
                    cls:'pd3',
                    closable:true
                });
            }
            else{
                tabPanel.tabs('add',{
                    title:title,
                    href:href,
                    iconCls:iconCls,
                    fit:true,
                    cls:'pd3',
                    closable:true
                });
            }
        }
        else
        {
            tabPanel.tabs('select',title);
        }
    }

</script>
</body>
</html>