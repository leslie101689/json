<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>rest server</title>
</head>
<body>

Welcome rest server
<br/>
<a href="<%=request.getContextPath()%>/json_stringify.jsp">JSON Stringify</a>
<br/>
<a href="<%=request.getContextPath()%>/json_parse.jsp">JSON Parse</a>
<br/>
<a href="<%=request.getContextPath()%>/json_array.jsp">JSON Array</a>
<br/>
<a href="<%=request.getContextPath()%>/json_array_of_objects.jsp">JSON Array Of Object</a>
<br/>
<a href="<%=request.getContextPath()%>/json_nested_objects.jsp">JSON Nested Object</a>
</body>
</html>