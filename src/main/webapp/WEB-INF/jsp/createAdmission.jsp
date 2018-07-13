<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<h1>${HeaderMsg}</h1>
<body>
<form:errors path="student.*"></form:errors>
<form action="submitForm" method="post">
<table>
<tr>
<td>Student No</td>
<td><input type="text" name="studentId"></td>
</tr>
<tr>
<td>Student Name</td>
<td><input type="text" name=studentName></td>
</tr>

<tr>
<td>Student DOB</td>
<td><input type="text" name=studentDob></td>
</tr>

<tr>
<td>Student Skills</td>
<td>
<select name="skills" multiple="multiple">
<option value="spring">Spring</option>
<option value="hibernate">hibernate</option>
<option value="structs">structs</option>
<option value="RestFull Webservices">RestFull Webservices</option>
</select>
</td>
</tr>

<tr>
<td>Is Tax Payer</td>
<td><input type="checkbox" name="taxPayer"></td>
</tr>

<tr>
<td>Student city</td>
<td><input type="text" name="address.city"></td>
</tr>

<tr>
<td>Student state</td>
<td><input type="text" name="address.state"></td>
</tr>


<tr>
<td>Student country</td>
<td><input type="text" name="address.country"></td>
</tr>



<tr>
<td><input type="submit" name="Submit"></td>
<td><input type="reset" name="Reset"></td>
</tr>

</table>

</form>
<a href="getEmployess">getEmps</a>

</body>
</html>