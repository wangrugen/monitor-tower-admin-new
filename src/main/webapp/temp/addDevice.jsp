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
    <div class="layui-form-item">
      <label for="L_email" class="layui-form-label">
        <span class="x-red">*</span>设备编号
      </label>
      <div class="layui-input-inline">
        <input type="text" id="imie" name="imie" required="" lay-verify="required"
               autocomplete="off" class="layui-input">
      </div>
      <div class="layui-form-mid layui-word-aux">
        <span class="x-red">*</span>1-65535
      </div>
    </div>

    <div class="layui-form-item">
      <label for="L_email" class="layui-form-label">
        <span class="x-red">*</span>设备名称
      </label>
      <div class="layui-input-inline">
        <input type="text" id="name" name="name" required="" lay-verify="required"
               autocomplete="off" class="layui-input">
      </div>
      <div class="layui-form-mid layui-word-aux">
        <span class="x-red">*</span>1-65535
      </div>
    </div>

    <div class="layui-form-item">
      <label for="L_repass" class="layui-form-label">
      </label>
      <button  class="layui-btn" lay-filter="add" lay-submit="">
        新增设备
      </button>
    </div>
  </form>
</div>
<script>
    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;

        //监听提交
        form.on('submit(add)', function(data){
            console.log(data);
            //发异步，把数据提交给后端
            var imie =data.field.imie;
            var name =data.field.name;
            $.ajax({
                url:'${contextPath}/device/addDevice',
                data:{"imie":imie,"name":name},
                success:function(data){
                    if(data.code='0'){
                        layer.alert("增加成功", {icon: 6},function () {
                            // 获得frame索引
                            var index = parent.layer.getFrameIndex(window.name);
                            //关闭当前frame
                            parent.layer.close(index);
                        });
                    }
                    else{

                    }
                }
            });

            return false;
        });


    });
</script>

</body>

</html>