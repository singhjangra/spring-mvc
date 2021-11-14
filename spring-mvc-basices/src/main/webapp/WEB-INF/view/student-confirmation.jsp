<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}
	And lives in ${student.country}
	And his favouriteLanguage is ${student.favouriteLanguage }
	and he loves to work on ${student.operatingSystems }
	
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems }">
			<li>${temp}</li>
		</c:forEach>
		</ul>
</body>

</html>







