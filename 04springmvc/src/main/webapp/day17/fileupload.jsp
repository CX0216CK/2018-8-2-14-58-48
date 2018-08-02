<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/25
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<h1>文件上传</h1>
<form action="/mvc/first" method="post" enctype="multipart/form-data">
        文件1<input type="file" name="upload"/>
                 <input type="submit"/>
</form>
</body>
</html>
