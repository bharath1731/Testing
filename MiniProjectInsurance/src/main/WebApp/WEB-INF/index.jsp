<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix=""%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<style>
body {
	background-color: skyblue; /* Change to your preferred color */
}
</style>
</head>
<body>
	<div class="container">


		<h3 class="pb-3 pt-3">Report Application</h3>

		<form:form action="search" modelAttribute="search" method="post">

			<table>
				<tr>
					<td>Plan Name</td>
					<td><select />
						<option selected>select</option>
						<option value="1">Cash</option>
						<option value="2">Food</option>
						<option value="3">Medical</option>
						<option value="3">Employment</option> </select></td>

					<td>Plan Status</td>
					<td><select>


							<option>-select-</option>
							<option value="1">Approved</option>
							<option value="2">Denied</option>
							<option value="3">Terminated</option>

					</select></td>


					<td>Gender</td>

					<td><select>

							<option>-select-</option>
							<option>male</option>
							<option>fe-male</option>

							<select></td>

				</tr>
				<td>Start Date</td>
				<td><input type="date" name="startDate"></td>
				<td>End Date</td>
				<td><input type="date" name="endDate"></td>

				</tr>

				<tr>
					<td><input type="submit" value="search"
						class="btn btn-danger" /></td>

				</tr>

			</table>

		</form:form>

		<hr />
		<table class="table table-dark table-striped">
			<thread>
			<tr>
				<th>ID</th>
				<th>HolderNmae</th>
				<th>PlanName</th>
				<th>PlanStatus</th>
				<th>StartDate</th>
				<th>EndDate</th>
			</tr>
			</thread>
		</table>

		<hr />
		Exprort=<a href="">Excel</a> <a href="">Pdf</a>









	</div>








	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
