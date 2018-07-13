<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${HeaderMsg}</h1>
Student Name : ${student.studentName} <br>
Student Age : ${student.studentId} <br>
Student DOB : ${student.studentDob} <br>
student skills : <c:forEach items="${student.skills}" var="skill">
    <p>skill: ${skill}</p>
</c:forEach> 

Student IS TAX Payer : ${student.taxPayer} <br>

Student city : ${student.address.city} <br>


Student state : ${student.address.state} <br>


Student country: ${student.address.country}

</body>
</html>