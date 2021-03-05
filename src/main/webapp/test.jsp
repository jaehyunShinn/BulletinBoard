<%@ page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
    <body>
        hello this is jsp page<br/>
        <%
            String a = "ttttt";

            String bb = request.getParameter("bb");
            Enumeration params = request.getParameterNames() ;

            while(params.hasMoreElements()) {
                String name = (String) params.nextElement();
                System.out.println(name + ":" + request.getParameter(name)+ " ");
            }
        %>
        a=<%=a%>
        b=<%=bb%>
    </body>
</html>