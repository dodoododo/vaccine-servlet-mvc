<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="/view/layout.jsp"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lịch sử tiêm phòng</title>
    <style>
        table { width: 90%; margin: 20px auto; border-collapse: collapse; }
        th, td { padding: 10px; border: 1px solid #333; }
        th { background: #ddd; }
    </style>
</head>
<body>
<h2 style="text-align:center">LỊCH SỬ TIÊM PHÒNG CỦA KHÁCH HÀNG</h2>

<h3 style="text-align:center">
    Mã KH: <strong>${khachHang.maKH}</strong> –
    Tên KH: <strong>${khachHang.hoTenKH}</strong>
</h3>

<table>
    <tr>
        <th>Mã KH</th>
        <th>Tên KH</th>
        <th>Tên Bệnh</th>
        <th>Mã Vắc Xin</th>
        <th>Tên Vắc Xin</th>
        <th>Tổng số mũi cần tiêm</th>
    </tr>

    <c:forEach var="ls" items="${lichSu}">
        <tr>
            <td>${ls.maKH}</td>
            <td>${ls.tenKH}</td>
            <td>${ls.tenBenh}</td>
            <td>${ls.maVacxin}</td>
            <td>${ls.tenVacxin}</td>
            <td>${ls.tongSoMui}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
