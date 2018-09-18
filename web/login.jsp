<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="/params/login" method="post">
    用户名：<input type="text" name="user.username"> <br>
    密码：<input type="password" name="user.password"><br>
    <input type="submit" value="提交"/>
</form>


<hr>

<form action="/params/mlogin" method="post">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="提交"/>
</form>

<hr>

<form action="/interceptor/login" method="post">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>