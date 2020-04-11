<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jquery json get</title>

<script src="<%=request.getContextPath()%>/js/jquery-3.5.0.min.js" type="text/javascript"></script>

</head>
<body>

<button id="submitButton">json get</button>

<pre id="result"></pre>

<script type="text/javascript">
	
	$(document).ready(function() {
		
		$("#submitButton").click(function() {
			
// 			alert('submit buttion is clicked');
			
			$.ajax({
				
				url: "<%=request.getContextPath()%>/rest/jsonUdemyStudent",
				type: "GET",
				success: function(response) {
					console.log(response);
					document.getElementById("result").innerHTML = JSON.stringify(response, null, 2);
					//alert("Success: " + response);
				},
				error: function(jqXHR, textStatus, errorThrown) {
					console.error(errorThrown);
					alert("Error: " + errorThrown);
				}
			});
		});
	});

</script>

</body>
</html>