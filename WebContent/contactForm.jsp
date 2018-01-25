<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查找联系人</title>
 <script src="js/jquery.min.js"></script>
<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="js/index.js"></script>
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
<c:choose>
<c:when test="${contact_stuID== null or contact_stuID==''}">
<tr>
<td>暂无</td>
<td>暂无</td>
<td>暂无</td>
<td>暂无</td>
<td>暂无</td>
<td>暂无</td>
<td>暂无</td>
<td>暂无</td>
<td>暂无</td>
</tr>          
</c:when>
<c:otherwise>
<c:forEach items="${contactList}" var="contactList" varStatus="index">
<tr>
<td>${contactList.contact_id}</td>
<td>${contactList.contact_name}</td>
<td>${contactList.contact_class}</td>
<td>${contactList.contact_stuID}</td>
<td>${contactList.contact_age}</td>
<td>${contactList.contact_birthday}</td>
<td>${contactList.contact_weight}</td>
<td>${contactList.contact_phone}</td>
<td>${contactList.contact_remarks}</td>
<td><a style="text-decoration:none;"peng="${contactList.contact_id}" class="up">修改</a></td>
<td><a style="text-decoration:none;"han="${contactList.contact_id}" class="del">删除</a></td>
</tr>
</c:forEach>
 
</c:otherwise>
</c:choose> 
</table>
</body>
</html>