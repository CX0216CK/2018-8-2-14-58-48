<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/21
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>登录</h2>
<form action="/re" method="POST">
    用户名:<input name="uname" value="${uname}">
    年龄:<input name="age" value="${age}">
    手机号 : <input name="userPhone"  value="${userPhone}">
    邮箱 : <input name="userEmail" value="${userEmail}">
        <input type="submit" value="登录"/>
</form>
</body>
</html>
