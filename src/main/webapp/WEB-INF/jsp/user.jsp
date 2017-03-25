<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="//code.jquery.com/jquery-3.2.0.min.js"></script>
<title>Insert title here</title>
</head>
<body>
  <table border="1">
    <thead>
      <tr>
        <th>用户编号</th>
        <th>用户名称</th>
        <th>密码</th>
        <th>邮箱</th>
        <th>操作</th>
      </tr>
    </thead>
    
    <tbody>
      <c:forEach items="${user}" var="userList">
        <tr>
          <td>${userList.userId}</td>
          <td>${userList.userName}</td>
          <td>${userList.userPassword}</td>
          <td>${userList.userEmail}</td>
          <td><a href="#">删除</a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>