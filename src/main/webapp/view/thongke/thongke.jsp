<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="/view/layout.jsp"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh sách khách hàng</title>
    <style>
        table { width: 90%; margin: 20px auto; border-collapse: collapse; }
        th, td { padding: 10px; border: 1px solid #444; }
        th { background: #eee; }
        a.button { text-decoration: none; padding: 5px 10px; background: #28a745; color: white; border-radius: 4px; }
    </style>
</head>
<body>
<h2 style="text-align:center">DANH SÁCH KHÁCH HÀNG</h2>

<table>
    <tr>
        <th>Mã KH</th>
        <th>Tên Khách Hàng</th>
        <th>Địa Chỉ</th>
        <th>Tổng Tiền Đã Trả</th>
        <th>Lịch Sử Tiêm</th>
    </tr>

    <c:forEach var="tk" items="${thongKeList}">
        <tr>
            <td>${tk[0]}</td>
            <td>${tk[1]}</td>
            <td>${tk[2]}</td>
            <td>${tk[3]}</td>
            <td>
                <a class="button" href="${pageContext.request.contextPath}/lichsu?maKH=${tk[0]}">Xem lịch sử</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
