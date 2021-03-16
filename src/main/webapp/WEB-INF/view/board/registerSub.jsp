<%@page import="java.io.PrintWriter" %>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    답글쓰기 페이지
</head>
<body>
<form action="boardPost" method="post">
    <h1>Login</h1>
    <input type="text" placeholder="Title" required="" id="title" name="title"
           style="width:700px;height:100px;font-size:20px;"/>
    </br>
    <input type="text" placeholder="Content" required="" id="content" name="content"
           style="width:800px;height:500px;font-size:15px;"/>
    <div>
        <input type="button" id="registerReplyButton" value="답글쓰기"/>
    </div>
</form>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
        crossorigin="anonymous"></script>
<script>
    var urlSubBoardPost = "boardList"
    var registerReplyButton = document.getElementById('registerReplyButton')
    registerReplyButton.addEventListener('click', function (event) {
        var request = $.ajax({
            url: "/board/subPost",
            async: false,
            method: 'POST',
            data: JSON.stringify({
               "parent_id":${param.id},
               "title": $('#title').val(),
               "content": $('#content').val()
            }),
            success: function (response) {
                if ((response.resultCode) == 200) {
                    window.location.href = urlSubBoardPost;
                } else {
                    if(!response.resultMsg){
                        alert("글 등록 시 애러가 발생하였습니다.");
                    }else {
                        alert(response.resultMsg);
                    }
                }
                console.log(response);
            },
            contentType: "application/json; charset=utf-8",
            dataType: "json",
        })
    })

</script>
</html>
