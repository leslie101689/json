<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Json parse</title>
</head>
<body>

<pre id="result"></pre>
<script type="text/javascript">

	
	var jsonUdemyLecture = "{\"id\": 1," +
			  "\"name\": \"JSON with Java\"," +
			  "\"nameLine2\": \"Json and Java Lecture\"," +
			  "\"description\": \"Udemy Lecture\"," +
			  "\"enabled\": true}";
	
	console.log(jsonUdemyLecture);
	
	var udemyLecture = JSON.parse(jsonUdemyLecture);

	document.getElementById("result").innerHTML = "id: " + udemyLecture.id + " name: " + udemyLecture.name +
												  " nameLine2: " + udemyLecture.nameLine2 + " description: " + udemyLecture.description +
												  " enabled: " + udemyLecture.enabled;
	
</script>



</body>
</html>