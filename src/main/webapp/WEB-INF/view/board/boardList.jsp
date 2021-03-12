<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title> I</title>


</head>
<h1> 게시판 목록 </h1>


<table>
    <tr>
        <th>seq</th>
        <th> 게시글 아이디</th>
        <th>부모 게시글 아이디</th>
        <th>게시물 그룹</th>
        <th>그룹 내 순서</th>
        <th>제목</th>
        <th>내용</th>
    </tr>

    <c:forEach items="${list}" var="val" varStatus="k">
        <tr>
            <td> ${k.count} /${k.index} </td>
            <td>

            ${val.id}
            </td>
               <td>${val.parent_id}</td>
               <td>${val.grpNum}</td>
               <td>${val.grpOrd}</td>
               <td>${val.title}</td>
               <td>${val.content}</td>
        </tr>
    </c:forEach>
    <%--        <c:if test="#{empty list}" >--%>
    <%--            ${"data가 존재하지 않는다"}--%>
    <%--        </c:if>--%>
</table>
</body>
</html>
