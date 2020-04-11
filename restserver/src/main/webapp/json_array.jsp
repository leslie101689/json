<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Json array</title>
</head>
<body>

<pre id="result"></pre>
<script type="text/javascript">
	var array = ['Json', 'REST', 'jQuery', 1, 2, 3, 4, true];
	
// 	alert(array[1]);
	
	document.getElementById("result").innerHTML = JSON.stringify (array, null, 2);
	
</script>



</body>
</html>