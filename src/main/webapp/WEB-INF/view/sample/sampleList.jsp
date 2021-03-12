<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%><%@
        taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h1>sample LIST</h1>

<table>
    <tr>
        <th>seq</th>
        <th>아이디</th>
        <th>이름</th>
        <th>나이</th>
        <th>비고</th>
        <th>등록일</th>
    </tr>

<c:forEach items="${list}" var="sample" varStatus="k">
    <tr>
        <td>${k.count} / ${k.index}</td>
        <td>${sample.id}</td>
        <td>${sample.name}</td>
        <td>${sample.age}</td>
        <td>${sample.notice}</td>
        <td>${sample.crt_date}</td>
    </tr>
</c:forEach>
</table>
</body>

</html>