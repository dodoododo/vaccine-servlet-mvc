<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.cnw.model.bean.VacXin" %>

<%
    VacXin v = (VacXin) request.getAttribute("vacxin");
%>

<html>
<head>
    <title>Sửa vắc xin</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"/>
</head>

<body class="container mt-4">

<h2>Sửa thông tin vắc xin</h2>

<form action="vacxin" method="post" class="mt-3">

    <input type="hidden" name="action" value="edit"/>

    <label class="form-label">Mã vắc xin:</label>
    <input name="MaVacxin" class="form-control" value="<%= v.getMaVacxin() %>" readonly/>

    <label class="form-label mt-2">Tên vắc xin:</label>
    <input name="TenVacxin" class="form-control" value="<%= v.getTenVacxin() %>" required/>

    <label class="form-label mt-2">Số mũi:</label>
    <input type="number" name="SoMui" class="form-control" 
           value="<%= v.getSoMui() %>" required/>

    <label class="form-label mt-2">Giá vắc xin:</label>
    <input type="number" step="0.01" name="GiaVacxin" class="form-control"
           value="<%= v.getGiaVacxin() %>" required/>

    <label class="form-label mt-2">Hãng sản xuất:</label>
    <input name="TenHangSX" class="form-control" value="<%= v.getTenHangSX() %>" required/>

    <label class="form-label mt-2">Mô tả:</label>
    <textarea name="MoTa" class="form-control"><%= v.getMoTa() %></textarea>

    <button class="btn btn-warning mt-3">Cập nhật</button>
    <a href="vacxin" class="btn btn-secondary mt-3">Quay lại</a>

</form>

</body>
</html>
