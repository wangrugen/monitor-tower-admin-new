<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<%@ include file="/WEB-INF/jsp/common/tags.jsp" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>中北大学测试系统模块</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${contextPath}/css/font.css">
	<link rel="stylesheet" href="${contextPath}/css/xadmin.css">
    <script type="text/javascript" src="${contextPath}/js/jquery-1.8.0.min.js"></script>
    <script src="${contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${contextPath}/js/xadmin.js"></script>
    <script type="text/javascript" src="${contextPath}/js/jquery.validate.min.js"></script>

</head>
<body class="login-bg">
    
    <div class="login layui-anim layui-anim-up">
        <div class="message">中北大学测试系统-管理登录</div>
        <div id="darkbannerwrap"></div>
        
        <form method="post" class="layui-form" action ="${contextPath}/toLogin" id="commentForm">
            <input name="mobile"  id="userCode"  placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input  id="password" name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <hr class="hr20" >
        </form>
    </div>

    <script>
        $(function () {

            $("#commentForm").validate({
                showErrors: function (errorMap, errorList) {
                    var msg = "";
                    $.each(errorList, function (i, v) {
                        layer.tips(v.message , v.element, 3000);
                        return false;
                    });
                },
                submitHandler:function(form){
                    //直接form提交
                    //用户名
                    var userCode =$("#userCode").val();
                    var  passwd =$("#password").val();
                    var data = {"mobile":userCode,"password":passwd};

                    $.ajax({
                        type : "POST",  //提交方式
                        url : "${contextPath}/toLogin",//路径
                        data :data,
                        success : function(result) {
                            if(result!=null){
                                if(result.code=='1000'){
                                    window.location.href ="${contextPath}/index";
                                }else {
                                    layer.tips(result.message ,$("#userCode"), 3000);
                                }
                            }else {
                                layer.alert("登陆出错");
                            }

                        },
                        error :function(msg){
                            layer.alert("登陆出错请联系管理员");
                        }
                    });
                }
            });

        });
    </script>

    
    <!-- 底部结束 -->

</body>
</html>