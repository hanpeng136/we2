<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改联系人</title>
 <script src="js/jquery.min.js"></script>
<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<form style="margin-left:600px;"action="ModifyContactServlet.do" method="post">
<input type="text" style="width:250px;display:none;"class="form-control" id="contact_id" name="contact_id" value="<%=request.getParameter("contact_id")%>">
    <div class="form-group">
    <label for="exampleInputEmail1">姓名</label>
    <input type="text" style="width:250px;"class="form-control" id="contact_name" name="contact_name" >
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">班级</label>
    <input type="text" style="width:250px;"class="form-control" id="contact_class" name="contact_class" >
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">学号</label>
    <input type="text" style="width:250px;"class="form-control" id="contact_stuID" name="contact_stuID" >
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">年龄</label>
    <input type="text" style="width:250px;"class="form-control" id="contact_age" name="contact_age">
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">生日</label>
    <input type="text" style="width:250px;"class="form-control" id="contact_birthday" name="contact_birthday" >
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">体重</label>
    <input type="text" style="width:250px;"class="form-control" id="contact_weight" name="contact_weight" >
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">电话</label>
    <input type="text" style="width:250px;"class="form-control" id="contact_phone" name="contact_phone" >
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">备注</label>
    <input type="text" style="width:250px;"class="form-control" id="contact_remarks" name="contact_remarks" >
  </div>
  <button type="submit" class="btn btn-default">提交</button>
</form>
</body>
</html>