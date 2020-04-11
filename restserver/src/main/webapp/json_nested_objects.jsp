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
		
	var udemyLecture = {
			id:1,
			name:'JSON with Java',
			nameLine2:'Udemy Lecture',
			desc:'',
			enabled: true,
			information: {
				quizQuestions: [],
				linkLecture: 'http://udemy.com/udemyLectureJson'
			}
	};
	
// 	alert(arrayOfObjects.udemyLectures[0].name);
	
	document.getElementById("result").innerHTML = JSON.stringify (udemyLecture, null, 2);
	
</script>



</body>
</html>