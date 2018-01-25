<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>contactList</title>
 <script src="js/jquery.min.js"></script>
 <link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="js/index.js"></script>

<!-- 中部样式 -->
</head>
<body>
<table class="table table-bordered">
<tr>
<th>编号</th>
<th>姓名</th>
<th>班级</th>
<th>学号</th>
<th>年龄</th>
<th>生日</th>
<th>体重</th>
<th>电话</th>
<th>备注</th>
</tr>
<c:forEach items="${contactList}" var="contact" varStatus="index">
<tr>
<td>${contact.contact_id}</td>
<td>${contact.contact_name}</td>
<td>${contact.contact_class}</td>
<td>${contact.contact_stuID}</td>
<td>${contact.contact_age}</td>
<td>${contact.contact_birthday}</td>
<td>${contact.contact_weight}</td>
<td>${contact.contact_phone}</td>
<td>${contact.contact_remarks}</td>
<td><a style="text-decoration:none;" src="modifyContact.jsp">修改</a></td>
<td><a style="text-decoration:none;"han="${contact.contact_id}" class="del">删除</a></td>
</tr>
</c:forEach>				
</table>
</body>
</html>