<%@include file="CommonHeader.jsp" %>

<h3 align="center">Add User</h3>

<form action="<c:url value="/insertUser"/>" method="post">
<div class="table-responsive">
<table align="center" class="table table-bordered">
	<tr>
		<td>Category Name</td>
		<td><input type="text" name="uName"/></td>
	</tr>
	<tr>
		<td>Category Desc</td>
		<td><textarea cols="40" rows="5" name="catDesc"></textarea></td>
	</tr>
	<tr>
		<td colspan="2">
			<center>
			<input type="submit" value="Insert Category" class="btn btn-info"/>
			</center>
		</td>
	</tr>
</table>
</div>
</form>


</div>
</body>
</html>