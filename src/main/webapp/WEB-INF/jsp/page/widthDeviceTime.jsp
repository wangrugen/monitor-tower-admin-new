<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<%@ include file="/WEB-INF/jsp/common/tags.jsp" %>
<html>

<head>
  <meta charset="UTF-8">
  <title>欢迎页面-中北大学测试</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
  <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
  <link rel="stylesheet" href="${contextPath}/css/font.css">
  <link rel="stylesheet" href="${contextPath}/css/xadmin.css">
  <script type="text/javascript" src="${contextPath}/js/jquery-1.8.0.min.js"></script>
  <script type="text/javascript" src="${contextPath}/lib/layui/layui.js" charset="utf-8"></script>
  <script type="text/javascript" src="${contextPath}/js/xadmin.js"></script>
  <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
  <!--[if lt IE 9]>
  <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
  <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>

<body>
<div class="x-body layui-anim layui-anim-up">
  <form class="layui-form" method="post" action="${contextPath}/pic/startUpServer">
    <input type="hidden" name="imie" value="${imie}"/>
    <div class="layui-form-item">
      <label for="L_email" class="layui-form-label">
        <span class="x-red">*</span>起始时间
      </label>
      <div class="layui-input-inline">
        <input type="text" id="startTime" name="startTime" required="true"
               autocomplete="off" class="layui-input">
      </div>
    </div>

    <div class="layui-form-item">
      <label for="L_email" class="layui-form-label">
        <span class="x-red">*</span>结束时间
      </label>
      <div class="layui-input-inline">
        <input type="text" id="endTime" name="endTime" required="true"
               autocomplete="off" class="layui-input">
      </div>
    </div>

    <div class="layui-form-item">
      <label for="L_repass" class="layui-form-label">
      </label>
      <button  class="layui-btn" lay-filter="add" lay-submit="">
        查看时间段内轨迹
      </button>
    </div>
  </form>
</div>
<script>
    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;


        layui.use('laydate', function(){
            var laydate = layui.laydate;

            //执行一个laydate实例
            laydate.render({
                elem: '#startTime', //指定元素
                type: 'datetime'
            });

            //执行一个laydate实例
            laydate.render({
                elem: '#endTime', //指定元素
                type: 'datetime'
            });
        });
        //监听提交
        form.on('submit(add)', function(data){
            console.log(data);
            //发异步，把数据提交给后端
            var imie =data.field.imie;
            var startTime =data.field.startTime;
            var endTime =data.field.endTime;
            $.ajax({
                url:'${contextPath}/device/toWidthDeviceTimeMapTraceParam',
                data:{"imie":imie,"startTime":startTime,"endTime":endTime},
                success:function(data){
                    window.location.href="${contextPath}/device/toWidthDeviceTimeMapTracePage?imie="+data.imie+"&startTime="+data.startTime+"&endTime="+data.endTime;
                }
            });

            return false;
        });


    });
</script>

</body>

</html>