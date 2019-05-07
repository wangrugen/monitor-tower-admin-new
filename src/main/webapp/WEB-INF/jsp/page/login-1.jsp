<%--
  User: rugen.wang
  Date: 2018/11/9
--%>
<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<%@ include file="/WEB-INF/jsp/common/tags.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>铁塔监控管理服务平台</title>
    <link href="${contextPath}/css/login.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="second_body">
    <form data-bind="submit:loginClick" id="commentForm" method="post">
        <div class="logo"></div>
        <div class="title-zh">铁塔监控管理服务平台</div>
        <div class="title-en" style="">Tower monitoring and management service platform</div>
        <div class="message" data-bind="html:message"></div>
        <table border="0" style="width:300px;">
            <tr>
                <td style="white-space:nowrap; padding-bottom: 5px;width:55px;">用户名：</td>
                <td colspan="2"><input type="text" id="userCode" class="login" data-bind="value:form.userCode" name="mobile" required/></td>
            </tr>
            <tr>
                <td class="lable" style="white-space:nowrap; letter-spacing: 0.5em; vertical-align: middle">密码：</td>
                <td colspan="2"><input type="password" id="password" class="login" data-bind="value:form.password" name ="password" required/></td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2"><input type="checkbox" data-bind="checked:form.remember"  name="rememberMe"/><span>系统记住我</span></td>
            </tr>
            <tr>
                <td colspan="3" style="text-align:center">
                    <input type="submit" value="登录" class="login_button" />
                    <input type="button" value="重置" class="reset_botton" data-bind="click:resetClick" />
                </td>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript" src="${contextPath}/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/jquery.cookie.js"></script>
<script type="text/javascript" src="${contextPath}/js/common.js"></script>
<script type="text/javascript" src="${contextPath}/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/messages_zh.js"></script>
<script type="text/javascript" src="${contextPath}/js/additional-methods.js"></script>
<script type="text/javascript" src="${contextPath}/js/layer.js"></script>

<script type="text/javascript">
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
       $(".reset_botton").click (function (){
         $("#userCode").val("");
         $("#password").val("");
       });



    });
</script>
</body>
</html>

