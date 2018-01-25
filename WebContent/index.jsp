<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
 <script src="js/jquery.min.js"></script>
<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
function f1(){
	window.location.href="AllContactServlet.do";
}
function f2(){
	window.location.href="addContact.jsp";
}

</script>
</head>
<body>
<button type="button" class="btn btn-success" onclick="f1();">查看全部联系人信息</button>
<button type="button" class="btn btn-info" onclick="f2();">添加联系人</button><br><br>
<form action="contactFormServlet.do" method="post">
<input type="text" style="width:250px; display:inline;"class="form-control" id="search" name="contact_stuID" >&nbsp;<button type="sumbit" class="btn btn-primary" onclick="f3();">查找联系人</button>
</form>
</body>
</html>