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
        <th>1st seq</th>
        <th> 2nd 게시글 아이디</th>
        <th>3rd 부모 게시글 아이디</th>
        <th>4th 게시물 그룹 </th>
        <th>5th 그룹 내 순서</th>
        <th>6th 제목</th>
        <th>7th 내용</th>
<%--참고 링크 https://rwd337.tistory.com/164--%>
    <tbody class="text-center">
    <c:forEach items="${boardList}" var="boardList" varStatus="k">
        <tr>
            <td>1st ${k.count} /${k.index} </td>
            <td>
                2nd${boardList.id}
            </td>
               <td>3rd ${boardList.parent_id}    </td>
               <td>4th ${boardList.grpNum}</td>
               <td>5th ${boardList.grpOrd}</td>
               <td>6th ${boardList.title}</td>
               <td>7th ${boardList.content}</td>
        </tr>
    </c:forEach>
    <c:if test="${boardList.depth == 0}">
        <c:if test="${boardList.}"
    </c:if>

    </tbody>
</table>
</body>
</html>
