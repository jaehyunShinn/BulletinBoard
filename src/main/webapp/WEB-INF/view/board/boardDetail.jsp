<%@page import="java.io.PrintWriter" %>
<%@ page import="java.io.Console" %>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    게시글 상세보기 페이지
</head>

<body>
<h1>
<div> 제목
    ${boardDetail.title}
</div>
</h1>
<br>
<br>
<br>
<br>
<div>  글 내용
    ${boardDetail.content}
</div>


<input type="button" id="goToRegisterComment" value="답글쓰기"/>

<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script type="text/javascript">
    var registerCommentBtn = document.getElementById('goToRegisterComment');
    registerCommentBtn.addEventListener('click',goView('${boardDetail.id}'));

    function goView(id){
        return function() {
        document.location.href="registerSub?id="+id;
    }
    }
</script>
</body>

