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
        $.ajax({

            url: "/user/loginPost"
            , async: false
            , method: 'POST'
            , data: JSON.stringify({"email": $('#email').val(), "password": $('#password').val()}),
            contentType: 'text/plain'
            , success: function (response) {
                console.log(response);
            }
            ,contentType:"application/json; charset=utf-8"
            , dataType: "json"
        })
    })




</script>




</html>