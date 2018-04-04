<%--<html>--%>
<%--<body>--%>
<%--<h2>Hello World!</h2>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="./css/style.css" type="text/css">

    <title>Login</title>

</head>

<body>
<h2 style="text-align:center;margin-left:auto;margin-right:auto;color:red;">Login</h2>

<div id="loginForm">
    <s:form action="login" namespace="/myuser">
        <s:textfield   name="myuser.username" label="用户名%{getText('username')}"></s:textfield>

        <s:password name="myuser.password" label="密  码%{getText('password')}"></s:password>

        <s:submit name="submit" value="确  定%{getText('submit')}" style="text-align:center;margin-left:auto;margin-right:auto;"></s:submit>

    </s:form>
</div>

</body>
</html>
