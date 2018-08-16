<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<script src="js/jquery-1.8.2.min.js"></script> 
	<script src="js/bootstrap.min.js"></script>  
	
    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  
  <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" 
           uri="http://java.sun.com/jsp/jstl/functions" %>
    
    <script>
    function del() {
    	var msg = "您真的确定要删除吗？\n\n请确认！";
    	if (confirm(msg)==true){
    		alert("删除成功");
    	return true;
    	}else{
    	return false;
    	}
    	}
</script>
    
 <table class="table">
  <caption>用户表</caption>
  <thead>
    <tr>
      <th>编号</th>
      <th>姓名</th>
      <th>Email</th>
      <th>余额</th>
      <th></th>
      
      
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${finduser}" var="use">
    <tr>
      <td>${use.userId}</td>
      <td>${use.userName}</td>
      <td>${use.email}</td>
      <td>${use.money}</td>
      <td><a href="/ComperterShop/shop/admin/userdelete?&id=${use.userId}" onclick="javascript:return del();">删除</a>></td>
    </tr>
    </c:forEach>
    </br>
<!--     <div class="row" vertical-align = "center"> -->
<!--   <div class="col-md-8"></div> -->
<!--   <div class="col-md-2"> -->
 
<!--   <div class="col-md-2"> -->
<!--   </div> -->
<!-- </div> -->




  </tbody>
</table>
    

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </body>
</html>