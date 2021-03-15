<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title> I</title>


</head>
<h1> 게시판 목록 </h1>


<table id ="tableId" border =1 >
        <th>1st seq</th>
        <th> 2nd 게시글 아이디</th>
        <th>3rd 부모 게시글 아이디</th>
        <th>4th 게시물 그룹 </th>
        <th>5th 그룹 내 순서</th>
        <th>6th 제목</th>
        <th>7th 내용</th>
<%--참고 링크 https://rwd337.tistory.com/164--%>
    <tbody class="text-center">
    <c:forEach items="${boardList}" var="boardList" varStatus="k" >
        var   = boardList.parent_id;
        var grpNum = boardList.grpNum;
        var grpOrd = boardList.grpOrd;
        var depth = boardList.depth;
        <tr> <a href="registerComment.jsp?idx=<%=parent_id%>"><%=title %>

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

    </tbody>
</table>
</body>
<script>

    function addRowHandler() {

        var table = document.getElementById('tableId');
        var rows = table.getElementsByTagName("tr");
        for (i = 0; i < rows.length; i++) {

                var currentRow = table.rows[i];
                // var createClickHandler = function (row) {
                //     return function () {
                //         var cell = row.getElementsByTagName("td")[0];
                //         var id = cell.innerHTML;
                //
                //         var cell1 = row.getElementsByTagName("td")[1];
                //         var id2 = cell1.innerHTML;
                //
                //         conosle.log(cell, cell1);
                //     };
                // };
                var createClickHandler = function(row) {
                    return function() {
                        var cell = row.getElementsByTagName("td")[0];
                        // check if not null
                        if(!cell) return; // no errors!
                        var id = cell.innerHTML;
                        alert("id:" + id);
                    };
                };
                currentRow.onclick = createClickHandler(currentRow);
        }
    }

    window.onload = addRowHandler();
</script>
</html>
