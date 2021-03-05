<%@ page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>


</head>
<body>


    <form action="Login" method="post">
        <h1>Login</h1>

        <input type="text" placeholder="Email" required="" id="email" name="email" />

        <input type="password" placeholder="Password" required="" id="password" name="password" />


        <div>
            <input type="button" id="target"  value="Login" />
        </div>
    </form><!-- form -->
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script>

    // ajax
    var t = document.getElementById('target')
    t.addEventListener('click',function(event){
        alert('Submit button clicked'+event.target.value)
        $.ajax("/user/loginPost", {"email":$("#email").val() , "password": $("#password").val()}, function(response){
            console.log(response);    //헤더 바디 url등 model 속성까지
        }, "json");
    })




</script>




</html>