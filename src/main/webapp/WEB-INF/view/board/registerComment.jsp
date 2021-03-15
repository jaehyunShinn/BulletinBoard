<%@page import="java.io.PrintWriter" %>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    글쓰기 페이지
</head>
<body>

    <h1>Login</h1>

    <div type="text" placeholder="Title" required="" id="title" name="title"
           style="width:700px;height:100px;font-size:20px;"/>
    </br>
    <div type="text" placeholder="Content" required="" id="content" name="content"
           style="width:800px;height:500px;font-size:15px;"/>

        <input type="hidden" name="parent_id" value="글쓰기"/>
        <input type="hidden" id="" value="글쓰기"/>
        <input type="hidden" id="" value="글쓰기"/>
    <form action="boardPost" method="post">
        <div type="text" placeholder="Title" required="" id="comment" name="title"
             style="width:700px;height:100px;font-size:20px;"/>
        </br>

        <div>
            <input type="button" id="registerCommentButton" value="답글등록">
        </div>
    </form>

</body>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
        crossorigin="anonymous"></script>

<script>
    var t = document.getElementById('registerCommentButton')
    t.addEventListener('click',function(event) {
        var request = $.ajax({

            url:"/board/registerSub",async:false,method:'POST',
            data:JSON.stringify({

            }),
            success: function (response) {
                if ( (response.resultCode) ==200 ){
//js자체 object니 jqueryx
                    // window.location.href = urlNew ;

                } else {
                    alert(" login not verifed"+response.resultCode) ;
                }
                console.log(response);
            },
            contentType: "application/json; charset=utf-8",
            dataType:"json"
        })
    })
    function
</script>


