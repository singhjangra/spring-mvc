<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />

		<br>
		<br>
		<%-- Country: <form:select path="country">
				<form:option value="India" label="India"></form:option>
				<form:option value="USA" label="USA"></form:option>
				<form:option value="PAK" label="PAK"></form:option>
				<form:option value="UK" label="UK"></form:option>
				<form:option value="GER" label="GER"></form:option>
		</form:select> 
		--%>
		Country: <form:select path="country">
				<form:options items="${student.countryOptions}" />
			    </form:select>
		<br>
		<br>	
		Favourite Programming Language: 
		Java <form:radiobutton path="favouriteLanguage" value="Java"/>
		C# <form:radiobutton path="favouriteLanguage" value="C#"/>
		C <form:radiobutton path="favouriteLanguage" value="C"/>
		Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
		<br>
		<br>	
		Operating System: 
		<form:checkbox path="operatingSystems" value="Linux" label="Linux"/>
		<form:checkbox path="operatingSystems" value="Windows" label="Windows"/>
		<form:checkbox path="operatingSystems" value="Mac" label="Mac"/>
		<form:checkbox path="operatingSystems" value="Android" label="Android"/>
			
		<br>
		<br>	
		<input type="submit" value="Submit" />

	</form:form>


</body>

</html>












