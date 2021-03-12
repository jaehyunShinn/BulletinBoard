<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%
request.setCharacterEncoding("UTF-8");>
%> --%>
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

<%

%>
<c:choose>
    <c:when test="${not empty sessionScope.userInfo}">
        ${userInfo.email} 님 환영합니다..
        <div id="boardPageBtn" type="button" onclick="buttonClick()"> 게시판으로 이동 :: <br/>
        </div>
    </c:when>

    <c:otherwise>
        <div id="loginPageBtn" type="button" onclick="buttonClick()"> Login :: <br/>

        </div>
    </c:otherwise>
</c:choose>


</body>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
        crossorigin="anonymous"></script>
<script>
    $('#loginPageBtn').click(function () {
        // var request = $.ajax({"/login"})
        location.href = "/login";
    });

    $('#boardPageBtn').click(function () {

        location.href = "/board/boardList";
    })


</script>
</html>