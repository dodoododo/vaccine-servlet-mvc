<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, com.cnw.model.bean.VacXin" %>

<%-- Include layout --%>
<jsp:include page="/view/layout.jsp"/>

<h2 class="mb-3">Danh sách vắc xin</h2>

<form action="vacxin" method="get" class="row mb-3">
    <input type="hidden" name="action" value="search">
    <div class="col-md-6">
        <input type="text" name="keyword" class="form-control" placeholder="Tìm theo mã hoặc tên vắc xin">
    </div>
    <div class="col-md-2">
        <button class="btn btn-primary w-100">Tìm kiếm</button>
    </div>
    <div class="col-md-2">
        <a href="vacxin?action=create" class="btn btn-success w-100">+ Thêm vắc xin</a>
    </div>
</form>

<table class="table table-bordered table-hover">
    <thead class="table-dark">
    <tr>
        <th>Mã</th>
        <th>Tên vắc xin</th>
        <th>Số mũi</th>
        <th>Giá</th>
        <th>Hãng SX</th>
        <th>Mô tả</th>
        <th>Hành động</th>
    </tr>
    </thead>

    <tbody>
    <%
        List<VacXin> list = (List<VacXin>) request.getAttribute("vacxinList");
        if (list != null && !list.isEmpty()) {
            for (VacXin v : list) {
    %>
    <tr>
        <td><%= v.getMaVacxin() %></td>
        <td><%= v.getTenVacxin() %></td>
        <td><%= v.getSoMui() %></td>
        <td><%= v.getGiaVacxin() %></td>
        <td><%= v.getTenHangSX() %></td>
        <td><%= v.getMoTa() %></td>
        <td>
            <a href="vacxin?action=edit&id=<%= v.getMaVacxin() %>" class="btn btn-warning btn-sm">Sửa</a>
        </td>
    </tr>
    <%      }
        } else { %>
    <tr>
        <td colspan="7" class="text-center text-danger">Không có dữ liệu</td>
    </tr>
    <% } %>
    </tbody>
</table>

</div> <%-- Close container from layout.jsp --%>
</body>
</html>
