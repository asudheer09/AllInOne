<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>

</head>
<body>
	<c:if test="${not empty empList}">

		<table id="customers">
			<tr>
				<th>Emp Id</th>
				<th>Emp Last Name</th>
				<th>Emp First Name</th>
			</tr>
				<c:forEach var="emp" items="${empList}">
					<tr>
						<td>${emp.id}</td>
						<td>${emp.lastName}</td>
						<td>${emp.firstName}</td>
					</tr>
				</c:forEach>
		</table>

	</c:if>

</body>
</html>