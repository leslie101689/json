<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Json array of objects</title>
</head>
<body>

<pre id="result"></pre>
<script type="text/javascript">
	var arrayOfObjects = {
			udemyLectures: [
					{id: 1,name: 'JSON with Java',nameLine2: '',description: 'Udemy Lecture',enabled: true},
					{id: 2,name: 'Java Spring MVC',nameLine2: '',description: 'Udemy Lecture',enabled: true},
					{id: 3,name: 'Java Spring MVC and Hibernate',nameLine2: '',description: 'Udemy Lecture',enabled: true},
					{id: 4,name: 'JSON with REST',nameLine2: '',description: 'Udemy Lecture',enabled: true}
			]
	};
	
// 	alert(arrayOfObjects.udemyLectures[0].name);
	
	document.getElementById("result").innerHTML = JSON.stringify (arrayOfObjects, null, 2);
	
</script>



</body>
</html>