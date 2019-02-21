<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20 
							<br />
							安全退出
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Salary
							</td>
							<td>
								Age
							</td>
							<td>
								Operation
							</td>
						</tr>
						<c:forEach var="emp" items="${requestScope.list}">
						<tr class="row2">
							<td>
								${emp.id}
							</td>
							<td>
								${emp.name}
							</td>
							<td>
								${emp.salary}
							</td>
							<td>
								${emp.age}
							</td>
							<td>
								<a href="${pageContext.request.contextPath}/emp/remove?id=${emp.id}">删除</a>&nbsp;<a href="${pageContext.request.contextPath}/emp/getById?id=${emp.id}">修改</a>
							</td>
						</tr>
						</c:forEach>
					</table>
					<p>
						<input type="button" class="button" value="添加员工" onclick="location='${pageContext.request.contextPath}/addEmp.jsp'"/>
					</p>
				</div>
				<a href="">1</a>
				<a href="">2</a>
				<a href="">3</a>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
