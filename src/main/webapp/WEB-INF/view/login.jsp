<%@ page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    var urlNew = "index"
    // ajax
    var t = document.getElementById('target')
    t.addEventListener('click',function(event){
        alert('Submit button clicked'+event.target.value)
        var request= $.ajax({
            url: "/user/loginPost"
            , async: false
            , method: 'POST'
            , data: JSON.stringify({"email": $('#email').val(), "password": $('#password').val()}),
            contentType: 'text/plain'
            , success: function (response) {
                if ( (response.resultCode) ==200 ){
//js자체 object니 jqueryx
                    window.location.href = urlNew ;

                } else {
                    alert(" login not verifed"+response.resultCode) ;
                }
                console.log(response);
            }
            ,contentType:"application/json; charset=utf-8"
            , dataType: "json"
        })




        <%--request.done(function(msg) {--%>
        <%--    $("#log").html(msg);--%>
        <%--    <c:redirect url="index"/>--%>

        <%--})--%>
        request.fail(function(textStatus) {
            alert("Request failed" +textStatus);
        })

    })




</script>




</html>