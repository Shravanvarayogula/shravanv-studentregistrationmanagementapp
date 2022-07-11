<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<title>List All Students</title>
</head>
<body>

	<table>
		<p>Student Information</p>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Course</th>
			<th>Country</th>
		</tr>

		<c:forEach var="tempstudent" items="${student}">
			<c:url var="updateLink" value="/student/printstudent">
				<c:param name="studentId" value==${tempstudent.id} " />
			</c:url>


			<c:url var="deletelink" value="/student/printstudent">
				<c:param name="studentId" value==${tempstudent.id} "/>
			</c:url>
			<tr>
				<td>${tempstudent.firstname}</td>
				<td>${tempstudent.lastname}</td>
				<td>${tempstudent.course}</td>
				<td>${tempstudent.country}</td>
			</tr>
			<td><a href="${updatelink}"> Update </a> <a href="${deletelink}" onclick="if(!(confirm("Are you Sure ?"))) return false">Delete
			</a></td>

		</c:forEach>
	</table>
</body>

</html>