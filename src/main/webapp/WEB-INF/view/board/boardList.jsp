<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title> I</title>
    <style>
        #tableId tr td {
            width:60px;
        }
    </style>

</head>
<h1> 게시판 목록 </h1>

<div style="width:900px">
    <table id="tableId" border=1 style="width:100%">
        <th>아이디</th>
        <th>부모 아이디</th>
        <th>그룹</th>
        <th>그룹 내 순서</th>
        <th>depth</th>
        <th style="width:500px;">제목</th>
        <%--참고 링크 https://rwd337.tistory.com/164--%>
        <tbody class="text-center">
        <c:forEach items="${boardList}" var="board" varStatus="k">
            <tr onclick="goView('${board.id}')">
                <td>
                    ${board.id}
                </td>
                <td>${board.parent_id}</td>
                <td>${board.grpNum}</td>
                <td>${board.grpOrd}</td>
                <td>${board.depth}</td>
                <td>
                    <c:forEach begin="1" end="${board.depth}">&nbsp;&nbsp;&nbsp;&nbsp;</c:forEach>
                    ${board.title}
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
    <div style="text-align: right; padding-top: 10px;">
        <button type="button" onclick="goRegister()">글쓰기</button>
    </div>
</div>
</body>
<script>
    function goView(id) {
        document.location.href = "boardDetail?id=" + id;
    }

    function goRegister(){
        document.location.href = "registerBoard";
    }
</script>
</html>
