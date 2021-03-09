<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

    <title>application 속성 지정</title>
</head>
<body class="hold-transition login-page">
<div class="login-logo">
    <a href="${path}/">


    </a>
</div>

<div class=" register-box-body">

    <p class="login-box-msg">메인 페이지</p>
    <form action="${path}/user/register" method="post">
        <div class="">
            <input type="text" name="userId" placeholder="아이디">
            <span class="form-control-feedback"> </span>
        </div>


    </form>

</div>

<%
    try {
        int value = (int) application.getAttribute("value");
        value += 10;
        application.setAttribute("value", value);
%>
<h1><%=value %>
</h1>
<%
} catch (NullPointerException e) {
%>


<%
    }
%>

</body>

</html>