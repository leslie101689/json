<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Json stringify</title>
</head>
<body>

<pre id="result"></pre>
<script type="text/javascript">
	var udemyLecture = {
			id: 1,
			name: 'JSON with Java',
			nameLine2: 'Json and Java Lecture',
			description: 'Udemy Lecture',
			enabled: true
	}
	
	var jsonUdemyLecture = JSON.stringify(udemyLecture, null, 2);
	
	console.log(jsonUdemyLecture);

	document.getElementById("result").innerHTML = jsonUdemyLecture;
	
</script>



</body>
</html>